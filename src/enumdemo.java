public class enumdemo {
 enum gamelevel{
    LOW,
    MEDIUM,
    HIGH
 }
 public static void main(String []args){
    //here it is the assign enum variable 
    gamelevel a = gamelevel.HIGH;//but show the error i can not understand
    System.out.println(a);

    //use enum in switch case
    switch(a){
        case LOW:
            System.out.println("low level");
            break;
        case HIGH:
            System.out.println("high level");
            break;
        case MEDIUM:
            System.out.println("medium level");
            break;
    }
    //enum looping
    for(gamelevel level : gamelevel.values()) {
        System.out.println(level);
    }
 }
}
