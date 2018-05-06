package ace

/**
 * Send this class as the first message to worker-init.js in order to properly initialize
 * worker with dependencies.
 */
class WorkerInit(
        val dependencies: Array<String>,
        val module: String,
        val mainMethod: String,
        val mainArguments: Array<String>
)