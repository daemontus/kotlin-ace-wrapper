import ace.ACE
import ace.Editor

fun main(args: Array<String>) {
    println("Demo script just started!")

    println("First, we declare a new dark theme for the editor with custom styles for our tokens.")
    val editor: Editor = ACE.edit("editor") // Start Ace editor
    val themeId = initTheme()
    editor.setTheme(themeId)

    println("Next, we want to initialize syntax highlighting. To do this, we need a text mode.")
    val mode = DemoMode(editor)
    editor.getSession().setMode(mode)

    println("And that's it. Ace will create syntax checking worker on demand once needed...")

}