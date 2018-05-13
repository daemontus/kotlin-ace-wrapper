import ace.internal.Mirror
import ace.internal.Sender

class DemoWorker(sender: Sender) : Mirror(sender) {

    init {
        setTimeout(1000)
    }

    override fun onUpdate() {
        super.onUpdate()
        println("Worker update notification... running syntax check.")
    }
}