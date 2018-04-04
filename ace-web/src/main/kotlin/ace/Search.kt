package ace

/**
 * https://ace.c9.io/#nav=api&api=search
 */
@JsName("ace_Search")
open external class Search {

    fun find(session: EditSession): Range

    fun findAll(session: EditSession): Array<Range>

    fun getOptions(): dynamic

    fun replace(input: String, replacement: String): String

    fun set(options: dynamic): Search

    fun setOptions(options: dynamic)

}