package ace.theme

import ace.ACE
import ace.lib.DOM

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