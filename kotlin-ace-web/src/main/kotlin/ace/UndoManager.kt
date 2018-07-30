package ace

/**
 * https://ace.c9.io/#nav=api&api=undomanager
 */
@JsModule("kotlin-ace-loader!?id=ace/undomanager&name=UndoManager")
external class UndoManager {

    fun execute(options: dynamic)

    fun hasRedo(): Boolean

    fun hasUndo(): Boolean

    fun redo(dontSelect: Boolean)

    fun reset()

    fun undo(dontSelect: Boolean): Range

}