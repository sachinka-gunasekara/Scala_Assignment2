
object PrimeSeq {
  def seq(n : Int, i:Int) : Boolean = {
    
    if(n <=2){
      if(n==2)
        return true
      else
        return false
    }
    if(n%i == 0)
      return false
    if(i*i >n)
      return true
    return seq(n, i+1)
  }
  
  def main(args: Array[String]):Unit={
    var n =10
    
    println("Prime numbers : ")
    for(i<- 1 to n){
      if(seq(i,2)){
        print(i)
        print(" ")
      }
    }
  }
}