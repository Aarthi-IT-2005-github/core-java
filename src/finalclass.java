import java.lang.*;
final class finalclassdemo{//once the final class is declare only we can use ,we can not inherit to another class and we can not redefine it.
 public void display(){
        System.out.println("i am show in final");
    }
}

public class finalclass {
    public static void main(String args[]){
        finalclassdemo f= new finalclassdemo();
        f.display();

    }

}
