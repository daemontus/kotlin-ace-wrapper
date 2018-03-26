package ace.internal

import ace.Document
import ace.EditSession

external interface Cursor {

    fun setPadding(padding: Int)

    fun setSession(session: EditSession)

    fun setBlinking(blinking: Boolean)

    fun setBlinkInterval(interval: Int)

    fun setSmoothBlinking(smoothBlinking: Boolean)

    fun addCursor()

    fun removeCursor()

    fun hideCursor()

    fun showCursor()

    fun restartTimer()

    fun getPixelPosition(position: Document.Position, onScreen: Boolean): Position

    fun update(config: dynamic)

    fun destroy()

    interface Position {
        val left: Int
        val top: Int
    }

}