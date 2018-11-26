import java.net.URL
import java.util.Scanner

import scala.io.Source

val content = Source.fromURL("http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt")

val count = scala.collection.mutable.Map[Char, Int]()
while(content.hasNext){
  val word = content.next()
  count(word) = count.getOrElse(word, 0) + 1;
}

println(count)

val in = new Scanner(new URL("http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream())
val count2 = scala.collection.mutable.Map[String, Int]()

while(in.hasNext()){
  val word = in.next()
  count2(word) = count2.getOrElse(word, 0) + 1;
}

count2("Alice")

var testMap = scala.collection.mutable.Map[String, Int]()

testMap += ("test" -> 5)
testMap += ("test" -> 6)
testMap