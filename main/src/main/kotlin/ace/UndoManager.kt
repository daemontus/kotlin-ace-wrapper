package ace

fun JsClass<UndoManager>.new() = constructor0Arg(this)

/**
 * https://ace.c9.io/#nav=api&api=undomanager
 */
external interface UndoManager {

    fun execute(options: dynamic)

    fun hasRedo(): Boolean

    fun hasUndo(): Boolean

    fun redo(dontSelect: Boolean)

    fun reset()

    fun undo(dontSelect: Boolean): Range

}