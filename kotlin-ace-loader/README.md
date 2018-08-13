#### For full readme, see [repository home](https://github.com/daemontus/kotlin-ace-wrapper#readme).

This is just a small utility webpack loader designed to resolve Ace classes
in the web and web-worker context.

On web, it resolves the classes using the Ace-builds dependency. For web workers,
it assumes the kotlin-ace-worker module is present. It then uses the bundled class-loader.js
to init all Ace classes. Once the class-loader.js is loaded, Ace classes can be loaded
as in other Ace web workers.

Note that we don't have dependency on ace-builds or kotlin-ace-worker because these 
depend on the final runtime environment. 