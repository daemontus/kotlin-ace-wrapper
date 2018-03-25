package ace

/**
 * Initialize instance of [T] which inherits from Ace class [R].
 */
inline fun <reified T: R, R: Any> T.initSuper0Arg(parent: JsClass<R>) {
    val thisClass = T::class.js
    inherit(this, parent)
    inherit(this, thisClass)
    parent.asDynamic().call(this)
}

/**
 * Initialize instance of [T] which inherits from Ace class [R].
 */
inline fun <reified T: R, R: Any> T.initSuper1Arg(parent: JsClass<R>, arg1: dynamic) {
    val thisClass = T::class.js
    inherit(this, parent)
    inherit(this, thisClass)
    parent.asDynamic().call(this, arg1)
}

/**
 * Initialize instance of [T] which inherits from Ace class [R].
 */
inline fun <reified T: R, R: Any> T.initSuper2Arg(parent: JsClass<R>, arg1: dynamic, arg2: dynamic) {
    val thisClass = T::class.js
    inherit(this, parent)
    inherit(this, thisClass)
    parent.asDynamic().call(this, arg1, arg2)
}

/**
 * Copy everything from [parent] class into [child] instance.
 */
inline fun <reified T: R, R: Any> inherit(child: T, parent: JsClass<R>) {
    val proto = parent.asDynamic().prototype
    usedInJs(child); usedInJs(proto)
    js("for (var key in proto) { child[key] = proto[key]; }")
}