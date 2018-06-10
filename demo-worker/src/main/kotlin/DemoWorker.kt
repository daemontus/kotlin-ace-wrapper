import ace.AnnotationType
import ace.GutterAnnotation
import ace.internal.Mirror
import ace.internal.Sender
import ace.makeGutterAnnotation

class DemoWorker(sender: Sender) : Mirror(sender) {

    init {
        setTimeout(1000)
    }

    override fun onUpdate() {
        super.onUpdate()
        println("Worker update notification... running parenthesis check.")

        val errors: List<GutterAnnotation> = document.getAllLines().mapIndexedNotNull { row, line ->
            try {
                val end = line.checkParentheses(row, 0)
                if (end != line.length) throw error("Unexpected )")
                null
            } catch (error: RuntimeException) {
                makeGutterAnnotation(row, AnnotationType.ERROR, error.message)
            }
        }

        println("Check results: ${errors.size} error(s).")

        sender.emit("errors", errors.toTypedArray())
    }

    private fun String.checkParentheses(row: Int, start: Int): Int {
        var i = start
        while (i < length && this[i] != ')') {
            if (this[i] == '(') {
                i = checkParentheses(row, i+1)
                if (i >= length || this[i] != ')') throw error("Unclosed (")
            }
            i += 1
        }
        return i
    }

}