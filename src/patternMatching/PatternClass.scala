package patternMatching

object PatternClass {
  
	def main(args: Array[String]): Unit = {


			val p1 = new Person("Rajat",26);
			val p2 = new Person("Pradeep",25);
			val p3 = new Person("Ankit",27);

			for(p<-List(p1,p2,p3)){
				p match {
				case Person("Rajat",26) => println("Rajat")
				case Person(name,age) => println("the name is:"+name+", the age is:"+age+"");
				}
			}


	}
  
	case class Person(name:String, age:Int) 
}
