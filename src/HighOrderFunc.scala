

object HighOrderFunc {
  
  def main(args: Array[String]): Unit = {

    var inc = (x:Int) =>x+1;
  println(inc(10))
  }
  
  def apply(f:Int => String,v:Int) = f(v);
  
  def layout(x:Int) = "["+x.toString()+"]";
}