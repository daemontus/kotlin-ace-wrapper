package ace.layer

import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/layer/font_metrics&name=FontMetrics")
external class FontMetrics(parent: Element) {

    fun checkForSizeChanges(size: dynamic)

    fun setPolling(value: dynamic)

    fun getCharacterWidth(char: dynamic)

    fun destroy()

    fun transformCoordinates(clientPosition: dynamic, elementPosition: dynamic)

}