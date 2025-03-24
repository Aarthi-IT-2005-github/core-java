import java.lang.*;
import java.lang.String;
public class stringliteral {
    public static void main(String args[]){
        String a="aarthi joes";
        String b="Aarthi";
        System.out.println("A:"+a);
         System.out.println("B:"+b);
          //System.out.println("A hashcode:"+ a.HashCode());
           System.out.println("equals:"+a.equals(b));
            System.out.println("equals ignore case :"+a.equalsIgnoreCase(b));
          System.out.println("lenth:"+a.length());
          System.out.println("charat:"+a.charAt(2));
          //System.out.println("uppercase:"+a.toUppercase());
          System.out.println("replace :"+ a.replace("joes","swetha"));
          System.out.println("empty:"+a.isEmpty());
System.out.println("contains:"+a.contains("thi"));
//System.out.println("endswith:"+a.endswith("thi"));
//System.out.println("endswith:"+a.startwith("aa"));
         
         

    }

}
 