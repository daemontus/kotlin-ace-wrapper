package ace.internal

import ace.Document

@JsName("ace_Mirror")
open external class Mirror(sender: Sender) {

    /**
     * Use sender to communicate with teh starting script.
     */
    val sender: Sender

    /**
     * Mirror is responsible for updating this document to reflect the changes performed
     * on the website.
     */
    @JsName("doc")
    val document: Document

    /**
     * Use this method to set the refresh interval.
     */
    fun setTimeout(value: Int)

    /**
     * Override this method to implement action on document update.
     */
    open fun onUpdate()

}