package extractors


object ExtractorDemo {
  def main(args: Array[String]): Unit = {
    
    println(apply("abc","gmail.com"))
    println(unapply("rajatnigam89@gmail.com"))
  }
  
  def apply(a:String, b:String):String = {
    a+"@"+b;
  }
  
  def unapply(str:String):Option[(String,String)] = {
    
    val parts = str.split("@")
    if(parts.length>=2){
      Some(parts(0),parts(1))
    }else {
      None
    }
    
  }
  
}