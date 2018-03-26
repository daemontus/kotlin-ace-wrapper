package ace.internal

external interface TextModeModule {
    @JsName("Mode")
    val mode: JsClass<TextMode>
}

external interface TextMode

