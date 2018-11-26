val x = 4;

val m = if (x > 1) 1 else 0

val anyType = if (x > 3) "anything" else 3

val unitType = if (x > 10) "not a unit"

val myUnit = () //unit is like void in Java

val myVal = {
  val a = 4
  val b = 5
  import scala.math._
  sqrt(a*a + b*b)
}

val emptyVal = {}

val n = 10

for (i <- 1 to n) println(i)

for (c <- "Hello world") println(c)

for(i <- 1 to 3; j <- 1 to 4) println(10 * i + j)

for(i <- 1 to 3; j <- 2 to 4 if i!=j) println(10 * i + j)


val myCollection = for(i <- 1 to 12) yield i*2

def increment(a : Double) = a+1
println(increment(10))


def fac(n :Int): Int= if(n <1) 1 else n*fac(n-1)

fac(4)

def box(x :String) ={
  val border = "-" * x.length + "--\n"
  print(border+ "|"+x + "|\n"+ border)

}

box("hello world")

def myErrorFac(n : Int) = {
  var r =1;
  for (i <- 1 to n) r = r *i;
  r
}

myErrorFac(6)



def decorate(text :String, left : String = "[", right:String ="]")= left+text+right
decorate("hello world")

decorate("hello world", ">>>[")

decorate("test me", right = "]<<<")

def seqArg(mySeq : Int*) = {
  var sum = 0
  for (e <- mySeq) sum += e
  sum
}
seqArg(1,2,3,4,5,6,7,8,9)
seqArg(1 to 10 : _*)

def recursiveSum(seq : Int*) : Int = {
  if(seq.size == 0) 0
  else seq.head + recursiveSum(seq.tail : _*)
}

recursiveSum(2,3,4,5,6,7,8,9,10)

def isVowel(ch : Char, vowelChars : String ="aiueo") = vowelChars.contains(ch)
isVowel('x')
isVowel('a')

def filterVowels(s :String) : String  = {
  var res = "";
  for(a <- s if isVowel(a)) res += a
  return res
}

def filterVowels2(s :String, vowelChars :String = "aiueo", ignoreCase : Boolean = true ) =
  for(a <- (if (ignoreCase) s.toLowerCase() else s) if isVowel(a,vowelChars)) yield a

def filterVowels3(s :String):String = {
  if(s.length == 0) ""
  else {
    var ch = s(0)
    var rest = filterVowels3(s.substring(1))
    if(isVowel(ch)) ch + rest else rest
  }

}

filterVowels3("this is my world")
filterVowels("hello world")

filterVowels2("here we go!", "auo")