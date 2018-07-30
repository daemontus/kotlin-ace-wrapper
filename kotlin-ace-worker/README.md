#### For full readme, see [repo](https://github.com/daemontus/kotlin-ace-wrapper#readme).

Worker module of wrapper for Ace editor to Kotlin/JS. 
Contains classes which are specific to the web worker environment
and also the javascript resource implementing the classes (based on
actual Ace workers).

When running the worker, make sure to first load ace-classes.js. You can also
use worker-init.js with Ace standard worker system to load dependencies dynamically.