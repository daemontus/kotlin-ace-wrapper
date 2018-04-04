package ace

/**
 * https://ace.c9.io/#nav=api&api=undomanager
 */
@JsName("ace_UndoManager")
external class UndoManager {

    fun execute(options: dynamic)

    fun hasRedo(): Boolean

    fun hasUndo(): Boolean

    fun redo(dontSelect: Boolean)

    fun reset()

    fun undo(dontSelect: Boolean): Range

}