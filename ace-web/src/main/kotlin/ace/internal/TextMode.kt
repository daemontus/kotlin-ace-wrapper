package ace.internal

import ace.EditSession
import ace.Tokenizer

@JsName("ace_TextMode")
external class TextMode {

    val tokenizer: Tokenizer<*, *>

    open fun createWorker(session: EditSession): WorkerClient?

}

