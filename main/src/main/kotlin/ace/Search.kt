package ace

fun JsClass<Search>.new(): Search = constructor0Arg(this)

external interface SearchModule {
    @JsName("Search")
    val search: JsClass<Search>
}

/**
 * https://ace.c9.io/#nav=api&api=search
 */
interface Search {

    fun find(session: EditSession): Range

    fun findAll(session: EditSession): Array<Range>

    fun getOptions(): dynamic

    fun replace(input: String, replacement: String): String

    fun set(options: dynamic): Search

    fun setOptions(options: dynamic)

}