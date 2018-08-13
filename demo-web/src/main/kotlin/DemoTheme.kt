import DemoToken.Rule.*
import ace.theme.Theme
import ace.theme.register

object DemoTheme : Theme {

    private const val name: String = "theme-demo"

    override val id: String = "ace/theme/$name"
    override val isDark: Boolean = true
    override val cssClass: String = name

    override val cssString: String = """

        /* Basic styling of editor */

        .$name {
            color: #A9B7C6;
            background: #2B2B2B;
        }

        .$name .ace_gutter {
            color: #606366;
            background: #313335;
        }

        .$name .ace_cursor {
            color: #ababab;
        }

        .$name .ace_marker-layer .ace_selection {
            background: rgba(221, 240, 255, 0.20);
        }

        .$name .ace_marker-layer .ace_active-line {
            background: rgba(255, 255, 255, 0.031);
        }

        .$name .ace_gutter-active-line {
            rgba(255, 255, 255, 0.031);
        }

        /* Styles for our custom tokens */

        .$name .ace_$NUMBER {
            color: #6897BB;
            fontStyle: italic;
        }

        .$name .ace_$OPERATOR {
            color: #CC7832;
            font-style: bold;
        }

        .$name .ace_$PARENTHESIS {
            font-style: bold;
        }

        .$name .ace_$UNKNOWN {
            -webkit-text-decoration-line: underline;
            -webkit-text-decoration-color: red;
        }

    """.trimIndent()

    init {
        this.register()
    }

}