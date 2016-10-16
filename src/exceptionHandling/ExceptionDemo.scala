package exceptionHandling

import java.io.FileInputStream
import java.io.FileReader

object ExceptionDemo {
  
  def main(args: Array[String]): Unit = {
   println("Begin !!")
    try{ 
    var f = new FileReader("/home/rajat/Desktop/inp.txt");
    println(f)
   }catch {
     case t: Exception => t.printStackTrace() // TODO: handle error
   }finally {
     println("Done !!!")
   }
     println("Game Over !!!")
   
  }
  
}