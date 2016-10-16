package demo

object StringDemo {
  
  var myString = "Hello World !!"
  val name = "Rajat"
  val lname = "Nigam"
  var hieght = 1.90d
  
  def main(args: Array[String]): Unit = {
    println(myString.concat(" This is india"))
    println(f"This is $name , $lname and \n $hieght tall")
    println(s"1+1=${1+1}")
    println(raw"This is $name , $lname and \n $hieght tall")
  }
  
}