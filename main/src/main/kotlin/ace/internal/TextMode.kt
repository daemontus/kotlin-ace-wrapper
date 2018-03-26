package ace.internal

import ace.EditSession
import ace.Tokenizer

external interface TextModeModule {
    @JsName("Mode")
    val mode: JsClass<TextMode>
}

external interface TextMode {

    val tokenizer: Tokenizer<*, *>

    fun createWorker(session: EditSession): WorkerClient?

}

