package ace

import org.w3c.dom.Element

/**
 * https://ace.c9.io/#nav=api&api=virtual_renderer
 */
@JsName("ace_VirtualRenderer")
external class VirtualRenderer(
        container: Element, theme: String
) {

    @Deprecated("Moved to EditSession")
    fun addGutterDecoration(row: Int, className: String)

    fun adjustWrapLimit()

    fun alignCursor(cursor: Document.Position, alignment: Int)

    fun animateScrolling(fromValue: Int, callback: () -> Unit)

    fun destroy()

    fun getAnimatedScroll(): Boolean

    fun getContainerElement(): Element

    fun getDisplayIndentGuides(): Boolean

    fun getFadeOldWidgets(): Boolean

    fun getFirstFullyVisibleRow(): Int

    fun getFirstVisibleRow(): Int

    fun getHighlightGutterLine(): Boolean

    fun getHScrollbarAlwaysVisible(): Boolean

    fun getLastFullyVisibleRow(): Int

    fun getLastVisibleRow(): Int

    fun getMouseEventTarget(): Element

    fun getPrintMarginColumn(): Boolean

    fun getScrollBottomRow(): Int

    fun getScrollLeft(): Int

    fun getScrollTop(): Int

    fun getScrollTopRow(): Int

    fun getShowGutter(): Boolean

    fun getShowInvisibles(): Boolean

    fun getShowPrintMargin(): Boolean

    fun getTextAreaContainer(): Element

    fun getTheme(): String

    fun hideComposition()

    fun hideCursor()

    fun isScrollableBy(deltaX: Int, deltaY: Int): Boolean

    fun onChangeTabSize()

    fun onGutterResize()

    fun onResize(force: Boolean, gutterWidth: Number, width: Number, height: Number)

    fun pixelToScreenCoordinates(x: Int, y: Int): ScreenPosition

    @Deprecated("Moved to EditSession")
    fun removeGutterDecoration(row: Int, className: String)

    fun screenToTextCoordinate(x: Int, y: Int): Document.Position

    fun scrollBy(deltaX: Int, deltaY: Int)

    fun scrollCursorIntoView(cursor: Document.Position?, offset: Number)

    fun scrollSelectionIntoView(anchor: Document.Position, lead: Document.Position, offset: Number)

    fun scrollToLine(line: Int, center: Boolean, animate: Boolean, callback: () -> Unit)

    fun scrollToRow(row: Int)

    fun scrollToX(scrollLeft: Int): Int

    fun scrollToY(scrollTop: Int): Int

    fun setAnimatedScroll(shouldAnimate: Boolean)

    fun setAnnotations(annotations: Array<dynamic>)

    fun setCompositionText(text: String)

    fun setDisplayIndentGuides(value: Boolean)

    fun setFadeFoldWidgets(value: Boolean)

    fun setHighlightGutterLine(value: Boolean)

    fun setHScrollBarAlwaysVisible(value: Boolean)

    fun setPadding(padding: Int)

    fun setPrintMarginColumn(showPrintMargin: Boolean)

    fun setSession(session: EditSession)

    fun setShowGutter(show: Boolean)

    fun setShowInvisibles(show: Boolean)

    fun setShowPrintMargin(show: Boolean)

    fun setStyle(className: String, include: Boolean)

    fun setTheme(theme: String)

    fun showCursor()

    fun textToScreenCoordinates(row: Int, column: Int): ScreenCoordinates

    fun unsetStyle(className: String)

    fun updateBackMarkers()

    fun updateBreakpoints(rows: IntArray)

    fun updateCharacterSize()

    fun updateCursor()

    fun updateFontSize()

    fun updateFontMarkers()

    fun updateFull(force: Boolean)

    fun updateLines(firstRow: Int, lastRow: Int)

    fun updateText()

    fun visualizeBlur()

    fun visualizeFocus()

    interface ScreenCoordinates {
        val pageX: Number
        val pageY: Number
    }

    interface ScreenPosition {
        val row: Int
        val column: Int
        val side: Int
        val offsetX: Int
    }

}