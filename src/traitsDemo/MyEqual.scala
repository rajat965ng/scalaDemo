package traitsDemo

trait MyEqual {
  def isEquals(x:Any):Boolean;
  def isNotEqual(x:Any):Boolean = !isEquals(x) 
}