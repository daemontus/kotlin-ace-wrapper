package ace

external interface MirrorModule {

    @JsName("Mirror")
    val mirror: JsClass<Mirror>

}

external interface Mirror {

    @JsName("doc")
    val document: Document

    fun setTimeout(value: Int)

    @JsName("onUpdate")
    fun onUpdate()

}