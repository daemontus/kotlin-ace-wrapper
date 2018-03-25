package ace.internal

/**
 * First argument is the emitted event, second argument is the event emitter on which
 * was the event emitted.
 */
typealias EventHandler<E> = (E, EventEmitter) -> dynamic

/**
 * Invoked with the event instance every time an event is emitted.
 */
typealias EventListener<E> = (E) -> Unit

external interface EventEmitter {

    /**
     * Execute [callback] on next [eventName], but only once.
     */
    fun <E> once(eventName: String, callback: EventListener<E>)

    /**
     * Default handler is called *after* event propagation finished. It's return value is then returned
     * by the private dispatchEvent method.
     *
     * @see [removeDefaultHandler]
     */
    fun <E> setDefaultHandler(eventName: String, callback: EventHandler<E>)

    /**
     * Remove default handler.
     *
     * @see [setDefaultHandler]
     */
    fun <E> removeDefaultHandler(eventName: String, callback: EventHandler<E>)

    /**
     * Alias for [addEventListener] with capturing = false.
     *
     * @see [addEventListener]
     */
    fun <E> on(eventName: String, callback: EventListener<E>)

    /**
     * Register an event listener which fires every time event with given [eventName] is dispatched.
     *
     * @see [removeEventListener]
     */
    fun <E> addEventListener(eventName: String, callback: EventListener<E>, capturing: Boolean)

    /**
     * Alias for [removeEventListener].
     *
     * @see [removeEventListener]
     */
    fun <E> off(eventName: String, callback: EventListener<E>)

    /**
     * Remove event listener.
     *
     * @see [addEventListener]
     */
    fun <E> removeEventListener(eventName: String, callback: EventListener<E>)

}