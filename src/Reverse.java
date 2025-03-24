import java .lang.*;
//program for to given string convert it reverse formate
public class Reverse {
    public static void main(String args[]){
        StringBuilder a = new StringBuilder("Aarthi is software engineer");
        System.out.println("string :"+a);
        StringBuilder b = new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));

        }
        System.out.println("reversed:"+b);
    }

}
