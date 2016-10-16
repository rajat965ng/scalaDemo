package traitsDemo

trait MyPrint extends Any{
  def show(obj:Any) = println("Passed Object is :"+obj)
}

class ValueClassDemo(val obj:Any) extends AnyVal with MyPrint{
  def print = show(obj)
}

object DemoVal{
  def main(args: Array[String]): Unit = {
    val demoCl = new ValueClassDemo(6);
    demoCl.print
  }
}