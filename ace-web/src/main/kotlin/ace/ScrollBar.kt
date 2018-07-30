package ace

import ace.lib.EventEmitter
import org.w3c.dom.Element

/**
 * https://ace.c9.io/#nav=api&api=scrollbar
 */
@JsModule("kotlin-ace-loader!?id=ace/scrollbar&name=ScrollBar")
open external class ScrollBar(parent: Element) : EventEmitter {

    fun getWidth(): Int

    fun setHeight(height: Int)

    fun setInnerHeight(height: Int)

    fun setScrollTop(scrollTop: Int)

    fun onScroll()

    interface Event {
        val data: Int
    }

    // note: this requires special handling in class loader
    @JsModule("kotlin-ace-loader!?id=ace/scrollbar&name=ScrollBarV")
    class Vertical(parent: Element) : ScrollBar
    @JsModule("kotlin-ace-loader!?id=ace/scrollbar&name=ScrollBarH")
    class Horizontal(parent: Element) : ScrollBar

}