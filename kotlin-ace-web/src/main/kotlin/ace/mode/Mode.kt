package ace.mode

import ace.EditSession
import ace.Editor
import ace.Tokenizer
import ace.worker.WorkerClient

@JsModule("kotlin-ace-loader!?id=ace/mode/text&name=Mode")
open external class Mode {

    open fun getTokenizer(): Tokenizer<*, *>

    open fun createWorker(session: EditSession): WorkerClient?

    fun toggleCommentLines(state: dynamic, session: EditSession, startRow: Int, endRow: Int)

    fun toggleBlockComment(state: dynamic, session: EditSession, range: dynamic, cursor: dynamic)

    fun getNextLineIndent(state: dynamic, line: dynamic, tab: dynamic): dynamic

    open fun checkOutdent(state: dynamic, line: dynamic, input: dynamic): Boolean

    open fun autoOutdent(state: dynamic, doc: dynamic, row: dynamic)

    fun createModeDelegates(mapping: dynamic)

    fun transformAction(state: dynamic, action: dynamic, editor: Editor, session: EditSession, param: dynamic)

    open fun getKeywords(append: dynamic): dynamic

    open fun getCompletions(state: dynamic, session: EditSession, position: dynamic, prefix: String): Array<Completion>

    interface Completion {
        val name: String; val value: String; val score: Int; val meta: String
    }

}

