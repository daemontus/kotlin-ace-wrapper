package ace.internal

import org.w3c.dom.Element

@JsName("ace_DOM")
external val DOM: Dom

external interface Dom {

    fun getDocumentHead(): Element

    fun createElement(tag: String, namespace: String): Element

    fun hasCssClass(element: Element, name: String): Boolean

    fun addCssClass(element: Element, name: String)

    fun removeCssClass(element: Element, name: String)

    fun toggleCssClass(element: Element, name: String)

    fun importCssString(cssText: String, id: String)
    
}