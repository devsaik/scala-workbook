// Lists has many higher order methods
// Lists by default are immutable
// Lists are fixed length and Values cannot be changed
// Lists in scala are singly linked lists
// Lists are terminated with a nil value(special)
// Nil is a special value technically it is a List[Nothing]

// Creating a List with Cons(Construct) operator
val weekDaysCons = "Mon"::"Tue"::"Wed"::"Thu"::"Fri"::Nil
// Lists are right associative
// what does that even mean ?
// means First a List with Nil operator is created and then
// element to its Left is added(which is "Fri") here

// Creating Lists using apply method
val weekDays = List("Mon", "Tue","Wed", "Thu","Fri")

// Creating Lists by concatenating two other Lists by using :::
val weekEnd = List("Sat","Sun")
val days = weekDays:::weekEnd

// flatten Method
val daysFlatten = List(weekDays,weekEnd).flatten

// Tuples of values of two Lists
val dayIndeces = List(1,2,3,4,5,6,7)
val extraDayIndeces = List(8,9,10,11,12,13,14)
dayIndeces zip extraDayIndeces

// simple operations
// head will call first element of list
weekDays.head
// tail will call everything except  first
weekDays.tail
weekDays.size
weekDays.reverse
weekDays(0)
weekDays.contains("Tue")
for (c <- weekDays)
  println(c)
// Higher order methods // there is no day as wed123 thats why it is true
days forall(_ != "Wed123")

// whether days end with anotherList called weekEnd and it will be true
days endsWith weekEnd

// whether days start with another List called weekDays (true)
days startsWith weekDays

