package ace.lib

import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/lib/dom")
external object DOM {

    fun getDocumentHead(): Element

    fun createElement(tag: String, namespace: String): Element

    fun hasCssClass(element: Element, name: String): Boolean

    fun addCssClass(element: Element, name: String)

    fun removeCssClass(element: Element, name: String)

    fun toggleCssClass(element: Element, name: String)

    fun importCssString(cssText: String, id: String)
    
}