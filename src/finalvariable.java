import java.lang.*;
class test{
    final int min=1;//this is final varialbe to assign the value how to use  it 
    final int neutral;
    final int max;
    test(int n){// through the constructor to pass the value
        this.neutral=n;
        max=20;
    }
    void display(){
        System.out.println("min value :"+min);
        System.out.println("neutral value :"+neutral);
        System.out.println("max value :"+max);
    }
}
public class finalvariable {
    public static void main(String args[]){
        test t = new test(10);
        t.display();
    }

}
