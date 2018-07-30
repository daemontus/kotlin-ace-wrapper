package ace.lib

@JsModule("kotlin-ace-loader!?id=ace/lib/keys")
external object Keys {

    operator fun get(keyCode: Int): String

    fun keyCodeToString(keyCode: Int): String

}