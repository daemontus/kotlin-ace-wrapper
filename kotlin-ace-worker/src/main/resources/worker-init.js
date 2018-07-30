/**
 * This script is responsible for loading all worker scripts and then starting the worker.
 *
 * It assumes the first message contains an object with initialization data, described by the
 * [WorkerInit] kotlin class.
 *
 */

this.onmessage = function (e) {
    var msg = e.data;
    if (!msg.command || !msg.args || msg.command !== "importScripts") {
        throw new Error("Expected first message with script prefix data. Instead, got "+msg);
    } else {
        var dependencies = JSON.parse(msg.args);
        dependencies.forEach(function (url) {
            importScripts(url);
        });
    }
};