import ace.*
import ace.internal.TextMode
import ace.internal.WorkerClient
import kotlin.browser.window

/**
 * A simple mode which replaces internal rule-based tokenizer with our custom implementation and
 * starts our syntax checking demo worker on demand.
 */
class DemoMode(
        private val editor: Editor
) : TextMode() {

    override fun getTokenizer(): Tokenizer<*, *> = DemoTokenizer

    override fun createWorker(session: EditSession): WorkerClient? {
        println("Creating worker.")

        // get current url minus the file name
        val pathPrefix = window.location.href.replace(Regex("[^/]*\$"), "")

        // start client with all dependencies
        val client = startWorkerClient(
                workerClassName = "DemoWorker",
                workerInitUrl = "$pathPrefix/lib/ace-worker-1.3.1-0/worker-init.js",
                dependencies = arrayOf(
                        // Kotlin
                        "$pathPrefix/lib/kotlin-stdlib-js-1.2.41/kotlin.js",

                        // ace-worker
                        "$pathPrefix/lib/ace-worker-1.3.1-0/ace-classes.js",
                        "$pathPrefix/lib/ace-worker-1.3.1-0/class-loader.js",
                        "$pathPrefix/lib/ace-common-1.3.1-0/ace-common.js",
                        "$pathPrefix/lib/ace-worker-1.3.1-0/ace-worker.js",

                        // demo-worker
                        "$pathPrefix/lib/demo-worker-1.3.1-0/demo-worker.js"
                )
        )

        // listen on error events from our parenthesis checking workers
        client.on<dynamic>("errors") { event ->
            editor.getSession().setAnnotations(event.data as Array<*>)
        }

        client.attachToDocument(editor.getSession().getDocument())

        return client
    }
}