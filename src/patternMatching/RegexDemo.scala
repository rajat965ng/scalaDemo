package patternMatching

object RegexDemo {
  def main(args: Array[String]): Unit = {
    var pattern = "Scala".r;
    var text = "Scala is a Scalable language"
    
    println(pattern.findFirstIn(text))
    println(pattern.findAllIn(text).foreach { x => println(x) })
    println(pattern.findFirstMatchIn(text).foreach { x => println(x) })
    println(pattern.findPrefixMatchOf(text))
    println(pattern.findPrefixOf(text))
    
    println("================================================================")
    
    var pattern2 = "la".r;
    println(pattern2.findAllIn(text).mkString(";"))
    
  }
}