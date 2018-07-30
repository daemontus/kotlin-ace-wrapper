package ace.lib

@JsModule("kotlin-ace-loader!?id=ace/lib/oop")
external object OOP {

    fun inherits(constructor: dynamic, superConstructor: dynamic)

    fun implement(prototype: dynamic, parent: dynamic)

}