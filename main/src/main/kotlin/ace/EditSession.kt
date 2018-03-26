package ace

import ace.internal.EventEmitter
import ace.internal.EventListener
import ace.internal.TextMode

fun JsClass<EditSession>.new(test: String, mode: TextMode): EditSession {
    return constructor2Arg(this, test, mode)
}

fun JsClass<EditSession>.new(test: Document, mode: TextMode): EditSession {
    return constructor2Arg(this, test, mode)
}

fun EditSession.addOnTokenizerUpdateListener(eventListener: EventListener<EditSession.TokenizerEvent>) {
    this.on("tokenizerUpdate", eventListener)
}

fun EditSession.removeOnTokenizerUpdateListener(eventListener: EventListener<EditSession.TokenizerEvent>) {
    this.off("tokenizerUpdate", eventListener)
}

fun EditSession.addOnChangeWrapModeListener(eventListener: EventListener<Unit>) {
    this.on("changeWrapMode", eventListener)
}

fun EditSession.removeOnChangeWrapModeListener(eventListener: EventListener<Unit>) {
    this.off("changeWrapMode", eventListener)
}

fun EditSession.addOnChangeWrapLimitListener(eventListener: EventListener<Unit>) {
    this.on("changeWrapLimit", eventListener)
}

fun EditSession.removeOnChangeWrapLimitListener(eventListener: EventListener<Unit>) {
    this.off("changeWrapLimit", eventListener)
}

fun EditSession.addOnChangeTabSizeListener(eventListener: EventListener<Unit>) {
    this.on("changeTabSize", eventListener)
}

fun EditSession.removeOnChangeTabSizeListener(eventListener: EventListener<Unit>) {
    this.off("changeTabSize", eventListener)
}

fun EditSession.addOnChangeScrollTopListener(eventListener: EventListener<Int>) {
    this.on("changeScrollTop", eventListener)
}

fun EditSession.removeOnChangeScrollTopListener(eventListener: EventListener<Int>) {
    this.off("changeScrollTop", eventListener)
}

fun EditSession.addOnChangeScrollLeftListener(eventListener: EventListener<Int>) {
    this.on("changeScrollLeft", eventListener)
}

fun EditSession.removeOnChangeScrollLEftListener(eventListener: EventListener<Int>) {
    this.off("changeScrollLeft", eventListener)
}

fun EditSession.addOnChangeOverwriteListener(eventListener: EventListener<Unit>) {
    this.on("changeOverwrite", eventListener)
}

fun EditSession.removeOnChangeOverwriteListener(eventListener: EventListener<Unit>) {
    this.off("changeOverwrite", eventListener)
}

fun EditSession.addOnChangeModeListener(eventListener: EventListener<Unit>) {
    this.on("changeMode", eventListener)
}

fun EditSession.removeOnChangeModeListener(eventListener: EventListener<Unit>) {
    this.off("changeMode", eventListener)
}

fun EditSession.addOnChangeFrontMarkerListener(eventListener: EventListener<Unit>) {
    this.on("changeFrontMarker", eventListener)
}

fun EditSession.removeOnChangeFrontMarkerListener(eventListener: EventListener<Unit>) {
    this.off("changeFrontMarker", eventListener)
}

fun EditSession.addOnChangeFoldListener(eventListener: EventListener<Unit>) {
    this.on("changeFold", eventListener)
}

fun EditSession.removeOnChangeFoldListener(eventListener: EventListener<Unit>) {
    this.off("changeFold", eventListener)
}

fun EditSession.addOnChangeBreakpointListener(eventListener: EventListener<Unit>) {
    this.on("changeBreakpoint", eventListener)
}

fun EditSession.removeOnChangeBreakpointListener(eventListener: EventListener<Unit>) {
    this.off("changeBreakpoint", eventListener)
}

fun EditSession.addOnChangeBackMarkerListener(eventListener: EventListener<Unit>) {
    this.on("changeBackMarker", eventListener)
}

fun EditSession.removeOnChangeBackMarkerListener(eventListener: EventListener<Unit>) {
    this.off("changeBackMarker", eventListener)
}

fun EditSession.addOnChangeAnnotationListener(eventListener: EventListener<Unit>) {
    this.on("changeAnnotation", eventListener)
}

fun EditSession.removeOnChangeAnnotationListener(eventListener: EventListener<Unit>) {
    this.off("changeAnnotation", eventListener)
}

fun EditSession.addOnChangeListener(eventListener: EventListener<Document.Delta>) {
    this.on("change", eventListener)
}

fun EditSession.removeOnChangeListener(eventListener: EventListener<Document.Delta>) {
    this.off("change", eventListener)
}

external interface EditSessionModule {
    @JsName("EditSession")
    val editSession: JsClass<EditSession>
}

/**
 * https://ace.c9.io/#nav=api&api=edit_session
 */
external interface EditSession : EventEmitter {

    fun addDynamicMarker(marker: dynamic, inFront: Boolean): dynamic

    fun addGutterDecoration(row: Int, className: String)

    fun addMarker(range: Range, clazz: String, type: String, inFront: Boolean): Int

    fun clearAnnotations()

    fun clearBreakpoint(row: Int)

    fun clearBreakpoints()

    fun documentToScreenColumn(row: Int, docColumn: Int): Int

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

    fun getMode(): TextMode

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

    fun redoChanges(deltas: Array<Document.Delta>, dontSelect: Boolean): Range

    fun remove(range: Range): Document.Position

    fun removeGutterDecoration(row: Int, className: String)

    fun removeMarker(markerId: Int)

    fun replace(range: Range, text: String): Document.Position

    fun reset()

    fun resetCaches()

    fun screenToDocumentColumn(screenRow: Int, screenColumn: Int): Int

    fun screenToDocumentPosition(screenRow: Int, screenColumn: Int): Document.Position

    fun screenToDocumentRow(screenRow: Int, screenColumn: Int): Int

    fun setAnnotations(annotations: Array<dynamic>)

    fun setBreakpoint(row: Int, className: String)

    fun setBreakpoints(rows: IntArray)

    fun setDocument(document: Document)

    fun setMode(mode: TextMode)

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

    fun undoChanges(deltas: Array<Document.Delta>, dontSelect: Boolean)

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