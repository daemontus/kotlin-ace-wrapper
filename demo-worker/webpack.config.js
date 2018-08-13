'use strict';
var path = require('path');

var config = {
    "target": "webworker",
    "context": path.resolve("./js"),
    "entry": {
        "worker": "./demo-worker.js"
    },
    "output": {
        "path": path.resolve("./bundle"),
        "filename": "[name].bundle.js",
        "chunkFilename": "[id].bundle.js",
        "publicPath": "/"
    },
    "resolve": {
        "modules": [
            "js",
            "resources/main",
            "./build/node_modules",
            "node_modules"
        ]
    }
};

module.exports = config;
