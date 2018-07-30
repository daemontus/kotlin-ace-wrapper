package ace.layer

import ace.EditSession
import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/layer/marker&name=Marker")
external class Marker(parent: Element) {

    fun setPadding(padding: Int)

    fun setSession(session: EditSession)

    fun setMarkers(markers: dynamic)

    fun update(config: dynamic)

    fun drawTextMarker(stringBuilder: dynamic, range: dynamic, clazz: dynamic, layerConfig: dynamic, extraStyle: dynamic)

    fun drawMultiLineMarker(stringBuilder: dynamic, range: dynamic, clazz: dynamic, config: dynamic, extraStyle: dynamic)

    fun drawSingleLineMarker(stringBuilder: dynamic, range: dynamic, clazz: dynamic, config: dynamic, extraLength: dynamic, extraStyle: dynamic)

    fun drawBidiSingleLineMarker(stringBuilder: dynamic, range: dynamic, clazz: dynamic, config: dynamic, extraLength: dynamic, extraStyle: dynamic)

    fun drawFullLineMarker(stringBuilder: dynamic, range: dynamic, clazz: dynamic, config: dynamic, extraStyle: dynamic)

    fun drawScreenLineMarker(stringBuilder: dynamic, range: dynamic, clazz: dynamic, config: dynamic, extraStyle: dynamic)

}