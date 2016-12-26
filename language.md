Language notes
==============
I don't know Java so all those tutorials that compare scala to Java are lost on me

Comments:
---------

```
// Single line comments

/* Multi-line comments
 * Can be done
*/ As well
```

Line termination
----------------
* Lines are terminated by newline or semicolon. Doesn't matter which.

* Multiple statements on one line are separated by semicolon

```
val message = "foo"; println(message)
```

Variables
---------
General syntax for variable declaration is
```
var VariableName : DataType = Initial Value
```

For example: 

```
var bar : String = "bar"; println(bar)
```

You don't have to give the DataType in many cases. Thanks to **Variable type Inference**, the compiler figures out that message is a String in the following

```
var message = "foo"; println(message)
```

Var and Val
-----------

Objects declared with `var` are 'variable' i.e. they are mutable

Objects declared with `val` are 'constant' i.e. they are immutable

`val x=10 // x is a constant`

`x=x+1 // This will fail`
