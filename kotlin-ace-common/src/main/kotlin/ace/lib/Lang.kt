package ace.lib

@JsModule("kotlin-ace-loader!?id=ace/lib/lang")
external object Lang {

    fun last(string: String): Char

    fun stringReverse(string: String): String

    fun stringRepeat(string: String, count: Int): String

    fun stringTrimLeft(string: String): String

    fun stringTrimRight(string: String): String

    /**
     * This type of copy does not preserve Kotlin type info!
     */
    fun copyObject(any: dynamic): dynamic

    fun <T> copyArray(array: Array<T>): Array<T>

    fun deepCopy(any: dynamic): dynamic

    fun <T> arrayToMap(array: Array<T>): Map<Int, Int>

    fun createMap(props: dynamic): dynamic

    fun <T> arrayRemove(array: Array<T>, value: T): Array<T>

    fun escapeRegExp(regex: String): String

    fun escapeHTML(html: String): String

    fun generateMatchOffsets(string: String, regex: String): Array<Match>

    interface Match {
        val offset: Int; val length: Int
    }

    fun deferredCall(action: () -> Unit): Deferred

    interface Deferred {
        fun call(): Deferred; fun cancel(): Deferred; fun isPending(): Int
    }

    fun delayedCall(action: () -> Unit, defaultTimeout: Int): Delayed

    interface Delayed : Deferred {
        fun delay(timeout: Int)
    }

}