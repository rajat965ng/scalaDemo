package demo

import scala.collection.immutable.Set

object CollectionDemo {

  def main(args: Array[String]): Unit = {
    var l1 = List(1,2,4,5,6);
    printList.apply(l1);
  
    println();
    
    var dim = List(List(1,3,4),List(8,2,3),List(0,9,5));
    for(i<-dim){
      println(i.sum)
      printList.apply(i);
    }
  
    var l2 = List.fill(3)("apples","grapes")
    println(l2)
    
    println()
    var l3 = List.tabulate(3,6)((i,j)=>i*j)
    println(l3)
    println(l3.reverse)
    println(l1::l3)
    
    var s1 = Set(1,3,6)
    var s2 = Set(4,5,6)
    println((s1++s2))
    println((s2&~s1))
    
  }
  
  
  def printList = (l:List[Int])=> for(i<-l){
    print(i+" ")
  }
  
}