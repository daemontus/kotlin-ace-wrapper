if (typeof ace === 'undefined') {
    throw new Error('Error loading ace classes. Ace is not defined. Please load Ace first.')
}

// load common classes
var ace_EventEmitter = ace.require("ace/lib/event_emitter").EventEmitter;
var ace_Anchor = ace.require("ace/anchor").Anchor;
var ace_Document = ace.require("ace/document").Document;
var ace_Range = ace.require("ace/range").Range;

// load web classes
var ace_Search = ace.require('ace/search').Search;
var ace_Selection = ace.require('ace/selection').Selection;
var ace_TokenIterator = ace.require('ace/token_iterator').TokenIterator;
var ace_Tokenizer = ace.require('ace/tokenizer').Tokenizer;
var ace_UndoManager = ace.require('ace/undomanager').UndoManager;
var ace_VirtualRenderer = ace.require('ace/virtual_renderer').VirtualRenderer;
var ace_ScrollBar = ace.require('ace/scrollbar').ScrollBar;
ace_ScrollBar.ace_ScrollBarV = ace.require('ace/scrollbar').ScrollBarV;
ace_ScrollBar.ace_ScrollBarH = ace.require('ace/scrollbar').ScrollBarH;
var ace_EditSession = ace.require('ace/edit_session').EditSession;
var ace_Editor = ace.require('ace/editor').Editor;
var ace_BackgroundTokenizer = ace.require('ace/background_tokenizer').BackgroundTokenizer;
var ace_DOM = ace.require("ace/lib/dom");

// load internal classes
var ace_Cursor = ace.require('ace/layer/cursor').Cursor;
var ace_TextMode = ace.require('ace/mode/text').Mode;
var ace_WorkerClient = ace.require('ace/worker/worker_client').WorkerClient;