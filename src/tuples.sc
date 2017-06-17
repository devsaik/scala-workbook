//Non collection containers
// excellent aternative to light weight objects
// scala containers:
//1.Tuples 2. Options 3. Arrays 4. Maps 5. Lists 6.Mutable Collections
// The above collections can be categorized into 3
//1. Immutable 2.Mutable 3.Arrays
//1 and 2 implement java iterable interface

//1. Tuples: bunch of values enclosed in paranthesis
//ordered containers
// Tuples are technically not collections because they dont implement Iterable Interface
// Tuples implement Traits ex: Tuple1, Tuple2

// Creating a Tuple
val personalInfo = ("Saianirudh","Kantabathina", 34, "M")
// An easy way to create a Two element Tuple
val easyPersonalInfo = "Sai" -> "M"
// can I create 3 variable tuple
// This is interesting it created a Tuple of a tuple(String, String) and a string
val threeTuple = "Sai" -> "M" -> 33


// Apply a function Object to every element in the Tuple
// Clunky Syntax

personalInfo.productIterator.foreach{ i=> println("each ::"+i)}

// This is Fun
personalInfo.productIterator.foreach{ i=> i match {
  case _:Int =>  println("Age:: "+i)
  case _ => println("Others :: "+i)
}
}
// Accessing Individual Elements of a Tuple

// Easiest Way
val(firstName,lastName,age,gender)= personalInfo

// I dont even have to specify personalInfo.firstName
// Its direct assignment
println("fn::"+ firstName)


// clunkWay of accessing Individual values of a Tuple

println("Clunky firstName ::"+ personalInfo._1)

// How to use tuple to specify parameters to a function
// It is complicated in scala
val somePersonalInfo = ("Saianirudh", 34)
def personInfoPrint(name:String,age:Int )= {
  println("His name is :::"+ name)
  println("His Age is :::"+ age)

}

// There should be a match between parameters
(personInfoPrint _).tupled(somePersonalInfo)

// returns number of arguments
somePersonalInfo.productArity