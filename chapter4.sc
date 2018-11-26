import scala.math._
class Point(val x : Double, val y : Double){
  def move(dx :Double, dy : Double) = new Point(x+dx, y+dy)
  def distanceFromOrigin = sqrt(x*x + y*y)
  override def toString = f"(${x}, ${y})"
  def this() { this(0,0)}
  def *(factor : Double) = new Point(x * factor, y*factor)

  def +(plus : Double) = new Point(x+ plus, y+plus)
  printf(f"I will print you ${x}, ${y} \n")
}

val a = new Point(3,4)
a.move(4,5)
a.distanceFromOrigin
a.x
a.y
a.x + a.y

1 to 10 map (_ *2) filter(_ %3 ==1)

val myPoint = new Point(3,7)
myPoint * 2 + 3
1::2::3::Nil

val t = 69
//Prints 'E' the ASCII value of E is 69
println(t.toChar)

val s = "Hello World"
//Just like String char at, prints l
//Trace leads to the same String class charAt method
println(s.charAt(2))



def getInfoFromBackend() : List[Any] = {

  val dataList = List(1,"Literature",2,"Science")

  dataList

}


def getInfoFromBackend2()  = List {

  val dataList = List(1,"Literature",2,"Science")

  dataList

}

val x = 20

//Valid conversion
System.out.println(x.toByte)

//Run time error
val s = new Any
System.out.println(s.asInstanceOf[Byte])