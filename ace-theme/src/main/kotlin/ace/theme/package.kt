package ace.theme

import ace.ACE
import ace.internal.DOM
import kotlinx.css.CSSBuilder
import kotlinx.css.Color

/**
 * Register a [Theme] object object using the global [ACE] instance.
 */
fun Theme.register() {
    ACE.define(id, arrayOf("require", "exports")) { _: dynamic, module: dynamic ->
        module.isDark = isDark
        module.cssClass = cssClass
        module.cssText = cssString

        DOM.importCssString(cssString, cssClass)

        module
    }
}

fun buildTheme(name: String, isDark: Boolean = false, register: Boolean = true, cssBuilder: Theme.() -> String): Theme = object : Theme {

    override val id: String = "ace/theme/$name"
    override val isDark: Boolean = isDark
    override val cssClass: String = name
    override val cssString: String = cssBuilder()

    init {
        if (register) this.register()
    }

}

fun foo() {
    buildTheme("foo") {
        CSSBuilder().apply {
            ace("demo-unknown") {
                color = Color()
            }
        }.toString()
    }
}

fun Theme.ace(className: String): String = ".$cssClass .ace_$className"
fun String.aceSelector(): String = ""