// Here we will discuss methods which operate on 1 element at a time
//Map, foreach,filter,partition,sortBy

val myList = List(3,5,7,9,11)
// Below  will not work becasue it has no return value so it has to be a procedure
//val foreachList = myList.foreach(_*2)
// this will  work because it has a side effect of printing
// foreach is a statement
// it can be used when there is a procedure
val foreachList = myList.foreach(println(_))
// map is very similar to foreeach but it is chainable
// returns a list
// composable
// map is an expression
val mappedList = myList.map(_*2)
val mappedList1 = myList.map(_==3)
val divisibleBy3 = (x:Int)=>{x%3==0}:Boolean

val mappedChaining = myList.map(divisibleBy3)
// Filter takes in a Boolean predicate
val filteredList = myList.filter(divisibleBy3)

val partitionedList = myList.partition(divisibleBy3)

// sortBy on a Criteria
val myOtherList = List("Mon","Tue","Wed", "Thu","Fri")
// Friday comes first as each elemnt is sorted by its First Character
val elementsSortedBy = myOtherList.sortBy(_(0))