import java .lang.*;
public class capitalized {
    public static void main(String args[]){
        StringBuilder a= new StringBuilder("university college of engineering anna university");
        System.out.println("String:"+a);
        int i=0;
        if(a.charAt(0)>=97 && a.charAt(0)<=122){
            int c=(int)a.charAt(i)-32;
            a.setCharAt(i, (char)c);
        }
        for( i=1;i<a.length();i++){
            if(a.charAt(i)==32){
                i++;
                if(a.charAt(0)>=97 && a.charAt(0)<=122){
                int c=(int)a.charAt(i)-32;
                 a.setCharAt(i, (char)c);
                }
                else{
                    if(a.charAt(0)>=65 && a.charAt(0)<=90){
                    int c=(int)a.charAt(i)-32;
                     a.setCharAt(i, (char)c);
                    }
                }
            }
        }
        System.out.println("capitalized string:"+a);
    }

}
