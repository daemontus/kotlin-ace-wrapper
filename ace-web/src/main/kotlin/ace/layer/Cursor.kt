package ace.layer

import ace.Document
import ace.EditSession
import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/layer/cursor&name=Cursor")
external class Cursor(parent: Element) {

    fun setPadding(padding: Int)

    fun setSession(session: EditSession)

    fun setBlinking(blinking: Boolean)

    fun setBlinkInterval(interval: Int)

    fun setSmoothBlinking(smoothBlinking: Boolean)

    fun addCursor(): Element

    fun removeCursor(): Element

    fun hideCursor()

    fun showCursor()

    fun restartTimer()

    fun getPixelPosition(position: Document.Position?, onScreen: Boolean): PixelPosition

    fun update(config: dynamic)

    fun destroy()

    interface PixelPosition {
        val left: Int
        val top: Int
    }

}