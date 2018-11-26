import scala.collection.mutable.ArrayBuffer

var arr = ArrayBuffer(2,-3,4,5,6,-4, 5, -12,-20,31,30)

def removeAllButFirstNegativeEle(arr : ArrayBuffer[Int]) = {
  val indexesOfNegative = for(i <- 0 until arr.length if arr(i) < 0 ) yield i

  //indexesOfNegative

  var indexesToRemove = indexesOfNegative.drop(1);

  for(i <- indexesToRemove.reverse) arr.remove(i);

}


def removeAllButFirstNegativeEle2(arr : ArrayBuffer[Int]) = {


  var indexesToRemove = (for(i <- 0 until arr.length if arr(i) < 0 ) yield i).drop(1);

  for(i <- 0 until arr.length if !indexesToRemove.contains(i)) yield arr(i)

}

removeAllButFirstNegativeEle2(arr)
arr
removeAllButFirstNegativeEle(arr)
arr
