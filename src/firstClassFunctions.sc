// Functions are first class citizens, what that means
// 1. Functions can be assigned to variables
// 2. Functions can be passed a parameter to another functions
// 3. Functions can be return values for another functions

//Nested functions

def getCircleStats(r:Double)={
  val PI=3.14
  val getArea={
    r*r*PI
  }:Double
  val getCircum={
    r*PI*2
  }:Double
  //returns tuple of values of both the functions
  (getArea,getCircum)
}
getCircleStats(10)

def compareStringAscending(s1:String,s2:String):Int={
  if(s1>s2)
    return 1
  else if(s1==s2)
    return 0
  else
    return -1

}
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
smartCompare("abc","bcd",compareStringAscending)
smartCompare("abc","bcd",compareStringDescending)

def getComparator(reverse:Boolean):(String,String)=>Int ={
  if(reverse)
    compareStringDescending
  else
    compareStringAscending

}

val asc= getComparator(false)
asc("abc","bcd")

val desc = getComparator(true)
desc("abc","bcd")