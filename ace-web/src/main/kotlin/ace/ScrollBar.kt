package ace

import ace.internal.EventEmitter
import ace.internal.EventListener
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

}

@JsName("ace_ScrollBarV")
external class ScrollBarV(parent: Element) : ScrollBar
@JsName("ace_ScrollBarH")
external class ScrollBarH(parent: Element) : ScrollBar