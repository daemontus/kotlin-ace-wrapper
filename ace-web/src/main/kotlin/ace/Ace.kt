package ace

import ace.internal.TextMode
import org.w3c.dom.Element

/**
 * Global Ace singleton.
 */
@JsName("ace")
external val ACE: Ace

/**
 * https://ace.c9.io/#nav=api&api=ace
 */
external interface Ace {

    fun createEditSession(text: String, mode: TextMode): EditSession

    fun createEditSession(text: Document, mode: TextMode): EditSession

    fun edit(element: String): Editor

    fun edit(element: Element): Editor

    fun <T: Any> require(moduleName: String): T

    /**
     * Define a new Ace module at given [path] using a given [factory] function.
     *
     * Factory function can take up to three parameters (require, exports, module) and returns the
     * defined object.
     */
    fun define(path: String, dependencies: Array<String>, factory: dynamic)

}