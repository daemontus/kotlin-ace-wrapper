package ace

external interface Mirror {

    @JsName("doc")
    val document: Document

    fun setTimeout(value: Int)

    @JsName("onUpdate")
    fun onUpdate()

}