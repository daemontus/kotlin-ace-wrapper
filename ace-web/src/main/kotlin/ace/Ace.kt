package ace

import ace.mode.Mode
import org.w3c.dom.Element

/**
 * https://ace.c9.io/#nav=api&api=ace
 */
@JsModule("ace-builds")
external object Ace {

    fun createEditSession(text: String, mode: Mode): EditSession

    fun createEditSession(text: Document, mode: Mode): EditSession

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