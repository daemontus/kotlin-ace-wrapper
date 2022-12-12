import ace.*
import ace.mode.Mode
import ace.worker.WorkerClient

/**
 * A simple mode which replaces internal rule-based tokenizer with our custom implementation and
 * starts our syntax checking demo worker on demand.
 */
class DemoMode(
        private val editor: Editor
) : Mode() {

    override fun getTokenizer(): Tokenizer<*, *> = DemoTokenizer

    override fun createWorker(session: EditSession): WorkerClient? {
        println("Creating worker.")

        // start client with all dependencies
        val client = startWorkerFromBundle("DemoWorker", "demo-worker.js")

        // listen on error events from our parenthesis checking workers
        client.on<WorkerClient.Event<Array<GutterAnnotation>>>("errors") { event ->
            editor.getSession().setAnnotations(event.data)
        }

        client.attachToDocument(session.getDocument())

        return client
    }
}