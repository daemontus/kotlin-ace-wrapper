package ace

fun JsClass<UndoManager>.new() = constructor0Arg(this)

external interface UndoManagerModule {
    @JsName("UndoManager")
    val undoManager: JsClass<UndoManager>
}

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