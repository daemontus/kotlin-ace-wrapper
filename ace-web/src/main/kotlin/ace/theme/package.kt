package ace.theme

import ace.Ace
import ace.lib.DOM

/**
 * Register a [Theme] object object using the global [Ace] instance.
 */
fun Theme.register() {
    Ace.define(id, arrayOf("require", "exports")) { _: dynamic, module: dynamic ->
        module.isDark = isDark
        module.cssClass = cssClass
        module.cssText = cssString

        DOM.importCssString(cssString, cssClass)

        module
    }
}