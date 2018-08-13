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
 * Start a new [WorkerClient] client with given [workerClassName] from provided bundle.
 */
fun startWorkerFromBundle(
        workerClassName: String, bundleUrl: String
): WorkerClient = WorkerClient(
        topLevelNamespaces = arrayOf("ace"),
        mod = "ace/worker/$workerClassName",
        classname = workerClassName,
        workerUrl = bundleUrl,
        importScripts = ""
)