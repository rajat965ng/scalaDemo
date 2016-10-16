package demo

object TupleDemo {
  
  def main(args: Array[String]): Unit = {
    var t = List(
        (1,"Rajat","M"),
        (2,"Abc","F"),
        (3,"XYX","M")
    )
    
    t.foreach(f=>if(f._3.equals("F")){println(f)})
    
    
  }
  
}