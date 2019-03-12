package com.michael.scala.course06

object ExceptionApp extends App {

try {
  val c = 10/0
  println(c)
}catch {
  case e:ArithmeticException =>println("除数不能为0。。。。。。")
  case e:Exception => println(e.getMessage)
}finally {
  println("执行了Finally")
}
}
