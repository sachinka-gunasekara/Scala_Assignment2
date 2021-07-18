
object Fibonocci{
    def fib(x:Int): Int = {
        if(x <= 1){
             return x;         
        }  
        return fib(x-1) + fib(x-2);
    }
    
    def main(args: Array[String]): Unit = {
        var n = 10;
        
        println("Fibonocci series : "); 
        
        for(i <- 0 to n){           
            print(fib(i)); 
            print(" ");
        }
            
    }
}