// functions are expressions
// Language determines world
// idiom in each language corresponds to the type of the climate
// language is shaped by a thought and viceversa
// object oriented systems for a monolithic apps
// distributed systems scala, function composition, immutable data
// no side effects
// final in java in scala thats the norm
// same output for same input pure functional
// parallelism : pure functions on immutable data
// inherently thread safe
// expression blocks or expressions both need to have a return value
// expressions can be chained, as arguments, can be used as functions
// for loops can be made as expressions by using yield
// for(day <- weekdays) yield {day match{ case "mon"=>"manic monday"}}
// function is really just a named reusable expression block
// units of code that return a value
// fns or expression blks both can be passed and returned as a val
// fns are named usually so can be reused but thats not the case with expression blocks

val weekDays =List("Mon","Tue","Wed","Thu")
for(day <- weekDays)
  day match {
    case "Mon" => "I am Manic monday"
    case otherDay => otherDay

}

val manicWeekDays =for(day <- weekDays) yield {
  day match {
    case "Mon" => "I am Manic monday"
    case otherDay => {
      println(otherDay)
      otherDay
    }

  }
}
manicWeekDays(0)
// first class citizens :: fns can be used in variables, Return value of a function canbe a function,
// A parameter of a function can be a function
val compareStringLiteral = (s1: String, s2: String)=>{
  if(s1==s2)0
  else if (s1>s2) -1
  else 1
}:Int

compareStringLiteral("K","L")