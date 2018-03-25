package ace

fun <T: Tokenizer.Token, S: Any?> JsClass<Tokenizer<T, S>>.new(rules: dynamic, flag: String): Tokenizer<T, S> {
    return constructor2Arg(this, rules, flag)
}

/**
 * https://ace.c9.io/#nav=api&api=tokenizer
 */
external interface Tokenizer<T: Tokenizer.Token, S: Any?> {

    fun getLineTokens(line: String, startState: S?): Tokens<T, S>

    interface Tokens<T: Token, out S: Any?> {
        val state: S?
        val tokens: Array<T>
    }

    interface Token {
        val type: String
        val value: String
    }

}