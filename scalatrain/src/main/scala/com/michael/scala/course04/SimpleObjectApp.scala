package com.michael.scala.course04

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    println(person.name + "...." + person.age)
       println(person.getName1)

    person.watchMatch("basha")

  }
}


class People {

  var name: String = _
  val age: Int = 30

  private[this] val name1 = "cluo"

  def getName1(): String = {
    name1
  }


  def eat(): String = {
    name + "eating....."
  }

  def watchMatch(teamName: String) {
    println("watch the " + teamName)
  }

}