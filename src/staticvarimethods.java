import java.lang.*;
class statictest{
  static  int x= 90;// but here only one for all its common value once  we created the object that is common to acess
    int y=80;//instance variable so each object to store different values in this instance
    void show(){
        System.out.println("A :"+x+" B :"+y);
    }
   static void display(){//static method only acess the static variables  and  onces the memory alloted for common 
        System.out.println("A :"+x);
    }
}

public class staticvarimethods {
    public static void main(String args[]){
        statictest s= new statictest();
        statictest s1= new statictest();
         s.x=100;
        s.show();
         s1.y=70;
        s1.show();
       // s1.y=70;
       // statictest.b=70;
        //s.x=100;
        s.display();
    }

}
