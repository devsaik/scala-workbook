//----types and Type Interference--------
// Type Inference as Double
val radius= 10.0
// automatically casts int to double in the below Line
val radius3:Double = 10
// Any , AnyVal, AnyRef scala stype system unified
//AnyVal :: Boolean,Double,Int,Char
//AnyRef :: Classes,Strings,collections,Array
def printAny(x:Any)= println(x)
def printAnyRef(y:AnyRef)= println(y)
def printAnyVal(z: AnyVal)= println(z)
val someVal=5
val someRef= List(1,2,3)
printAny(someVal)
printAny(someRef)
printAnyRef(someRef)
printAnyVal(someVal)
//error here
//printAnyRef(someVal)
//error here
//printAnyVal(someRef)
val name = "Sai"
val greeting = "Hello"
s"$greeting i am $name "
val daysOfWeek = List("Mon","Tue","Wed")
for (k<-0 to daysOfWeek.size-1){
  println(daysOfWeek(k))
}
for (k<-0 until daysOfWeek.size){
  println("-----")
  println(daysOfWeek(k))
}
println("below for loop is a statement")
for (day<-daysOfWeek){ day match {
  case "Mon" => println("Manic Monday")
  case anyday => println(anyday)
}

}
println("below for loop is an expression")
for (day<-daysOfWeek)yield{ day match  {
  case "Mon" => "Manic Monday"
  case anyday => anyday
}

}
println("pattern guards if condition with in the expression of the for loop ")
for (day<-daysOfWeek if day == "Mon" ) {
  println(day)
}

println("Nested for loops can be avoided")
for {i<-0 to 2
     j <- 4 to 7 }{

println(s"$i is a $j")
}

// if I pass val here as neither monday nor sunday then the result is a match error
val dayOfTheWeek= "Wednesday"
val typeOfDay = dayOfTheWeek match {
  case "Monday"|"Saturday" => "Yo Yo Mon" // you can use OR operator
   // value binding in the below line
  case someOtherDay if someOtherDay == "Wednesday" => "Man guard here Wednesday"
  case "Sunday" => "Nah Nah"
    // case _ => "Any other day" this can also be done
  case allOtherDay => "Any other day"
}
