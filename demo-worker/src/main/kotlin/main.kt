import ace.internal.define

fun main(args: Array<String>) {
    define("demo/worker", arrayOf("require", "exports")) { _: dynamic, exports: dynamic ->
        exports["DemoWorker"] = DemoWorker::class.js
        exports
    }
}