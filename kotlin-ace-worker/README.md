#### For full readme, see [repo](https://github.com/daemontus/kotlin-ace-wrapper#readme).

Worker module of wrapper for Ace editor to Kotlin/JS. 
Contains classes which are specific to the web worker environment
and also the javascript resource implementing the classes (based on
actual Ace workers).

When using the module, don't forget to set webpack environment to web worker,
otherwise the kotlin-ace-loader won't be able to find the classes.