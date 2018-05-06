import ace.ACE
import ace.EditSession_changeFold
import ace.Editor
import ace.Events

fun main(args: Array<String>) {
    println("Demo here!")
    val editor: Editor = ACE.edit("editor") // Start Ace editor
    println("Got editor: $editor")
    println("Events: ${Events.EditSession_changeFold}")

}