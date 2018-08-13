import ace.Tokenizer

/**
 * Simple demo grammar will recognize these types of tokens:
 *  - Natural numbers (1,2,456,15, ...)
 *  - Operators (+,-,*,/)
 *  - Parenthesis ()
 *  - Whitespace
 *  - Unknown - everything else
 *
 * If you had a bigger grammar, you could try to distinguish lexing rules and tokens
 * (having a set of rules, each rule reading one token). Since this is an extremely
 * simple grammar, all rules are baked directly into [DemoTokenizer].
 */
sealed class DemoToken : Tokenizer.Token {

    enum class Rule(val type: String) {
        NUMBER("demo-number"),
        OPERATOR("demo-operator"),
        PARENTHESIS("demo-parenthesis"),
        WHITESPACE("demo-whitespace"),
        UNKNOWN("demo-unknown")
        ;

        override fun toString(): String = type
    }

    data class Number(override val value: String) : DemoToken() {
        override val type: String = Rule.NUMBER.type
    }

    data class Operator(override val value: String) : DemoToken() {
        override val type: String = Rule.OPERATOR.type
    }

    data class Parenthesis(override val value: String) : DemoToken() {
        override val type: String = Rule.PARENTHESIS.type
    }

    data class Whitespace(override val value: String) : DemoToken() {
        override val type: String = Rule.WHITESPACE.type
    }

    data class Unknown(override val value: String) : DemoToken() {
        override val type: String = Rule.UNKNOWN.type
    }

}