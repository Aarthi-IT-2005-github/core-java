import java .lang.*;
abstract class testdemo{//here this is abstract class and that class having one abstract method that has been implemented through the object
    abstract void display();
}
class outerdemo{// here this the another class 
    public void outerdisplay(){//this class having method
        testdemo o = new testdemo(){//that method implemented the abstract class object creation through write the body of the abstract method
            void display(){
                System.out.println("here this is the anonymous inner class");
            }
        };//here finish the semicolon is very important
        o.display();//in same class to acess the abstract method has been override then through the object call it
    }
}
public class anonymousinner {
    public static void main(String args[]){
        outerdemo ot= new outerdemo();//this is asusalprocess to create outer class object then acess the method through this
        ot.outerdisplay();
    }

}
