package ace

object Module {

    object Internal {
        val eventEmitter = "ace/lib/event_emitter"
    }

    val anchor = "ace/anchor"
    val backgroundTokenizer = "ace/background_tokenizer"
    val document = "ace/document"
    val editSession = "ace/edit_session"

}

@Suppress("NOTHING_TO_INLINE", "UNUSED_PARAMETER")
private inline fun usedInJs(any: Any?) {}

internal fun <T: Any> constructor0Arg(ctor: JsClass<T>): T {
    usedInJs(ctor)
    return js("new ctor()") as T
}


internal fun <T: Any> constructor1Arg(ctor: JsClass<T>, arg: Any?): T {
    usedInJs(ctor); usedInJs(arg)
    return js("new ctor(arg)") as T
}

internal fun <T: Any> constructor2Arg(ctor: JsClass<T>, arg1: Any?, arg2: Any?): T {
    usedInJs(ctor); usedInJs(arg1); usedInJs(arg2)
    return js("new ctor(arg1, arg2)") as T
}

internal fun <T: Any> constructor3Arg(ctor: JsClass<T>, arg1: Any?, arg2: Any?, arg3: Any?): T {
    usedInJs(ctor); usedInJs(arg1); usedInJs(arg2); usedInJs(arg3)
    return js("new ctor(arg1, arg2, arg3)") as T
}

internal fun <T: Any> constructor4Arg(ctor: JsClass<T>, arg1: Any?, arg2: Any?, arg3: Any?, arg4: Any?): T {
    usedInJs(ctor); usedInJs(arg1); usedInJs(arg2); usedInJs(arg3); usedInJs(arg4)
    return js("new ctor(arg1, arg2, arg3, arg4)") as T
}