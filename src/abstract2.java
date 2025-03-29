import java .lang.*;
abstract class mobile{
    void voicecall(){
        System.out.println("this is basic feature in mobile");
    }
    abstract void camera();
   abstract void displayfun();
}
class samsung extends mobile{
    void camera(){
        System.out.println("in samsung to 20 pixl camera quality");
    }
    void displayfun(){
        System.out.println("this 5.8 screen clear display");

    }
    void extrafetures(){
        System.out.println("here new lounch touch pen");
    }
}
class nokia extends mobile{
    void camera(){
        System.out.println("in samsung to 30 pixl camera quality");
    }
     void displayfun(){
        System.out.println("this 8.8 screen clear display");

    }
    void newfeatures(){
        System.out.println("additional sound effects and quality");
    }
}
public class abstract2 {
    public static void main(String args[]){
        samsung s=new samsung();
        nokia n= new nokia();
        s.camera();
        s.displayfun();
        n.camera();
        n.displayfun();
        s.extrafetures();
        n.newfeatures();
        n.voicecall();
        s.voicecall();
    }

}
