package com.michael.scala.course05

import scala.collection.mutable

object MapApp extends App {

  val a = Map("pk" -> 18, "zhangsan" -> 30)

//  println(a("pk") + " " + a("zhangsan"))

//  println(a.getOrElse("PK", 123))

//  a += ("wangwu" ->  5)
  println(a.mkString(","))
  val b = mutable.HashMap[String, Int]()
//  println(b.size)
  b  +=("pk" -> 5, "wcy" -> 6, "spark"  -> 10)
//  println(b.size)
//  b.foreach(println)
  for((value,key) <- b){
    println(value + "-" + key)
  }


}
