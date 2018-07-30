package ace.worker

import ace.Document
import ace.lib.EventEmitter

@JsModule("kotlin-ace-loader!?id=ace/worker/worker_client&name=WorkerClient")
external class WorkerClient(
        topLevelNamespaces: Array<String>,
        mod: String,
        classname: String,
        workerUrl: String,
        importScripts: String
) : EventEmitter {

    fun attachToDocument(document: Document)

    fun terminate()

    fun send(command: dynamic, args: dynamic)

    fun call(command: dynamic, args: dynamic, callback: dynamic)

    interface Event<T> {
        val data: T
    }
}