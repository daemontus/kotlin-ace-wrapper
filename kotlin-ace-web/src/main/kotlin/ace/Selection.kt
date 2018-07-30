package ace

import ace.layer.Cursor

/**
 * https://ace.c9.io/#nav=api&api=selection
 */
@JsModule("kotlin-ace-loader!?id=ace/selection&name=Selection")
external class Selection(session: EditSession) {

    fun addRange(range: Range, blockChangeEvents: Boolean)

    fun clearSelection()

    fun detach()

    fun fromOrientedRange(range: Range)

    fun getAllRanges(): Array<Range>

    fun getCursor(): Document.Position

    fun getLineRange(): Range

    fun getRange(): Range

    fun getSelectionAnchor(): Document.Position

    fun getSelectionLead(): Document.Position

    fun getWordRange(row: Int, column: Int): Range

    fun isBackwards(): Boolean

    fun isEmpty(): Boolean

    fun isMultiline(): Boolean

    fun mergeOverlappingRanges()

    fun moveCursorBy(rows: Int, chars: Int)

    fun moveCursorDown()

    fun moveCursorFileEnd()

    fun moveCursorFileStart()

    fun moveCursorLeft()

    fun moveCursorLineEnd()

    fun moveCursorLineStart()

    fun moveCursorLongWordLeft()

    fun moveCursorLongWordRight()

    fun moveCursorRight()

    fun moveCursorShortWordLeft()

    fun moveCursorShortWordRight()

    fun moveCursorTo(row: Int, column: Int, keepDesiredColumn: Boolean)

    fun moveCursorToPosition(position: Document.Position)

    fun moveCursorToScreen(row: Int, column: Int, keepDesiredColumn: Boolean)

    fun moveCursorUp()

    fun moveCursorWordLeft()

    fun moveCursorWordRight()

    fun rectangularRangeBlock(screenCursor: Cursor, screenAnchor: Anchor, includeEmptyLines: Boolean): Range

    fun selectAll()

    fun selectAWord()

    fun selectDown()

    fun selectFileEnd()

    fun selectFileStart()

    fun selectLeft()

    fun selectLine()

    fun selectLineEnd()

    fun selectLineStart()

    fun selectRight()

    fun selectTo(row: Int, column: Int)

    fun selectToPosition(position: Document.Position)

    fun selectUp()

    fun selectWord()

    fun selectWordLeft()

    fun selectWordRight()

    fun setSelectionAnchor(row: Int, column: Int)

    fun setSelectionRange(range: Range, reverse: Boolean)

    fun shiftSelection(columns: Int)

    fun splitIntoLines()

    fun subtractPoint(pos: Range)

    fun toggleBlockSection()

    fun toOrientedRange(range: Range): Range

    fun toSingleRange(range: Range): Range

}