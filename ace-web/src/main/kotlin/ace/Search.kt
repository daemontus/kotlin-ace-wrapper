package ace

/**
 * https://ace.c9.io/#nav=api&api=search
 */
@JsModule("kotlin-ace-loader!?id=ace/search&name=Search")
open external class Search {

    fun find(session: EditSession): Range

    fun findAll(session: EditSession): Array<Range>

    fun getOptions(): dynamic

    fun replace(input: String, replacement: String): String

    fun set(options: dynamic): Search

    fun setOptions(options: dynamic)

}