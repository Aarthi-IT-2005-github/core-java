import java.lang.*;
interface test{//here in java we can not implement the multiple inheritance that why instead od using inteface through to achive the mutiple inheritance in java
    void internal1();
    void internal2();
    
   
}
class college implements test{//implements A,B,C,D....
   public void internal1(){
        System.out.println("internal 1 conducted in jan month and result is 80% over all");
    }
   public void internal2(){
        System.out.println("internal 2 will conduct in march month ");
    }
    void overallmsg(){
        System.out.println("internals are very tough");
    }
}
public class interfacedemo {
    public static void main(String args[]){
    college c= new college();
    c.internal1();
    c.internal2();
    
    }
    

}
