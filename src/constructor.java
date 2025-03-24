import java.lang.*;
import java.util.Scanner;
class rectanglesahpe{
    int length,width;
    rectanglesahpe(){
        System.out.println("constructor called first");
        Scanner in =new Scanner(System.in);
        System.out.println("enter the length :");
        length=in.nextInt();
        System.out.println("enter the width :");
        width= in.nextInt();
     
    }
    int area(){
        int a= length*width;
        return a;
    }
}


public class constructor {
    public static void main(String args[]){
        rectanglesahpe rs= new rectanglesahpe();
        System.out.println("the area of rectangle:"+rs.area());
    }

}
