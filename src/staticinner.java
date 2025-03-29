import java.lang.*;
class outer{
   static int x=20;
    int y=90;
   static  class inner{//here the class static  but the variable x is not static we can not acess it show the error the we change x variable static then only we are acess
        void display(){
        System.out.println("the x value is:"+x);
        }
    }
}
public class staticinner {
    public static void main(String args[]){
        outer.inner oi=new outer.inner();//outer. inner oi= new outer().new inner(); this also one of way to create instance
        oi.display();
    }

}
