val source = Array("hello","this", "is", "me","trying","to","escape","from","the","reality","sometimes","I", "feel","unhappy")
val mapByLength =source.groupBy(_.length)
for((k,v) <- mapByLength){
  println(k + " : "+ v.mkString(","))
}

"Hello Tokyo".partition(_.isUpper)

val myArr = Array(1,2,3,4,5,-10,4,23,-8,6,-12)
val partitionArr = myArr.partition(_ <0)
partitionArr._1(0)

val symbols = Array("A","B","C")
val count = Array(10,2,3)

val res = count.zip(symbols)
for((cnt, char)<- res){
  println(char * cnt)
}