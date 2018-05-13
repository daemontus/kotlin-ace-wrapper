import ace.internal.register

fun main(args: Array<String>) {
    println("Running the worker main method.")
    DemoWorker::class.js.register()
    println("Worker class successfully registered.")
}