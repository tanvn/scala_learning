class Parent {
//  final val age = 10
  val age = 10
}

class Child extends Parent{

  override val age = 30

  def printVal ={
    println(age)
  }

}

