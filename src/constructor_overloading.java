import java.lang.*;
class box{
    int length,width;
    box(){// here this is the constructor overloading that means same names of constructor but it have diffrent types means it is single parameter and two parameter passed here.
        length=2;
        width=3;
    }
    box(int x, int y){
        length=x;
        width=y;
    }
    box(int x){
        length=width=x;
    }
    int area(){
        return length*width;
    }
}

public class constructor_overloading {
    public static void main(String args[]){
        box o = new box();//each different constructor acess different object through. 
        box o1=new box(6,8);
        box o2=new box(8);
        System.out.println("the area of box :"+o.area());
        System.out.println("the area of box :"+o1.area());
        System.out.println("the area of box :"+o2.area());

    }

}
