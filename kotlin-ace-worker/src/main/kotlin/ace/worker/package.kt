package ace.worker

@JsName("ace")
private external object Ace {
    fun define(path: String, dependencies: Array<String>, factory: dynamic)
}

/**
 * In your main function, you have to register every worker class you want to use.
 */
fun <W: Any> JsClass<W>.register() {
    val name = this.name
    Ace.define("ace/worker/$name", arrayOf("require", "exports")) { _: dynamic, exports: dynamic ->
        exports[name] = this
        exports
    }
}