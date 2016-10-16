package demo

object ScalaMapDemo {
 
	def main(args: Array[String]): Unit = {
			var a:Map[Char,Int] = Map()

					var b = Map(1->"One",2->"two",3->"Three")
					
					var c = Map(11->"Once",22->"twos",33->"Threes")
					
					println(b)

					b+=(4->"Four");
					println(b)
          println(b.keys)

          println(b.values)
          
          println(b.map(f=>"Hello ".concat(f._2)))
          
					println(b.++:(c).toSet)
					
					
	}
  
  
}