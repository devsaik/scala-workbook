// Maps are Immutable associative containers
// Maps can be best understood as Key value pairs
// Key can be used to lookup the value

val stateCodes = Map("California" -> "ca",
  "Nevada" -> "nv",("New York", "NY"))

// In the above statement New York is a 2 element Tuple another way of
// specifying a Key Value Pair
stateCodes("New York")
// Below line will generate an Exception if no such state exists
//stateCodes("NoSUchState")
stateCodes.contains("California")
// Higher Order functions
//._1 and ._2 for accessing Key Value pairs
stateCodes.foreach((p:(String,String))=> println("I am::"+p._1+"="+p._2))
val states= List("California","Nevada","New York");
val codes = List("CA","NV","NY")
// Real Fun Below
val mapOfStates=(states zip codes).toMap

val listOfKeys=stateCodes.keySet.toList

val listOfVal = stateCodes.values.toList