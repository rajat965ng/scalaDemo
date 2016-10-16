package patternMatching

object PatternDemo extends MatchMyObject{
  
  def main(args: Array[String]): Unit = {
    println(placeHolder(1)) 
    println(placeHolder(0)) 
    println(placeHolder(3)) 
    println(placeHolder("two")) 
  
  }
  
  
  def matchObject(a:Any):Any =  a match {
    case 1 => "One"  
    case "two" => 2
    case 0 =>"Nulla"
    case _=>"Many"
      
  }
  
}

trait MatchMyObject{
  
  def matchObject(a:Any):Any
  def placeHolder(a:Any) = matchObject(a);
}