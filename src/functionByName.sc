def notFunctionByName(x:String):String={
  println("I am "+x)
  println(x)
  x
}

def functionByName(y: => String):String={
  println("I am "+y)
  println(y)
  y
}

notFunctionByName("Sai")

functionByName("Sam")

def withAgreeting()={
  println("Greeting")
  "sai"
}
notFunctionByName(withAgreeting)
// you can observe greeting called multiple times
// This is specifically useful when funtions are used in Streaming
functionByName(withAgreeting)