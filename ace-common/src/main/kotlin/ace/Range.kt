package ace

/**
 * https://ace.c9.io/#nav=api&api=range
 */
@JsName("ace_Range")
open external class Range(startRow: Int, startColumn: Int, endRow: Int, endColumn: Int) {

    fun clipRows(firstRow: Int, lastRow: Int): Range

    fun clone(): Range

    fun collapseRows(): Range

    fun compare(row: Int, column: Int): Int

    fun compareEnd(row: Int, column: Int): Int

    fun compareInside(row: Int, column: Int): Int

    fun comparePoint(p: Range): Int

    fun compareRange(range: Range): Int

    fun compareStart(row: Int, column: Int): Int

    fun contains(row: Int, column: Int): Boolean

    fun containsRange(range: Range): Boolean

    fun extend(row: Int, column: Int): Range

    fun fromPoints(start: Range, end: Range): Range

    fun inside(row: Int, column: Int): Boolean

    fun insideEnd(row: Int, column: Int): Boolean

    fun insideStart(row: Int, column: Int): Boolean

    fun intersects(range: Range): Boolean

    fun isEmpty(): Boolean

    fun isEnd(row: Int, column: Int): Boolean

    fun isEqual(range: Range): Boolean

    fun isMultiLine(): Boolean

    fun isStart(row: Int, column: Int): Boolean

    fun setEnd(row: Int, column: Int)

    fun setStart(row: Int, column: Int)

}
