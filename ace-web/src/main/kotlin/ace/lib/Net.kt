package ace.lib

@JsModule("kotlin-ace-loader!?id=ace/layer/net")
external object Net {

    fun get(url: String, callback: dynamic)

    fun loadScript(path: String, callback: dynamic)

    fun qualifyURL(url: String): String

}