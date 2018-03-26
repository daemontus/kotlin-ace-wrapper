package ace

import ace.internal.EventEmitter
import ace.internal.EventListener

fun JsClass<Anchor>.new(document: Document, row: Int, column: Int): Anchor {
    return constructor3Arg(this, document, row, column)
}

fun Anchor.addOnChangeListener(eventListener: EventListener<Anchor.Change>) {
    this.on("change", eventListener)
}

fun Anchor.removeOnChangeListener(eventListener: EventListener<Anchor.Change>) {
    this.off("change", eventListener)
}

external interface AnchorModule {
    @JsName("Anchor")
    val anchor: JsClass<Anchor>
}

/**
 * https://ace.c9.io/#nav=api&api=anchor
 */
external interface Anchor : EventEmitter {

    fun detach()

    fun getDocument(): Document

    fun getPosition(): Document.Position

    fun onChange(delta: Document.Delta)

    fun setPosition(row: Int, column: Int, noClip: Boolean)

    interface Change {
        val old: Document.Position
        val value: Document.Position
    }

}