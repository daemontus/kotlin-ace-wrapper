import ace.Tokenizer

/**
 * A simple stateless tokenizer which can parse the tokens specified in [DemoToken].
 *
 * Lexing essentially tests for presence of all possible tokens and then greedily
 * reads as much as possible at once, since all the tokens are completely distinct.
 */
object DemoTokenizer : Tokenizer<DemoToken, Unit>(null) {

    private val operators = charArrayOf('+', '-', '*', '/')

    override fun getLineTokens(line: String, startState: Unit?): Tokens<DemoToken, Unit> {
        println("Tokenize: $line")
        // override default getLineTokens functionality with our custom parsing rules:

        val tokens = ArrayList<DemoToken>()
        var text = line
        while (text.isNotEmpty()) {
            val token = when {
                text[0] in operators -> {
                    // Token is an operator:
                    DemoToken.Operator(text[0].toString())
                }
                text[0] == '(' || text[0] == ')' -> {
                    // Token is parenthesis:
                    DemoToken.Parenthesis(text[0].toString())
                }
                text[0].isWhitespace() -> {
                    // Token is whitespace:
                    val token = text.takeWhile { it.isWhitespace() }
                    DemoToken.Whitespace(token)
                }
                text[0] in '0'..'9' -> {
                    // Token is a number:
                    val token = text.takeWhile { it in '0'..'9' }
                    DemoToken.Number(token)
                }
                else -> {
                    // We don't know what this is:
                    val token = text.takeWhile {
                        it !in '0'..'9'
                        && it !in operators
                        && it != '(' && it != ')'
                        && !it.isWhitespace()
                    }
                    DemoToken.Unknown(token)
                }
            }
            tokens.add(token)
            text = text.drop(token.value.length)
        }

        return DemoTokens(null, tokens.toTypedArray())
    }

    private class DemoTokens(
            override val state: Unit?,
            override val tokens: Array<DemoToken>
    ) : Tokens<DemoToken, Unit>

}