
object SumEven{
    def add(n:Int, i:Int, sum:Int): Int = {
        if(i >= n){
             return sum;         
        }  
        return add(n, i+2, sum+i);
    }
    
    def main(args: Array[String]): Unit = {
        var n = 8;   

        println("Addition of even numbers : " + add(n,0,0) );       
    }
}