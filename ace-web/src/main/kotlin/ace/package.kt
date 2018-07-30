package ace

import ace.worker.WorkerClient

val ScrollBar.EVENT_SCROLL: String
    get() = "scroll"

val EditSession.EVENT_CHANGE: String
    get() = "change"

val EditSession.EVENT_CHANGE_ANNOTATION: String
    get() = "changeAnnotation"

val EditSession.EVENT_CHANGE_BACK_MARKER: String
    get() = "changeBackMarker"

val EditSession.EVENT_CHANGE_FRONT_MARKER: String
    get() = "changeFrontMarker"

val EditSession.EVENT_CHANGE_BREAKPOINT: String
    get() = "changeBreakpoint"

val EditSession.EVENT_CHANGE_FOLD: String
    get() = "changeFold"

val EditSession.EVENT_CHANGE_MODE: String
    get() = "changeMode"

val EditSession.EVENT_CHANGE_OVERWRITE: String
    get() = "changeOverwrite"

val EditSession.EVENT_CHANGE_SCROLL_LEFT: String
    get() = "changeScrollLeft"

val EditSession.EVENT_CHANGE_SCROLL_TOP: String
    get() = "changeScrollTop"

val EditSession.EVENT_CHANGE_TAB_SIZE: String
    get() = "changeTabSize"

val EditSession.EVENT_CHANGE_WRAP_LIMIT: String
    get() = "changeWrapLimit"

val EditSession.EVENT_CHANGE_WRAP_MODE: String
    get() = "changeWrapMode"

val EditSession.EVENT_TOKENIZER_UPDATE: String
    get() = "tokenizerUpdate"

val BackgroundTokenizer<*, *>.EVENT_UPDATE: String
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