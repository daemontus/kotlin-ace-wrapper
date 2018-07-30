package ace.lib

import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/layer/event")
external object Event {

    fun addListener(element: Element, type: dynamic, callback: dynamic)

    fun removeListener(element: Element, type: dynamic, callback: dynamic)

    fun stopEvent(event: dynamic)

    fun stopPropagation(event: dynamic)

    fun preventDefault(event: dynamic)

    fun getButton(): dynamic

    fun capture(element: Element, eventHandler: dynamic, releaseCaptureHandler: dynamic)

    fun addTouchMoveListener(element: Element, callback: dynamic)

    fun addMouseWheelListener(element: Element, callback: dynamic)

    fun addMouseDownListener(elements: Array<Element>, timeouts: Array<Int>, eventHandler: dynamic, callbackName: dynamic)

    fun getModifierString(event: dynamic): String

    fun addCommandKeyListener(element: Element, callback: dynamic)

    fun onIdle(callback: dynamic, timeout: Int): Int

    fun blockIdle(delay: Int)

}