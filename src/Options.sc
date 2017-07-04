

//Options are scala containers that can be used  for
//testing presence or absence of a value
// Type space alternative for specifying null value in java
// Option can result in either instance of Some or None

def fraction(numerator:Double,denominator:Double):Option[Double]={
  if(denominator ==0)
    None
  else
    Option(numerator/denominator)
    // Interesting you could have used Some here
}
fraction(22,7)
fraction(1,0)

val pi =fraction(22,0)getOrElse("Insane action")

fraction(22,7) match{
  case Some(ani)=>ani
  case None => "Screwed up"

}

val stateCodes = Map("California" -> "ca",
  "Nevada" -> "nv",("New York", "NY"))

// Below line will result in an exception
//val stateCode = stateCodes("NoSuchState")


// Result of the below statement is a Failure
val stateCodeWithTry = util.Try{stateCodes("NoSuchState")}

// Failure(error) in below is called Failure value binded with error
stateCodeWithTry match {
  case util.Success(code) =>"Yes It's success:: "+code
  case util.Failure(error) => "Nah::"+error
}

