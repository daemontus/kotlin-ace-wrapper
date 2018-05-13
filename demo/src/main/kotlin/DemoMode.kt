import ace.EditSession
import ace.Editor
import ace.Tokenizer
import ace.WorkerInit
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
/*
        val initData = WorkerInit(
            dependencies = arrayOf(
                    "$pathPrefix/lib/kotlin-stdlib-js-1.2.41/kotlin.js",
                    "$pathPrefix/lib/ace-common-1.0.0/ace-common.js",
                    "$pathPrefix/lib/ace-worker-1.0.0/ace-worker.js",
                    "$pathPrefix/lib/ace"
            )
        )*/
        return null
    }
}