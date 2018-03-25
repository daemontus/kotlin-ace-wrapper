package ace

import ace.internal.EventEmitter
import ace.internal.EventListener

fun <T: Tokenizer.Token, S: Any?, TT: Tokenizer<T, S>> JsClass<BackgroundTokenizer<T, S, TT>>.new(
        tokenizer: Tokenizer<T, S>,
        editor: Editor
): BackgroundTokenizer<T, S, TT> {
    return constructor2Arg(this, tokenizer, editor)
}

fun BackgroundTokenizer<*, *, *>.addOnUpdateListener(eventListener: EventListener<BackgroundTokenizer.Event>) {
    this.on("update", eventListener)
}

fun BackgroundTokenizer<*, *, *>.removeOnUpdateListener(eventListener: EventListener<BackgroundTokenizer.Event>) {
    this.off("update", eventListener)
}

/**
 * https://ace.c9.io/#nav=api&api=background_tokenizer
 */
external interface BackgroundTokenizer<T: Tokenizer.Token, S: Any?, TT: Tokenizer<T, S>> : EventEmitter {

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