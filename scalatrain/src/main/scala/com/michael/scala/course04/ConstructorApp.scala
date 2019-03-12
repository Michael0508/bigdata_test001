package com.michael.scala.course04

object ConstructorApp {

  def main(args: Array[String]): Unit = {
//    val  person = new  Person("wangchaoyue", 18 ,  "male")
//    println(person.school +  "....."  + person.name + "......." + person.age)

    val  student = new  Student("wangwu",  20,  "dajiangyou")

    println(student)

  }



}

class Person(val name: String, val age: Int) {
  println("People  Constructor enter .....")
  val school = "uuuuu"
  var gender: String = _
  println("People  Constructor leave .....")
  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}
class Student(name :String, age : Int,  major:String )  extends Person(name ,age){
//  var major :String =_

  override def toString: String = "person go dead all in"

  println("Student enter  ....")

//  println(major)

  println("Student leave...."  )

}