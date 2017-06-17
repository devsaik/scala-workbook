val x =1
// lambda or anonymous function which is assigned to a variable
val square = (x:Int)=> x*x
var a = {a:Int => a*2}
a.apply(2)
a(3)
val sum = (k:Int,j:Int)=> k+j
sum(2,3)
//Trying curried style below expression not possible
//sum(4)(3)
// In order to make it possible I can curry it

// essentially I can make a curried Function without lambda
def sum1(tk:Int)(bk:Int)= tk+bk
sum1(2)(3)

//curried function with lambda

val sumCurried =(cj:Int)=>(ck:Int)=>cj+ck
sumCurried(2)(3)

// taking an n and applying a function to that n

def doIt(n:Int,f:Int=>Int)=f(n)
doIt(2,square)
def expmnt(ne:Int,me:Int):Int=(ne%me)
def partialMul(pm:Int,nm:Int)= (dm:Int)=>{
  println("hi")
  dm*pm}

// question for J
//def doItAgain(n:Int,m:Int,f:(Int,Int)=>Int=>Int)=f(n,m)
//doItAgain(2,5,sum)
def doItAgain(n:Int,m:Int,f:(Int,Int)=>Int=>Int)=f(n,m)
val fx=doItAgain(2,5,partialMul)
fx(20)
val p : PartialFunction[Int, String]={
  case 1 =>"one"
  case 2 => "two"
}
val mp =p
p(1)
def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    // catch Exception to catch null 's'
    case e: Exception => None
  }
}
val myStringList = Seq("1","2","3")
val myCharList = List(("1","2","3"),("3","2","1"))
val myNewMappedList=myStringList.map(toInt)
val myIntList = List(List(1,2,3),List(3,2,1))
val myFlattenedIntList = myIntList.flatten
//println(myFlattenedIntList(3).toString)
val myGenericList = List(1,2,3)
def g(v:Int) = 2*v
val myMappedIntList = myGenericList.map((i:Int)=>i*2)
val myFlatMappedList = myIntList.flatMap(x => x.map(_ * 2))
// below line not possible because there are no list of lists
//val myFlatMappedGeneric1List = myGenericList.flatMap(x => 2*x)


val myFlatMappedGeneric1List = myGenericList.flatMap(x => 2*x :: Nil)

