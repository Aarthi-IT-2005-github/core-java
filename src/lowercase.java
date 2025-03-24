import java.lang.*;
public class lowercase {
public static void main(String args[]){
    StringBuilder a= new StringBuilder("AARTHI IS AVERY GOOD GIRL");
    System.out.println("string :"+a);
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)>=65 && a.charAt(i)<=90){
            int c=(int)a.charAt(i)+32;
            a.setCharAt(i,(char)c);
        }
    }
    System.out.println("lowercase:"+a);
}
}
