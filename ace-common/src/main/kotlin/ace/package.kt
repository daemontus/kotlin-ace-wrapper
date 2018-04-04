package ace

/**
 * Define extension properties on this object in order to declare events for specific classes.
 *
 * Example
 * val Events.MyClass_eventName
 *      get() = "event_name"
 */
object Events

val Events.Anchor_change: String
    get() = "change"

val Events.Document_change: String
    get() = "change"