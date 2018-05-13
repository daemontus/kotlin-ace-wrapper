import ace.internal.Mirror
import ace.internal.Sender

class DemoWorker(sender: Sender) : Mirror(sender) {

    init {
        setTimeout(1000)
    }

    override fun onUpdate() {
        super.onUpdate()
        println("Worker update notification... running parenthesis check.")

        val errors = document.getAllLines().mapIndexedNotNull { row, line ->
            try {
                val end = line.checkParentheses(row, 0)
                if (end != line.length) throw GutterAnnotation(row, end, "Unexpected )")
                null
            } catch (error: GutterAnnotation) {
                error
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
                if (i >= length || this[i] != ')') throw GutterAnnotation(row, i, "Unclosed (")
            }
            i += 1
        }
        return i
    }

    private data class GutterAnnotation(
            val row: Int, val column: Int, val text: String, val type: String = "error"
    ) : Throwable()
}