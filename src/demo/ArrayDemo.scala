package demo


object ArrayDemo {
  
  def main(args: Array[String]): Unit = {
    
    var arr:Array[String] = Array("abc","xyz","pqr");
  
    myPrint.apply(arr);
    
    
    var arr2:Array[String] = Array("jkl","fgh","utv");
    
    var arr3 = Array.concat(arr,arr2);
    
    myPrint.apply(arr3)
  
    var arr4 = Array.range(10,50,5);
    myIntPrint.apply(arr4)
  }
  
  
  def myPrint = (arr:Array[String]) => 
    for(i <- arr){
      println(i)
    }
  def myIntPrint = (arr:Array[Int]) => 
    for(i <- arr){
      println(i)
    }
  
}