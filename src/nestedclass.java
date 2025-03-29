import java.lang.*;
class outer{
    int a=60;
    class inner{
     int b=30;
   public  void innerdisplay(){
        System.out.println("this inner class fun");
     }
    }
    public void diplayouter(){
        inner i = new inner();
        System.out.println("here through the inner i object call the fun"+i.innerdisplay());// here i have doubt why throygh the object i can not call the  method 
        System.out.println("the b value:"+i.b);// but here through i object to show the b value
        System.out.println("here this outer class fun");
        System.out.println("the a value:"+a);
    }
}
public class nestedclass {
    public static void main(String args[]){
        outer o = new outer();
        o.diplayouter();
        outer.inner in=new outer().new inner();//this is way to create inner class object
        in.innerdisplay();

    }

}
