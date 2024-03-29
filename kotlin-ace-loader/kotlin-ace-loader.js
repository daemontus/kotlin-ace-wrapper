/**
 * The loader simply receives an Ace id and a class name, loads the corresponding module and unwraps the class.
 *
 * If no name is provided, it simply assumes the module is the class.
 */
module.exports = function() {
    var parseQuery = require('webpack-parse-query');
    var options = parseQuery(this.resourceQuery);
    var id = options["id"];
    var name = options["name"];
    if (!id) {
        throw new Error("No Ace module id found in query: `"+this.resourceQuery+"`.");
    }
    var code;
    if (this.target === 'webworker') {
        // Web worker does not have the full Ace as a dependency. The necessary classes
        // are loaded from global context.
        code = "require('script-loader!kotlin-ace-worker/class-loader.js'); module.exports = ace.require('"+id+"')";
    } else if (this.target === 'web') {
        // On web, load Ace, then load class.
        code = "module.exports = require('ace-builds').require('"+id+"')";
    } else {
        throw new Error("Ace cannot be executed on target `"+target+"`.");
    }
    if (name) code = code + "." + name;
    return code;
};