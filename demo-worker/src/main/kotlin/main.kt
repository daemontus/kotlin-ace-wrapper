import ace.worker.register

fun main() {
    println("Running the worker main method.")
    DemoWorker::class.js.register()
    println("Worker class successfully registered.")
}