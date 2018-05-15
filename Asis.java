
package asis;


public class Asis {

    
    
     
    public static void main(String[] args) {
    
      Fibonacci(10);
      System.out.println("");
      FizzBuzz(30) ;    
      System.out.println("");
      System.out.println(ReverseString("tunc"));
      System.out.println("deneme");
        System.out.println("son versiyon");
//ohhh
        
        
    }
    
    
    public static void FizzBuzz(int n){
        
            
            for(int i=1; i<=n; i++)
            {
              if(i%3==0 && i%5==0)System.out.print("FizzBuzz, "); 
              else if(i%3==0) System.out.print("Fizz, ");
              else if(i%5==0) System.out.print("Buzz, ");
             
              else System.out.print(i+",");
            }
}
    
    public static void Fibonacci(int n)
    {
        
        if(n<3)
        {
            System.out.println("1,1");
        }
        
        int n1=1;
        int n2=2;
        System.out.print(n1+",");
        System.out.print(n2+",");
        
         for(int i=3 ; i<=n; i++)
        {
            System.out.print((n1+n2)+",");
            int temp=n1;
            n1=n2;
            n2=temp+n2;
            
        }
         
    }
    
    
    public static String ReverseString (String s)
    {
        
        char[] ch=s.toCharArray();
        int n=s.length();
        
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(ch[i]);
            
        }
        
        return String.valueOf(ch);
           
    }
    
    
    
    
    
    
}
