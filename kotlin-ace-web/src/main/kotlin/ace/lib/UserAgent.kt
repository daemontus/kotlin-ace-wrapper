package ace.lib

@JsModule("kotlin-ace-loader!?id=ace/lib/useragent")
external object UserAgent {

    fun getOS(): String

    val isWin: Boolean
    val isMac: Boolean
    val isLinux: Boolean
    val isIE: Boolean
    val isOldIE: Boolean
    val isGecko: Boolean
    val isOpera: Boolean
    val isChrome: Boolean
    val isAIR: Boolean
    val isIPad: Boolean
    val isChromeOS: Boolean
    val isIOS: Boolean

}