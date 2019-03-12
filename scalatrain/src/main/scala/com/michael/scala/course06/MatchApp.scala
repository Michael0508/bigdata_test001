package com.michael.scala.course06

import scala.util.Random

object MatchApp extends App {

  val names = Array("AAAA", "BBBB", "CCCC", "DDDD")

  var name = names(Random.nextInt(names.length))

  //  name match{
  //    case  "AAAA" =>println(" 阿波老师")
  //    case  "BBBB" =>println("啊吉老师")
  //    case _ => println("不知道你们在说啥")
  //  }
  //
  //  def judgeGrade(grand: String): Unit ={
  //    grand match {
  //      case "A" => println("EXCELLENT...")
  //      case "B" => println("Good")
  //      case "C" => println("Just soso")
  //      case _ =>println("you need to work harder")
  //    }
  //  }
  //  judgeGrade("C")
  //  judgeGrade("Z")
  //  judgeGrade("A")

  //  def judgeGrade(name : String,grand: String): Unit ={
  //    grand match {
  //      case "A" => println("EXCELLENT...")
  //      case "B" => println("Good")
  //      case "C" => println("Just soso")
  //      case _  if(name == "lisi")=>println("you need to work harder, but.......")
  //      case _  =>println("you need to work harder")
  //    }
  //  }
  //  judgeGrade("lisi","aa")
  //  judgeGrade("wangwu","D")
  //  judgeGrade("sss","A")
  //  def judgeType(obj:Any): Unit ={
  //    obj match {
  //      case x:Int =>println("INT")
  //      case y:String =>println("String")
  //      case z:Double =>println("Double")
  //      case  _ =>println("other")
  //    }
  //  }
  //  judgeType(12.33)
  //  judgeType(12.33f)

  def caseClassMatch(person: Person): Unit = {
    person match {
      case CTO(name, floor) => println("CTO's name is " + name + " and work in " + floor)
      case employee(name, floor) => println("this employee's name is " + name + " and work in " + floor)
      case other(name) => println("other")
    }
  }

  caseClassMatch( new CTO("wcy", "23F", "nv"))
  caseClassMatch(employee("chen", "23F"))


}

class Person

case class CTO(val name: String,val floor: String) extends Person {

  def this(name: String, floor: String, sex: String) {
    this(name, floor)
  }
}

case class employee(name: String, floor: String) extends Person

case class other(name: String) extends Person

