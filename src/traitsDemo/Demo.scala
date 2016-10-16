package traitsDemo

object Demo {
  
  def main(args: Array[String]): Unit = {
    var a = new PointDemo(2);
    var b = new PointDemo(200);
    var c = new PointDemo(2);
    
    println(a.isNotEqual(b))
    println(a.isEquals(c))
    
  }
  
}