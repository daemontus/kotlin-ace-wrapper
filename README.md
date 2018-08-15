[![Release](https://jitpack.io/v/daemontus/kotlin-ace-wrapper.svg)](https://jitpack.io/#daemontus/kotlin-ace-wrapper)
[![npm version](https://badge.fury.io/js/kotlin-ace-web.svg)](https://badge.fury.io/js/kotlin-ace-web)
[![Build Status](https://travis-ci.org/daemontus/kotlin-ace-wrapper.svg?branch=master)](https://travis-ci.org/daemontus/kotlin-ace-wrapper)

# Kotlin + Ace (wrapper)

[Ace](https://ace.c9.io/) is a great **embeddable code editor** which provides a ton of themes and language modes to work with. However, **writing new modes or syntax validators is not always easy**. Especially since in most cases, you end up writing one parser for the front-end (data entry) and then another for the back-end (data processing). To get rid of this duplicity, we want to use **the same language for both front-end and back-end**: [Kotlin](http://kotlinlang.org/). 

Due to various design decisions made by Ace and Kotlin teams, this isn't always as easy as it could be. This library takes away the pain of working with Ace editor inside Kotlin by exposing Ace's API as standard Kotlin classes.

## Project structure

The library supports two contexts: **web** and **worker**. Web is the standard Ace environment while worker provides a reduced set of features for syntax validation web-workers. Furthermore, there is a common module for shared classes and declarations and a loader module which allows importing the Ace classes when using webpack.

Finally, there is a demo worker and demo web module which illustrate the intended usage. The demo provides a very simple custom highlighter and validator which allow you to enter arbitrary arithmetic expression (numbers, +, -, /, *, parenthesis) and check that the parenthesis are correctly nested and closed. You can try the demo [here](https://daemontus.github.io/ace-wrapper/demo.html).

# Getting started

The library is designed to work with the [Kotlin frontend plugin](https://github.com/Kotlin/kotlin-frontend-plugin) as demonstrated in the [demo module](https://github.com/daemontus/kotlin-ace-wrapper/tree/master/demo-web). If you don't want to use the frontend plugin, you can still use the library with plain old webpack. 

> Unfortunately, in order to properly load all Ace classes into the Kotlin context, a custom loader has to be used. When using webpack, this is facilitated by the provided [loader](https://github.com/daemontus/kotlin-ace-wrapper/tree/master/kotlin-ace-loader). If not using webpack, you will have to declare these modules in some other way. In case of problems, feel free to create a new issue.

To start working with the web context in a gradle project, you simply have to add Jitpack into your list of repositories and include the dependency:

```
repositories {
   ...
   maven { url 'https://jitpack.io' }
}

dependencies {
   ...
   implementation 'com.github.daemontus.kotlin-ace-wrapper:kotlin-ace-web:1.3.36'
}

// If you are using the frontend plugin, inlude also the NPM dependency:
kotlinFrontend {
   npm {
      dependency("kotlin-ace-web", "1.3.36")
   }
}
```

Then, you can start using Ace in your Kotlin code just as you would in JS:
```
val editor = Ace.edit("editor")
val mode = MyCustomMode(editor)
editor.getSession().setMode(mode)
```

For web workers, the process is a little more complicated (the web worker has to be created as a separate module, because the contexts can't mix). For full description, head to the [custom web worker tutorial](https://github.com/daemontus/kotlin-ace-wrapper/wiki/Syntax-validation-using-workers).

## Tutorials

To see how to use the wrapper efficiently, please refer to some of the following tutorials:

 - [Custom themes](https://github.com/daemontus/kotlin-ace-wrapper/wiki/Custom-themes)
 - [Custom syntax highlighting](https://github.com/daemontus/kotlin-ace-wrapper/wiki/Custom-syntax-highlighting)
 - [Custom syntax validation via web workers](https://github.com/daemontus/kotlin-ace-wrapper/wiki/Syntax-validation-using-workers)

# Maintaining, completeness, documentation, versioning

Currently, the wrapper exposes most methods documented in the Ace [API reference](https://ace.c9.io/#nav=api) and also some undocumented APIs which are necessary for extending Ace's basic functionality. However, there is no comprehensive documentation for the wrapper itself. It would be awesome to have a more detailed documentation in the future. However, this is just a small sideproject, so I mainly maintain and test the features I actually need and the documentation focuses mainly on tutorials. If you find some inconsistency with the actual Ace API or some missing features, feel free to send a pull request or create an issue. Ideally, please provide a use case for testing this problem too.

The version numbers always match the used version of Ace suffixed with a patch version of the library. So a version `1.3.36` uses Ace `1.3.3` and it is the 6th patch version. While this is not ideal, for now, it seems to be the best solution which also correctly works with the semantic versioning used by npm.
