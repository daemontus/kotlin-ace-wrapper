package ace

fun Module.mirror() = "ace/worker/mirror"

external fun define(path: String, dependencies: Array<String>, init: (dynamic, dynamic) -> dynamic)
external fun <T> require(path: String): T