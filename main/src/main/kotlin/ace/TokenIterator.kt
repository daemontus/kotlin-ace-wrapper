package ace

fun JsClass<TokenIterator>.new(session: EditSession, initialRow: Int, initailColumn: Int): TokenIterator {
    return constructor3Arg(this, session, initialRow, initailColumn)
}

/**
 * https://ace.c9.io/#nav=api&api=token_iterator
 */
interface TokenIterator {

    fun getCurrentToken(): String

    fun getCurrentTokenColumn(): Int

    fun getCurrentTokenRow(): Int

    fun stepBackwward(): String

    fun stepForward(): String?

}