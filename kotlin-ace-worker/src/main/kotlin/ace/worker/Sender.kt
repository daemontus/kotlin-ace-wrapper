package ace.worker

/**
 * Internal interface used to communicate with the worker starter.
 */
external interface Sender {

    /**
     * Emit any type of event data back to website.
     */
    fun emit(name: String, data: Any?)

    /**
     * Emit callback data. Not sure how this works...
     */
    fun callback(data: Any?, callbackId: Int)

}