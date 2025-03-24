 import java.lang.*;
 class rectanglearea {
    int length,width;//(acess modifier)here the  declaration default or public easy to acess outside of the class if here private int length,width we can not acess the parameters out side of the class
    void getdetails(int x,int y){//no return but with args
        length=x;
        width=y;
    }
    int area(){
        int a=length*width;
        return a;
    }
 }
 

 public class rectangle{
    public static void main(String args[]){
        rectanglearea r=new rectanglearea();//if one class have many object to create it like similarly create the r1 object
        r.getdetails(4,5);//here instead of r.length=10;r.width=8; using this method to gave the input
        System.out.println("the rectangle area :"+r.area());
    }
}
 
