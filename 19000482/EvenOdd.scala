

object EvenOdd {
  def isEven(n : Int): Boolean = {
    if(n ==0){
        return(true);
    }else if (n == 1){
        return(false);
    }else {
        return(isEven(n - 2));
    }
  }
  
  def main(args: Array[String]):Unit={
    
    var n =8
    if(isEven(n) == true)
      println("EVEN")
    else
      println("ODD")
    
  }
}