package ace.worker

/**
 * Use the same way as ace.define, but on a global level in the worker script.
 */
external fun define(path: String, dependencies: Array<String>, factory: dynamic)

/**
 * In your main function, you have to register every worker class you want to use.
 */
fun <W: Any> JsClass<W>.register() {
    val name = this.name
    define("ace/worker/$name", arrayOf("require", "exports")) { _: dynamic, exports: dynamic ->
        exports[name] = this
        exports
    }
}