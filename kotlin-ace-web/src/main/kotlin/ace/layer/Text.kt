package ace.layer

import ace.EditSession
import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/layer/text&name=Text")
external class Text(parent: Element) {

    fun setPadding(padding: Int)

    fun getLineHeight(): dynamic

    fun getCharacterWidth(): dynamic

    fun checkForSizeChanges()

    fun setSession(session: EditSession)

    fun setShowInvisibles(show: Boolean)

    fun setDisplayIndentGuides(display: Boolean)

    fun updateLines(config: dynamic, firstRow: Int, lastRow: Int)

    fun scrollLines(config: dynamic)

    fun update(config: dynamic)

    fun renderIndentGuide(stringBuilder: dynamic, value: dynamic, max: dynamic): dynamic

    fun destroy()

}