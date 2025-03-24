import java.lang.*;
public class varargs {
    public static void getnames(String...names){
    for(String name:names){
        System.out.println(name);
    }
}
    public static void main(String args[]){
        getnames("aarthi","hari","ramya");
    }

}
