package fileIo

import java.io.FileWriter
import java.io.FileReader
import scala.io.Source

object FileOperationDemo {
  
	def main(args: Array[String]): Unit = {
			var err = "you made a boo boo !!"
					if(fileOutput("Hello internet......I'm Rajat Nigam.")){
						println("File written successfully !!")
					}else{
						println(err)
					}
	
			fileInput("test.txt")
	
	}
  
	def fileInput(filename:String) = {
	  Source.fromFile(filename).foreach { x => print(x) }
	}
	
	def fileOutput(str:String):Boolean = {
			var flag = false;
			var f = new FileWriter(str)

			f.write(str)
			f.close()
			flag = true
			flag
	}
}