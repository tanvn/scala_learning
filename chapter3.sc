val nums = new Array[Int](10)

nums

val vNums = Array(10,30, "hello") // array of Any

//nums.indices
for(i <- 0 until nums.length){
  nums(i) = i*2
}
nums.size

nums(6)

import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer("hello", "world", "what", "a")
b += "nice"
b += ("day", "for", "staying", "at", "home")

b ++= Array("sleepy", "all", "the", "time")

b.remove(1)
b

b.insert(1, "everyone")
b

b.trimEnd(4)
b

val c = Array(10,20,30,40,50)

val d = for(ele <- c ) yield ele*3

d

c.sum
c.max

val origin = Array("hello", "world", "legend", "is", "here")
origin.max
val sorted = origin.sorted
origin
sorted

Array(1,2,3).toString
Array(2,3,4,5,6).mkString(" | ")
Array(2,3,4,5,6).mkString("[", ",", "]")


val scores = Map("Bob" -> 7, "Alice" -> 10, "Mike" -> 12, "Tin" -> 11 )

var mScores = scala.collection.mutable.Map("Sam" -> 13, "Scott" -> 5)
print(mScores("Thor") = 31)

mScores

mScores -= "Sam"
mScores += ("Tiny" -> 8, "Bred" -> 9)
mScores -= ("Tiny", "Sam", "Thor")
//"Rakuten" -> 500
//
//var samScore = mScores("Sam")
//
//var noExistScore = mScores.getOrElse("Thor", 19);

var states = scala.collection.mutable.Map[String, String]()
val test = (states("AK") = "Alaska")
states

val scores2 =scores + ("Newbie" -> 5, "Average" -> 10 )
scores

for((k,v) <- scores2) println(k + " has value : "+v);
for((k,v) <- scores2) yield k

scores2.keySet


var myFirstTuple = (1, "hello", 'c', 3.14)
myFirstTuple._3
myFirstTuple._1
//myFirstTuple += "world";

val (_, second, _, last) = myFirstTuple;