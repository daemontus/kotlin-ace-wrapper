package ace

/*
 * Event names are defined as extension properties on the respective classes.
 */

val Document.EVENT_CHANGE: String
    get() = "change"

val Anchor.EVENT_CHANGE: String
    get() = "change"