package ace

val Module.mirror: String
    get() = "ace/worker/mirror"

private external fun define(path: String, dependencies: Array<String>, init: (dynamic, dynamic) -> dynamic)
private external fun <T> require(path: String): T