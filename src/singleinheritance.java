import java.lang.*;
import java.util.Scanner;
class father{
    public void property(){
        System.out.println("father have a own house and he have agiriculture land");
    }
}
class son extends father{//here this is the single inheritance only one class can be inherited
    public void  profession(){
        System.out.println("son have IT profession job and he have a tesla car");
    }
}
public class singleinheritance {
    public static void main(String args[]){
    son s = new son();
    s.property();
    s.profession();
    }
}
