package ace

fun JsClass<Editor>.new(renderer: VirtualRenderer, session: EditSession): Editor {
    return constructor2Arg(this, renderer, session)
}

external interface EditorModule {
    @JsName("Editor")
    val editor: JsClass<Editor>
}

/**
 * https://ace.c9.io/#nav=api&api=editor
 */
external interface Editor {

    fun addSelectionMarker(orientedRange: Range): Range
    fun alignCursors()
    fun blockOutdent()
    fun blur()
    fun centerSelection()
    fun clearSelection()
    fun copyLinesDown(): Int
    fun copyLinesUp(): Int
    fun destroy()
    fun duplicateSelection()
    fun execCommand(command: String, args: dynamic)
    fun exitMultiSelectMode()
    fun find(needle: String, options: dynamic, animate: Boolean)
    fun findAll(needle: String, options: dynamic, additive: Boolean): Int
    fun findNext(options: dynamic, animate: Boolean)
    fun findPrevious(options: dynamic, animate: Boolean)
    fun focus()
    fun forEachSelection(cmd: String, args: String)
    fun getAnimatedScroll(): Boolean
    fun getBehavioursEnabled(): Boolean
    fun getCopyText(): String
    fun getCursorPosition(): Document.Position
    fun getCursorPositionScreen(): Int
    fun getDisplayIndentGuides(): Boolean
    fun getDragDelay(): Int
    fun getFadeFoldWidgets(): Boolean
    fun getFirstVisibleRow(): Int
    fun getHighlightActiveLine(): Boolean
    fun getHighlightGutterLine(): Boolean
    fun getHighlightSelectedWord(): Boolean
    fun getKeyboardHandler(): String
    fun getLastSearchOptions(): dynamic
    fun getLastVisibleRow(): Int
    fun getNumberAt(row: Int, column: Int): Int
    fun getOverwrite(): Boolean
    fun getPrintMarginColumn(): Int
    fun getReadOnly(): Boolean
    fun getScrollSpeed(): Int
    fun getSelection(): Selection
    fun getSelectionRange(): Range
    fun getSelectionStyle(): String
    fun getSession(): EditSession
    fun getShowFoldWidgets(): Boolean
    fun getShowInvisibles(): Boolean
    fun getShowPrintMargin(): Boolean
    fun getTheme(): String
    fun getValue(): String
    fun getWrapBehavioursEnabled()
    fun gotoLine(lineNumber: Int, column: Int, animate: Boolean)
    fun gotoPageDown()
    fun gotoPageUp()
    fun indent()
    fun insert(text: String)
    fun isFocused(): Boolean
    fun isRowFullyVisible(row: Int): Boolean
    fun isRowVisible(row: Int): Boolean
    fun jumpToMatching(select: dynamic)
    fun modifyNumber(amount: Int)
    fun moveCursorTo(row: Int, column: Int)
    fun moveCursorToPosition(position: Document.Position)
    fun moveLinesDown(): Int
    fun moveLinesUp(): Int
    fun moveText(range: Range, toPosition: Document.Position, copy: Boolean)
    fun navigateDown(times: Int)
    fun navigateFileEnd()
    fun navigateFileStart()
    fun navigateLeft(times: Int)
    fun navigateLineEnd()
    fun navigateLineStart()
    fun navigateRight(times: Int)
    fun navigateTo(row: Int, column: Int)
    fun navigateUp(times: Int)
    fun navigateWordLeft()
    fun navigateWordRight()
    fun onBlur(event: dynamic)
    fun onChangeAnnotation()
    fun onChangeBackMarker()
    fun onChangeBreakpoint()
    fun onChangeFold()
    fun onChangeFrontMarker()
    fun onChangeMode(event: dynamic)
    fun onChangeWrapLimit()
    fun onChangeWrapMode(e: dynamic)
    fun onCommandKey(e: dynamic, hashId: dynamic, keyCode: dynamic)
    fun onCompositionEnd()
    fun onCompositionStart()
    fun onCompositionUpdate()
    fun onCopy()
    fun onCursorChange()
    fun onCut()
    fun onDocumentChange()
    fun onFocus()
    fun onPaste(text: String)
    fun onScrollLeftChange()
    fun onScrollTopChange()
    fun onSelectionChange()
    fun onTextInput()
    fun onTokenizerUpdate()
    fun redo()
    fun remove(dir: String)
    fun removeLines()
    fun removeSelectionMarker(range: Range)
    fun removeToLineEnd()
    fun removeToLineStart()
    fun removeWordLeft()
    fun removeWordRight()
    fun replace(replacement: String, options: dynamic)
    fun replaceAll(replacement: String, options: dynamic)
    fun resize(force: Boolean)
    fun revealRange()
    fun scrollPageDown()
    fun scrollPageUp()
    fun scrollToLine(line: Int, center: Boolean, animate: Boolean, callback: () -> Unit)
    fun scrollToRow(row: Int)
    fun selectAll()
    fun selectMore(dir: Int, skip: Boolean)
    fun selectMoreLines(dir: Int, skip: Boolean)
    fun selectPageDown()
    fun selectPageUp()
    fun setAnimatedScroll()
    fun setBehavioursEnabled(enabled: Boolean)
    fun setDisplayIndentGuides()
    fun setDragDelay(dragDelay: Int)
    fun setFadeFoldWidgets()
    fun setFontSize(size: Int)
    fun setHighlightActiveLine(shouldHighlight: Boolean)
    fun setHighlightGutterLine()
    fun setHighlightSelectedWord(shouldHighlight: Boolean)
    fun setKeyboardHandler(keyboardHandler: String)
    fun setOverwrite(overwrite: Boolean)
    fun setPrintMarginColumn(showPrintMargin: Int)
    fun setReadOnly(readOnly: Boolean)
    fun setScrollSpeed(speed: Int)
    fun setSelectionStyle(style: String)
    fun setSession(session: EditSession)
    fun setShowFoldWidgets(show: Boolean)
    fun setShowInvisibles(showInvisibles: Boolean)
    fun setShowPrintMargin(showPrintMargin: Boolean)
    fun setStyle(style: String)
    fun setTheme(theme: String)
    fun setValue(vlaue: String, cursorPos: Int): String
    fun setWrapBehavioursEnabled(enabled: Boolean)
    fun sortLines()
    fun splitLine()
    fun toggleCommentLines()
    fun toggleOverwrite()
    fun toLowerCase()
    fun toUpperCase()
    fun transposeLetters()
    fun transposeSelections(dir: Int)
    fun undo()
    fun unsetStyle(className: String)
    fun updateSelectionMarkers()

}