package ace.theme

import ace.Editor

/**
 * Theme defines styling properties for the Ace editor. It is not part of the Ace API,
 * but it is useful when declaring themes directly from Kotlin.
 *
 * Note that each theme needs to be registered using [Theme.register].
 * Then, it can be applied by passing its ID to [Editor.setTheme].
 *
 * Also remember that multiple theme css strings can be loaded at the same time,
 * so make always sure to prefix any selectors with the theme [cssClass].
 *
 * If you need to construct CSS files directly in Kotlin, you can also try
 * CSS DSL provided in Kotlin wrappers:
 * https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-css
 *
 */
interface Theme {

    val id: String

    val isDark: Boolean

    val cssClass: String
    val cssString: String

}