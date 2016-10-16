package demo

object ClosureDemo {
  
  def main(args: Array[String]): Unit = {
    val multipier = (i:Int)=>i*10;
  
    println(multipier.apply(6))
    println(output.apply(5))
  
  }
  
  val factor = 3;
  val output  = (i:Int)=>i*factor;
  
  
}