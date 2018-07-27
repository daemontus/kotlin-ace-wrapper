/**
 * The loader simply receives an Ace id and a class name, loads the corresponding module and unwraps the class.
 */
module.exports = function() {
    console.log(this.target);
    var loaderUtils = require('loader-utils');
    var options = loaderUtils.parseQuery(this.resourceQuery);
    var id = options["id"];
    var name = options["name"];
    if (!id) {
        throw new Error("Missing Ace module id.");
    }
    if (!name) {
        throw new Error("Missing Ace class name.");
    }
    if (this.target === 'webworker') {
        // Webworker does not have the full Ace as a dependency. The necessary classes
        // are loaded from global context.
        return "var classes = require('kotlin-ace-worker/classes.js'); module.exports = classes.require('"+id+"')."+name;
    } else if (this.target === 'web') {
        // On web, load Ace, then load class.
        return "module.exports = require('ace-builds').require('"+id+"')."+name;
    } else {
        throw new Error("Ace cannot be executed on target "+target);
    }
};