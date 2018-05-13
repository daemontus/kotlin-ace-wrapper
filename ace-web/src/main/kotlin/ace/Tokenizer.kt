package ace

/**
 * https://ace.c9.io/#nav=api&api=tokenizer
 */
@JsName("ace_Tokenizer")
open external class Tokenizer<T: Tokenizer.Token, S: Any?>(
        rules: dynamic = definedExternally
) {

    open fun getLineTokens(line: String, startState: S?): Tokens<T, S>

    interface Tokens<T: Token, out S: Any?> {
        val state: S?
        val tokens: Array<T>
    }

    interface Token {
        val type: String
        val value: String
    }

}