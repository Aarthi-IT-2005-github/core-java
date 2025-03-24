import java.lang.*;
class grandfather{
    public void house(){
        System.out.println("old model house");
    }
}
class father extends grandfather{//here this is level inheritance inherited like a chain here father inherited grand fatehr class and the son inherited the father class this process called the multilevel inheritance
    public void house1(){
        System.out.println("this middle era of house moddel");
    }
}
class son extends father{
    public void house2(){
        System.out.println("this gen z era of house advanced techonology");
    }
}
public class multilevelinheritance {
    public static void main (String args[]){
        son s= new son();
        s.house();
        s.house1();
        s.house2();
    
    }

}
