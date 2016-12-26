Scala Notes
===========
My notes made as I learned scala

Compiling
---------
Compile with

```
scalac HelloWorld.scala
```

Run with

```
scala HelloWorld
```

Compile to the directory `myclasses`
```
mkdir myclasses
scalac -d myclasses HelloWorld.scala
```

Run from the directory `myclasses`

```
scala -cp myclasses HelloWorld
```

sbt (Scala Build Tool)
======================
* http://www.scala-sbt.org/
* Sources in the base directory or in `src/main/scala` or `src/main/java`
* The `build.sbt` file goes in base directory and looks like

```
name := "hello"

version := "1.0"

scalaVersion := "2.9.1"

showSuccess := false
```

* `sbt compile`
* `sbt run`
* `sbt --error run` - Gets rid of the verbose output `[info]` etc. Works in combination with `showSuccess := false` in `build.sbt`

You can also run the compiled code the `scala` command

* `scala -cp target/scala-2.12/classes/ HelloWorld`
