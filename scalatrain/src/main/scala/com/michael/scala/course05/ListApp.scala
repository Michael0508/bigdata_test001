package com.michael.scala.course05

object ListApp extends App {

  val list1 = 1 :: Nil

  val list2 = 2 :: list1

  val list5 = scala.collection.mutable.ListBuffer[Int]()

  list5 +=(1,2,3,4,5,6,7,8,10)

println(list5)

}
