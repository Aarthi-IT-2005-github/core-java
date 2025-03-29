import java.lang.*;
interface interdemo{
    final static int a=25;//this is way declare the variable in the interface final is keyword we cannot  modify
void fun1();//once u declare the method in interface it defaultly asign public abstract void fun1
void fun2();
public static void fun3(){//in interface we can not give method body it shows an error otherwise we can declare public static void fun3 the to give the body of trh method it does not show the error
    System.out.println("fun 3");
}
private void fun6(){//private void fun6(); we can not without declare this in private but we can give body of the method then declare private that can be implemented by default method in interface
 System.out.println("fun 6");
}
default void fun5(){// using default keyword we can write method and also we can this body of the method using this method through implement private methods in interface
     System.out.println("fun 5");
}
}
interface interdemo2 extends interdemo{// similarly one class extends another class based on this concepts one interface can extends the another interface
    void fun4();
}
class testinter implements interdemo2{//then here implements the interface 2 defaultly implemented interface 1
   public void fun1(){
         System.out.println("fun 1");
    }
   public void fun2(){
         System.out.println("fun 2");
    }
   public void fun4(){
         System.out.println("fun 4");
    }
}
public class interfacedetails {
    public static void main(String args[]){
    testinter t = new testinter();
    t.fun1();
    t.fun2();
    interdemo.fun3();//if the method is static then acess through the interface name . methoad name off 
    t.fun4();
   // t.fun6(); here in this fun 6 can not acess because it is private method
    System.out.println("the a value :"+interdemo.a);//if using static keyword through the interface name . varialbe acess it 
    }

}
