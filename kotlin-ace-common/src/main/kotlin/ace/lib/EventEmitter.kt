package ace.lib

/**
 * Provides basic event-emitting functionality. Most classes
 * inherit from EventEmitter and can thus provide various types of events.
 */
@JsModule("kotlin-ace-loader!?id=ace/lib/event_emitter&name=EventEmitter")
@JsNonModule
abstract external class EventEmitter {

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

    /**
     * Emit a new event on this emitter.
     */
    @JsName("_emit")
    fun <E> emit(eventName: String, e: E)

}