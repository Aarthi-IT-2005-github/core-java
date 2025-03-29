import java.lang.*;
class blocktest{// this using the static keyword before the class load the if any content or msg want to deliver use this method 
    static{
        System.out.println("blocktest 1");//now a days it can not major uses but it is present in java 
    }
    static {
        System.out.println("block test 2");
    }
}
public class staticblock {
     static {
    System.out.println("block 1");
  }
 public static void main(String[] args){
    System.out.println("main");
    blocktest b=new blocktest();
 }
    static {
        System.out.println("block 3");
    }
  
}
