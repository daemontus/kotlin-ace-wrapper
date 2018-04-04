package ace

/**
 * https://ace.c9.io/#nav=api&api=token_iterator
 */
@JsName("ace_TokenIterator")
external class TokenIterator(
        session: EditSession,
        initialRow: Int,
        initialColumn: Int
) {

    fun getCurrentToken(): String

    fun getCurrentTokenColumn(): Int

    fun getCurrentTokenRow(): Int

    fun stepBackwward(): String

    fun stepForward(): String?

}