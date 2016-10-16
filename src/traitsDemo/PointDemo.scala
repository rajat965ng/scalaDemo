package traitsDemo

class PointDemo(a:Int) extends MyEqual{
  
  var x:Int = a
  

  def isEquals(obj:Any) = 
    obj.isInstanceOf[PointDemo] && obj.asInstanceOf[PointDemo].x==x;
  
}