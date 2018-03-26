package ace.internal

import ace.Document
import ace.constructor5Arg

external interface WorkerClientModule {
    @JsName("WorkerClient")
    val workerClient: JsClass<WorkerClient>
}

fun JsClass<WorkerClient>.new(
        topLevelNamespaces: Array<String>,
        mod: String,
        classname: String,
        workerUrl: String,
        importScripts: String
): WorkerClient {
    return constructor5Arg(this, topLevelNamespaces, mod, classname, workerUrl, importScripts)
}

external interface WorkerClient : EventEmitter {

    fun attachToDocument(document: Document)

}