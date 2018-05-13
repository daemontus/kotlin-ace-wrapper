import ace.ACE
import ace.internal.DOM

/**
 * Create a new basic dark theme. The color scheme is based on dark theme in IntelliJ IDEA.
 * @return String id of the new theme.
 */
internal fun initTheme(): String {
    val themeId = "ace/theme/custom_dark"
    ACE.define(themeId, arrayOf("require", "exports")) { _: dynamic, exports: dynamic ->
        exports.isDark = true

        val id = "custom_dark"
        val css = """

            /* Basic styling of editor */

            .$id {
                color: #A9B7C6;
                background: #2B2B2B;
            }
            .$id .ace_gutter {
                color: #606366;
                background: #313335;
            }
            .$id .ace_cursor {
                color: #ababab;
            }
            .$id .ace_marker-layer .ace_selection {
                background: rgba(221, 240, 255, 0.20);
            }
            .$id .ace_marker-layer .ace_active-line {
                background: rgba(255, 255, 255, 0.031);
            }
            .$id .ace_gutter-active-line {
                rgba(255, 255, 255, 0.031);
            }

            /* Styles for our custom tokens */

            .$id .ace_demo-number {
                color: #6897BB;
                fontStyle: italic;
            }

            .$id .ace_demo-operator {
                color: #CC7832;
                font-style: bold;
            }

            .$id .ace_demo-parenthesis {
                font-style: bold;
            }

            .$id .ace_demo-unknown {
                text-decoration: red underline;
            }
        """.trimIndent()

        exports.cssClass = id
        exports.cssText = css

        DOM.importCssString(css, id)

        exports
    }

    return themeId
}