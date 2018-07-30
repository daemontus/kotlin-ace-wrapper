package ace

import ace.lib.EventEmitter
import ace.mode.Mode

/**
 * https://ace.c9.io/#nav=api&api=edit_session
 */
@JsModule("kotlin-ace-loader!?id=ace/edit_session&name=EditSession")
external class EditSession : EventEmitter {

    constructor(text: String, mode: Mode)
    constructor(document: Document, mode: Mode)

    fun addDynamicMarker(marker: dynamic, inFront: Boolean): dynamic

    fun addGutterDecoration(row: Int, className: String)

    fun addMarker(range: Range, clazz: String, type: String, inFront: Boolean): Int

    fun clearAnnotations()

    fun clearBreakpoint(row: Int)

    fun clearBreakpoints()

    fun documentToScreenColumn(row: Int, docColumn: Int): Int

    fun documentToScreenPosition(position: Document.Position): Document.Position
    fun documentToScreenPosition(docRow: Int, docColumn: Int): Document.Position

    fun documentToScreenRow(docRow: Int, docColumn: Int): Int

    fun duplicateLines(firstRow: Int, lastRow: Int): Int

    fun getAnnotations(): Array<dynamic>

    fun getAWordRange(row: Int, column: Int): Range

    fun getBreakpoints(): IntArray

    fun getDocument(): Document

    fun getDocumentLastRowColumn(docRow: Int, docColumn: Int): Int

    fun getDocumentLastRowColumnPosition(docRow: Int, docColumn: Int): Document.Position

    fun getLength(): Int

    fun getLine(row: Int): String

    fun getLines(firstRow: Int, lastRow: Int): Array<String>

    fun getMarkers(inFront: Boolean): IntArray

    fun getMode(): Mode

    fun getNewLineMode(): String

    fun getOverwrite(): Boolean

    fun getRowLength(row: Int): Int

    fun getRowSplitData(row: Int): IntArray

    fun getScreenLastRowColumn(screenRow: Int): Int

    fun getScreenLength(): Int

    fun getScreenTabSize(screenColumn: Int): Int

    fun getScreenWidth(): Int

    fun getScrollLeft(): Int

    fun getScrollTop(): Int

    fun getSelection(): Selection?

    fun getState(row: Int): Any?

    fun getTabSize(): Int

    fun getTabString(): String

    fun getTextRange(range: Range): String

    fun getTokenAt(row: Int, column: Int): TokenInfo

    fun getTokens(row: Int): List<Tokenizer.Token>

    fun getUndoManager(): UndoManager

    fun getUseSoftTabs(): Boolean

    fun getUseWorker(): Boolean

    fun getUseWrapMode(): Boolean

    fun getValue(): String

    fun getWordRange(row: Int, column: Int): Range

    fun getWrapLimit(): Int

    fun getWrapLimitRange(): WrapLimit

    fun highlight(regex: String)

    fun highlightLines(startRow: Int, endRow: Int, clazz: String, inFront: Boolean): Range

    fun indentRows(startRow: Int, endRow: Int, indentString: String)

    fun insert(position: Document.Position, text: String): Document.Position

    fun isTabStop(position: Document.Position)

    fun moveLinesDown(firstRow: Int, lastRow: Int): Int

    fun moveLinesUp(firstRow: Int, lastRow: Int): Int

    fun moveText(fromRange: Range, toPosition: Document.Position): Range

    fun onChange(delta: Document.Delta)

    fun onChangeFold(event: FoldEvent)

    fun onReloadTokenizer(event: TokenizerEvent)

    fun outdentRows(range: Range)

    fun redo()

    fun redoChanges(deltas: Array<Document.Delta>, doNotSelect: Boolean): Range

    fun remove(range: Range): Document.Position

    fun removeGutterDecoration(row: Int, className: String)

    fun removeMarker(markerId: Int)

    fun replace(range: Range, text: String): Document.Position

    fun reset()

    fun resetCaches()

    fun screenToDocumentColumn(screenRow: Int, screenColumn: Int): Int

    fun screenToDocumentPosition(screenRow: Int, screenColumn: Int): Document.Position

    fun screenToDocumentRow(screenRow: Int, screenColumn: Int): Int

    fun setAnnotations(annotations: Array<GutterAnnotation>)

    fun setBreakpoint(row: Int, className: String)

    fun setBreakpoints(rows: IntArray)

    fun setDocument(document: Document)

    fun setMode(mode: Mode)

    fun setNewLineMode(newLineMode: String)

    fun setOverwrite(overwrite: Boolean)

    fun setScrollLeft(scrollLeft: Int)

    fun setScrollTop(scrollTop: Int)

    fun setTabSize(tabSize: Int)

    fun setUndoManager(undoManager: UndoManager)

    fun setUndoSelect(enable: Boolean)

    fun setUseSoftTabs(useSoftTabs: Boolean)

    fun setUseWorker(useWorker: Boolean)

    fun setUseWrapMode(useWrapMode: Boolean)

    fun setValue(text: String)

    fun setWrapLimitRange(min: Int, max: Int)

    fun toggleOverwrite()

    fun undo()

    fun undoChanges(deltas: Array<Document.Delta>, doNotSelect: Boolean)

    interface TokenizerEvent {
        val data: Rows
        interface Rows {
            val first: Int
            val last: Int
        }
    }

    interface FoldEvent {
        val data: Data
        interface Data {
            val row: Int
        }
    }
    interface WrapLimit {
        val min: Int
        val max: Int
    }

    interface TokenInfo {
        val index: Int
        val start: Int
    }

}