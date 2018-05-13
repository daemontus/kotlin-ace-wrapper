package ace.internal

/**
 * Use the same way as ace.define, but on a global level in the worker script.
 */
external fun define(path: String, dependencies: Array<String>, factory: dynamic)