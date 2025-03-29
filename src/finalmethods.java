import java.lang.*;
class outer{
    void dispaly(){
        System.out.println("this is with out final fun");
    }
    final void finaldisplay(){//here this is final declaration method only it used this fun we can not redefine it .
        System.out.println("thid is final fun");
    }
}
class inner extends outer{
    void display(){//here the attains override that means redefined function
        System.out.println("this is refined fun");
    }
}
public class finalmethods {
    public static void main(String args[]){
        inner i = new inner();
        i.display();
        i.finaldisplay();
    }

}
