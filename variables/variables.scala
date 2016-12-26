object variables extends App {
  // General syntax for variable declaration is
  // var VariableName : DataType = Initial Value
  var bar : String = "bar"; println(bar)

  // Variable type inference. Compiler figures out that message is a String
  var message = "foo"; println(message)
  message = "bode"
  
  // var declares a 'variable' i.e. it is mutable
  // val delcares a 'constant' i.e. it is immutable
  val x=10 // x is a constant
}
