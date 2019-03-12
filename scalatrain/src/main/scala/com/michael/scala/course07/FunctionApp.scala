package com.michael.scala.course07

object FunctionApp extends App {
  //  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  //  list.map((x: Int) => x + 1)
  //  list.map(_ * 2).foreach(println)
  //  list.map(_ * 2).filter(_ >= 8).foreach(println)
  //  println(list.reduce(_-_))

  //  println(list.mkString(","))

  val txt = scala.io.Source.fromFile("C:\\Users\\beyon\\Desktop\\helloworld.txt").mkString
  println(txt)

  val txts = List(txt)
  val count = txts.flatMap(_.split(",")).map(x => (x, 1)).



}
