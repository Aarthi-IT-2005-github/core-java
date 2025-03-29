import java.lang.*;
class outercls{
    void dispaly(){//here this  local inner clas  method so the scope only in the method that why we are creating object in the same method understand
        class innermethod{
            int a=60;
            int b=70;
            void innerdisplay(){
            System.out.println("here this the local metheod inner class");
            System.out.println("the a value:"+a);
            System.out.println("the  b value:"+b);
            }
        }
        innermethod i=new innermethod();
        i.innerdisplay();
    }
}
public class localinnerclass {
    public static void main(String args[]){
        outercls o=new outercls();
        o.dispaly();
    }

}
