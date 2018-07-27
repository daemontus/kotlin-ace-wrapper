package ace

import ace.lib.EventEmitter
import org.w3c.dom.Element

/**
 * https://ace.c9.io/#nav=api&api=scrollbar
 */
@JsName("ace_ScrollBar")
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
    @JsName("ace_ScrollBarV")
    class Vertical(parent: Element) : ScrollBar
    @JsName("ace_ScrollBarH")
    class Horizontal(parent: Element) : ScrollBar

}