package com.michael.scala.course07

object CurryApp extends App {

  def sum2(a :Int)(b:Int): Double = {
    a + b
  }

  println(sum2(23)(11).toString)




}
