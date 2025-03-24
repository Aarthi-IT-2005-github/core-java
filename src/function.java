import java.lang.*;
import java. util.Scanner;
class methods{
    // no return value and no arugment passingI(no return w/o args)
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a value:");
        int a=in.nextInt();
        System.out.println("enter b value:");
        int b=in.nextInt();
       System.out.println("addition value:"+(a+b));
       
    }
    //no return with arguments 
    public void sub(int x,int y){
        System.out.println("the sub value is :"+(x-y));

    }
    //with return and no argument passing
    public int mul(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a value:");
        int a=in.nextInt();
        System.out.println("enter b value:");
        int b=in.nextInt();
        return a*b;

    }
    //with return and argument passing
    public float divide(int c,int d){
        return c/d;

    }
    //recursion function
    public int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }
}

public class function{
    public static void main(String args[]){
        //object creation for the class methods
    methods o = new methods();
    // method calling through the object
    o.add();
    o.sub(123,134);
    System.out.println("multiply value is:"+o.mul());
    System.out.println("the divide value is:"+o.divide(10,5));
    System.out.println("the factorial value:"+o.factorial(10));
    }

}
