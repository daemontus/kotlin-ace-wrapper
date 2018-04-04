package ace

import ace.internal.EventEmitter
import ace.internal.EventListener

/**
 * https://ace.c9.io/#nav=api&api=background_tokenizer
 */
@JsName("ace_BackgroundTokenizer")
external class BackgroundTokenizer<T: Tokenizer.Token, S: Any?>(
        tokenizer: Tokenizer<T, S>, editor: Editor
) : EventEmitter {

    fun fireUpdateEvent(firstRow: Int, lastRow: Int)

    fun getState(row: Int): S

    fun getTokens(row: Int): List<T>

    fun setDocument(document: Document)

    fun setTokenizer(tokenizer: Tokenizer<T, S>)

    fun start(startRow: Int)

    fun stop()

    interface Updated {
        val first: Int
        val last: Int
    }

    interface Event {
        val data: Updated
    }

}