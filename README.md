# Painting-Scala.js

##Build a simple page with Scala.js

The main purpose of the code to see if I can build a static page with Scala.js DOM API. This is dead simple page directly translated from the corresponding HTML page. 

The key differences are 

* use Scala JS DOM API and JQuery with out using Javascript directly.  
* The codes are type-safe
* The scala constants can be directly in the function that's usually used in the javascripts. 
* The code will be using Scala-Js-Workbench to do auto-compile the code via SBT. 
* 



To run it for development

```
sbt 
```
In SBT console

```
~packaegJS
```

Then on the browser, browse the file, for example, 

```
file:///Users/chester/projects/painting-scala-js/index-dev.html

````

You should see the people portraits from Artist Yueying Zhong.


Or you can do 



```
optmizeJS
```

Then on the browser, browse the file, for example, 

```
file:///Users/chester/projects/painting-scala-js/index.html

````
