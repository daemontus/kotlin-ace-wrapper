/**
 * This is a class loader file for ace workers. It should be loaded after ace-worker.js but before the main module
 * is loaded.
 */

// common classes
var ace_EventEmitter = require("ace/lib/event_emitter").EventEmitter;
var ace_Anchor = require("ace/anchor").Anchor;
var ace_Document = require("ace/document").Document;
var ace_Range = require("ace/range").Range;

// worker specific
var ace_Mirror = require("ace/worker/mirror").Mirror;