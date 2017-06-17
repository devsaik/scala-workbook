//Code reuse using fn level

//1. Parameter default values
def getAreaClosure(PI:Double =3.14,r:Double):Double = {

  val getAreaIn ={
    r*r*PI
  }:Double
  getAreaIn
}
// make sure we specify name of parameter here `r`
getAreaClosure(r=2.0)

//2. Type parameters(Like Generics in Java)
def printValues[K,V](x:K,y:V)={
val keyType= x.getClass
val valType = y.getClass
println("Key:::"+keyType)
  println("val:::"+valType)
}
// 3. Partially applied functions
// arity: number of input arguments to a function
// In Java similar concept is overloaded version of the function
def compareStringDescending(s1:String,s2:String):Int={
  if(s1<s2)
    return 1
  else if(s1==s2)
    return 0
  else
    return -1
}

//Higher order functions
// a function whose return value is a function
// A function with a parameter that is a function
def smartCompare(s1:String, s2:String,
                 cmpFn:(String,String)=>Int):Int={
  cmpFn(s1,s2)

}
//superSmartCompare is a partial function, first two values are made free
val superSmartCompare = smartCompare(_:String,_:String,compareStringDescending)
superSmartCompare("abc","bcd")

//4. Currying, similar to Partial Functions
// Parameter groups is the key here
def curriedCompare(cmpFn:(String,String)=>Int)(s1:String,s2:String)=cmpFn(s1,s2)
val defaultCompare =curriedCompare(compareStringDescending)
defaultCompare("abc","bcd")