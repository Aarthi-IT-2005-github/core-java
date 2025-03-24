import java .lang.*;
import java.util.Scanner;
public class mathmethods {
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the a value:");
        int a= in.nextInt();
        System.out.println("enter the b value:");
        int b= in.nextInt();


 System.out.println("absolute:"+Math.abs(-45));
         System.out.println("round off:"+Math.round(7.898));
          System.out.println("ceil:"+Math.ceil(8.909));
           System.out.println("floor  value:"+Math.floor(5.7868));
            System.out.println("max value:"+Math.max(a,b));
              System.out.println( "square value:"+Math.sqrt(b));
              System.out.println( "power of values:"+Math.pow(a,b));
              System.out.println( "logarithm of a value:"+Math.log(a));
              System.out.println( "log base 10 value:"+Math.log10(b));
              System.out.println( "sin of a value:"+Math.sin(a));
              System.out.println( "cos of b value:"+Math.cos(b));
              System.out.println( "tan value:"+Math.tan(b));

    }

}
