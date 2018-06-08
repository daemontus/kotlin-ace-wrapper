# Kotlin + Ace (wrapper)

[Ace](https://ace.c9.io/) is a great **ebeddable code editor** which provides a ton of themes and language modes to work with. However, **writing new modes or syntax validators is not always easy**. Especially since in most cases, you end up writing one parser for the front-end (data entry) and then another for the back-end (data processing). To get rid of this duplicity, we want to use **the same language for both front-end and back-end**: [Kotlin](http://kotlinlang.org/). 

Due to various design decisions made by Ace and Kotlin teams, this isn't always as easy as it could be. This library takes away the pain of working with Ace editor inside Kotlin by exposing Ace's API as standard Kotlin classes.

# Getting started

There are two main modules: 
 - **Web:** wrapper around Ace APIs for interaction with the code editors, such as EditSession or Tokenizer.
 - **Worker:** allows creation of web workers for [syntax validation](https://github.com/ajaxorg/ace/wiki/Syntax-validation).

Note that the JS files in the worker module are meant to be run in a web worker context, and therefore you should never run them directly in your main website JS context. For more information about workers, see the **TODO** worker tutorial.

## Distribution

You can include the library into any Gradle/Maven project using [Jitpack](https://jitpack.io/#daemontus/kotlin-ace-wrapper):

```
repositories {
  ...
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.daemontus.kotlin-ace-wrapper:web:VERSION_HERE'
  // Worker module should not be available in the web context, so your web modules 
  // should not be able to access the module at compile time, only at runtime.
  runtime 'com.github.daemontus.kotlin-ace-wrapper:worker:VERSION_HERE'  
}
```

This gives you a jar file with all necessary javascript files. In the demo **TODO** build.gradle, you can see how to include these javscript files into your distribution.

This form of distribution is primarily useful for JVM related projects. If you have other, more JS friendly, preferred method of distribution (npm, etc.), please create an issue/pull request with your suggestion.

### Versioning

Each version of the wrapper should match the version of the Ace editor for which it was written, suffixed with a wrapper version number. So a wrapper of version `1.3.1-2` is a wrapper of Ace `1.3.1` and it is the version `2` for this specific Ace version. For best results, you should always use matching wrapper and Ace versions, but often no changes are necessary between versions, since Ace API is quite stable.

## Set-up

To initialize the web module, simply load the provided JS files in the following order:

```
<!-- Ace Editor - not included in the distribution. -->
<script src="ace.js" type="text/javascript"></script>

<!-- Class loader - a small piece of JS which exposes the Ace classes to the Kotlin code. -->
<script src="class-loader.js" type="text/javascript"></script>

<!-- Kotlin JS standard library, obviously :) -->
<script src="kotlin.js" type="text/javascript"></script>

<!-- A few common classes shared by the web and worker contexts. -->
<script src="ace-common.js" type="text/javascript"></script>
<!-- All web specific APIs for editor manipulation. -->
<script src="ace-web.js" type="text/javascript"></script>
```

Once you have the dependencies set-up, you can start loading your own Kotlin code. For a more detailed example see the **TODO** demo module or some of the tutorials.

## Tutorials

To see how to use the wrapper efficiently, please refer to some of the following tutorials:

 - **TODO** Basic functionality.
 - **TODO** Custom themes.
 - **TODO** Custom syntax highlighting.
 - **TODO** Custom syntax validation via web workers.

## Demo

The repository contains a simple demo project **TODO** showcasing the functionality described in the tutorials. It is a simple editor with a custom theme, a custom tokenizer for syntax highlighting and custom syntax validation worker.

### Documentation, completeness and reliability

Currently, the wrapper exposes most methods documented in the Ace [API reference](https://ace.c9.io/#nav=api) and also some undocumented APIs which are necessary for extending Ace's basic functionality. However, there is no comprehensive documentation for the wrapper itself. It would be awesome to have a more detailed documentation in the future. However, this is just a small sideproject, so I mainly maintain and test the features I actually need and the documentation focuses mainly on tutorials. If you find some inconsistency with the actual Ace API or some missing features, feel free to send a pull request or create an issue. Ideally, please provide a use case for testing this problem too.
