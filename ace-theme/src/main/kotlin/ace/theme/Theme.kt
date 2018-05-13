package ace.theme

import ace.Editor
import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet

/**
 * Theme defines styling properties for the Ace editor.
 *
 * Note that each theme needs to be registered using [Theme.register].
 * Then, it can be applied by passing its ID to [Editor.setTheme].
 */
interface Theme {

    val id: String

    val isDark: Boolean

    val cssClass: String
    val cssString: String

    fun ace(selector: String): String = ".$cssClass .ace_$selector"
    fun CSSBuilder.ace(selector: String, block: RuleSet) = ace(selector).invoke(block)

}