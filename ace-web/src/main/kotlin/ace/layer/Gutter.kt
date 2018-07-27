package ace.layer

import ace.EditSession
import ace.GutterAnnotation
import org.w3c.dom.Element

@JsModule("kotlin-ace-loader!?id=ace/layer/gutter&name=Gutter")
external class Gutter(parent: Element) {

    fun setSession(session: EditSession)

    fun setAnnotations(annotations: Array<GutterAnnotation>)

    fun update(config: dynamic)

    fun setShowLineNumbers(show: Boolean)

    fun getShowLineNumbers(): Boolean

    fun setShowFoldWidgets(show: Boolean)

    fun getShowFoldWidgets(): Boolean

    /**
     * Return either "markers" or "foldWidgets"
     */
    fun getRegion(point: Point): String

    interface Point {
        val x: Number
        val y: Number
    }

}