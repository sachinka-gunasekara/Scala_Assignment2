

object Addition {
  def sum(n:Int):Int={
    if(n==1)
      1
    else 
      n+sum(n-1)
  }

  def main(args: Array[String]):Unit={
    
    var n =5
    println("Addition of numbers : ")
    println(sum(n))
    
  }
}