import java.lang.*;
import java.util.Scanner;
// in this program without creating object call the function through the class name(using this concept how manualy creating)
class mathematical{
    //here using the static keyword no need to create a object usingthe class name and function name call the function(if in case we can not declare the sttic key word thenonly create the object for the class through call it)
    public static int power(int base,int power){
        int result=1;
        for(int i=1;i<=power;i++){
            result*=base;
        }
        return result;
    }
}
public class staticexample {
    public static void main(String args[]){
        System.out.println("power value:"+mathematical.power(3,3));
       
    }

}
