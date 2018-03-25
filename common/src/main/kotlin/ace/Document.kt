package ace

import ace.internal.EventEmitter
import ace.internal.EventListener

fun JsClass<Document>.new(test: String): Document {
    return constructor1Arg(this, test)
}

fun Document.addOnChangeListener(eventListener: EventListener<Document.Delta>) {
    this.on("change", eventListener)
}

fun Document.removeOnChangeListener(eventListener: EventListener<Document.Delta>) {
    this.off("change", eventListener)
}

/**
 * https://ace.c9.io/#nav=api&api=document
 */
external interface Document : EventEmitter {

    fun applyDeltas(deltas: List<Delta>)

    fun createAnchor(row: Int, column: Int): Anchor

    fun getAllLines(): Array<String>

    fun getLength(): Int

    fun getLine(row: Int): String

    fun getLines(firstRow: Int, lastRow: Int): Array<String>

    fun getNewLineCharacter(): String

    fun getNewLineMode(): String

    fun getTextRange(range: Range): String

    fun getValue(): String

    fun indexToPosition(index: Int, startRow: Int): Position

    fun insert(position: Position, text: String): Position

    fun insertInLine(position: Position, text: String): Position

    fun insertLines(row: Int, lines: Array<String>): Position

    fun insertNewLine(position: Position): Position

    fun isNewLine(text: String): Boolean

    fun positionToIndex(position: Position, startRow: Int): Int

    fun remove(range: Range): Position

    fun removeInLine(row: Int, startColumn: Int, endColumn: Int): Position

    fun removeLines(firstRow: Int, lastRow: Int): String

    fun removeNewLine(row: Number)

    fun replace(range: Range, text: String): Position

    fun revertDeltas(deltas: List<Delta>)

    fun setNewLineMode(mode: String)

    fun setValue(text: String)

    interface Position {
        val row: Int
        val column: Int
    }

    interface Delta {
        val start: Position
        val end: Position
        val action: String
        val lines: Array<String>
    }

}