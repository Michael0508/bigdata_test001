package com.michael.scala.course05

object ArrayApp extends App {
//println("test")
//
//  val a = new Array[String](5)
//  println(a.length)
//  a(1) = "addfghjkl"
//  println(a.mkString("<",",",">"))
//
//  val b  = Array("hadoop", "spark", "storm", "flink")
//  println(b.length)
//  b(3) = "asd"
//  val c = Array(1,3,1,2,4,56,6,5,-3,65,7,123)
//  println(c.max + "," +c.min +","+ c.sum )

  val d = scala.collection.mutable.ArrayBuffer[Int]()

d +=1
  d+=2
  d+= (3,4,5,6)
  d ++= Array(1,2,3,4,5,6,7,7)

  d.insert(3,100)
  d.remove(4)
  d.toArray

  println(d+ " "+ d.sum+ " " + d.max)

  d.foreach(println)




}



