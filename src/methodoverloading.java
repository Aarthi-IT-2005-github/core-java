import java.lang.*;
class mathoperation{
 public static  int multiply(int a,int b){
        return a*b;
    }
public static  double multiply(double x, double y ){
        return x*y;
    
    }
public static double multiply(int r,double t,double s){
      return r*t*s;
}
}


public class methodoverloading {
    public static void main(String args[]){
   System.out.println("the multiple value:"+mathoperation.multiply(5,8));
   System.out.println("the multiple value:"+mathoperation.multiply(5.5,8.0));
   System.out.println("the multiple value:"+mathoperation.multiply(5,8.9,4.50000));

    }

}
