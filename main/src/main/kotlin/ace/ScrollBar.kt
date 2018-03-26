package ace

import ace.internal.EventEmitter
import ace.internal.EventListener
import org.w3c.dom.Element

fun JsClass<ScrollBar>.new(parent: Element): ScrollBar {
    return constructor1Arg(this, parent)
}

fun ScrollBar.addOnScrollListener(eventListener: EventListener<ScrollBar.Event>) {
    this.on("scroll", eventListener)
}

fun ScrollBar.removeOnScrollListener(eventListener: EventListener<ScrollBar.Event>) {
    this.off("scroll", eventListener)
}

external interface ScrollBarModule {

    @JsName("ScrollBar")
    val scrollBar: JsClass<ScrollBar>

    @JsName("ScrollBarV")
    val scrollBarVertical: JsClass<ScrollBar>

    @JsName("ScrollBarH")
    val scrollBarHorizontal: JsClass<ScrollBar>
}

/**
 * https://ace.c9.io/#nav=api&api=scrollbar
 */
external interface ScrollBar : EventEmitter {

    fun getWidth(): Int

    fun setHeight(height: Int)

    fun setInnerHeight(height: Int)

    fun setScrollTop(scrollTop: Int)

    fun onScroll()

    interface Event {
        val data: Int
    }

}