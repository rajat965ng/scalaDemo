

object ScalaDemo {
  
  def main(args: Array[String]): Unit = {
  
    val i:Int = factorial(6);
    println(i);
    
  }
 
  def delayed(t: =>Long)={
    println("the delay is "+t+"sec")
  }
  
  def time()={
    System.nanoTime();
  }
  
  
  def printMany(args:String*){
    for(arg<-args){
      
      println(arg)
      
    }
    
  }
  
  def factorial(i:Int):Int={
    
    def fact(x:Int):Int={
      if(x==1){
        1;
      }else{
      x*fact(x-1)
      }
     }
    
    fact(i)
  }
  
  
    
    def addStr(x:String*):String = {
      var str:String = "";
      for(arg<-x){
        str+=arg;
      }
      str;
    }
    
}