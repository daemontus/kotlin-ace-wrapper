package ace.internal

/**
 * Internal interface used to communicate with the worker starter.
 *
 * Technically, it also inherits [EventEmitter], but I don't see it used anywhere...
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