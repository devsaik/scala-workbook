// Functions are Objects but methods are not
// Function definition below, functions are objects of type function1
// till function 23 from a trait
// functions do not work with type parameters or parameter default values

// Function object here
val getArea = (radius: Double) =>{
  val PI=3.14
  PI*radius*radius
}: Double

getArea(2)

// Method Definition, Methods are faster
// by the way this works in scala worksheet but ideally methods should always
// live in classes
def getAreaMethod(radius:Double):Double={
  val PI=3.14
  PI*radius*radius
}
getAreaMethod(2)
// Methods being converted to functions

// below line doesn't compile
//val areaConverted = getAreaMethod

// Way to deal with it is by explicitly specifying type

val areaConverted: (Double)=> Double =getAreaMethod
areaConverted(10)

// there is a shortcut for this

val areaConvertedShortcut = getAreaMethod _
areaConvertedShortcut(10)

// Below is the scenario where shortcut doesn't work

def getAreaClosure(r:Double):Double = {
  val PI:Double =3.14
  val getAreaIn ={
    r*r*PI
  }:Double
  getAreaIn
}

// below line will not give right result
val closureConverted = getAreaClosure _
closureConverted(10) // but this works here

