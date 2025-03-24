import java.lang.*;
import java.util.Scanner;
class demo{
    int m,n;
    demo(int x,int y){
       System.out.println("check the larger value");
       Scanner in =new Scanner(System.in);
       System.out.println("enter the first value:");
       m=in.nextInt();
       System.out.println("enter the second value:");
       n=in.nextInt();

    }
    int largest(){
        if(m>n)
            return m;
        
        else
            return n;
        
    }
    void display(){
        int large=largest();//here this process call the nestedmethod calling  here dipaly is the one method and the largest is another method the through the display method to call largest method that process called nested methods in java
        System.out.println("the grater number is:"+large);
    }
}
public class nestedmethod {
    public static void main (String args[]){
        demo o= new demo(10,40);
        o.display();
    }

}
