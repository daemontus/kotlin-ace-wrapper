package ace.lib

/**
 * First argument is the emitted event, second argument is the event emitter emitting the event.
 */
typealias EventHandler<E> = (E, EventEmitter) -> dynamic

/**
 * Invoked with the event instance every time an event is emitted.
 */
typealias EventListener<E> = (E) -> Unit