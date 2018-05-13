package ace

import ace.internal.WorkerClient

val Events.ScrollBar_scroll: String
    get() = "scroll"

val Events.EditSession_change: String
    get() = "change"

val Events.EditSession_changeAnnotation: String
    get() = "changeAnnotation"

val Events.EditSession_changeBackMarker: String
    get() = "changeBackMarker"

val Events.EditSession_changeFrontMarker: String
    get() = "changeFrontMarker"

val Events.EditSession_changeBreakpoint: String
    get() = "changeBreakpoint"

val Events.EditSession_changeFold: String
    get() = "changeFold"

val Events.EditSession_changeMode: String
    get() = "changeMode"

val Events.EditSession_changeOverwrite: String
    get() = "changeOverwrite"

val Events.EditSession_changeScrollLeft: String
    get() = "changeScrollLeft"

val Events.EditSession_changeScrollTop: String
    get() = "changeScrollTop"

val Events.EditSession_changeTabSize: String
    get() = "changeTabSize"

val Events.EditSession_changeWrapLimit: String
    get() = "changeWrapLimit"

val Events.EditSession_changeWrapMode: String
    get() = "changeWrapMode"

val Events.EditSession_tokenizerUpdate: String
    get() = "tokenizerUpdate"

val Events.BackgroundTokenizer_update: String
    get() = "update"

/**
 * Start a new [WorkerClient] using the provided worker-init.js script.
 *
 * - [workerClassName] Class name of the worker which will be started. *Don't forget to register the worker class
 * in your main method!*
 * - [workerInitUrl] Url of the worker-init.js script.
 * - [dependencies] Array of urls which should be loaded before the main method is executed.
 */
fun startWorkerClient(
        workerClassName: String,
        workerInitUrl: String,
        dependencies: Array<String>
): WorkerClient = WorkerClient(
        topLevelNamespaces = arrayOf("ace"),
        mod = "ace/worker/$workerClassName",
        classname = workerClassName,
        workerUrl = workerInitUrl,
        importScripts = JSON.stringify(dependencies)
)