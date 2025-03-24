import java.lang.*;
public class countcharacter {
    //program to count upper 65-90,lower97-122,number 48-57,space 32,symbols remaining ,vowels in a string using the ascii formates
    public static void main(String args[]){
        StringBuilder a= new S tringBuilder("Aarthi--age is 20@");
        System.out.println(a);
        int upper=0,lower=0,number=0,space=0,symbols=0,vowels=0;
     for(int i=0;i<a.length();i++){
        if(a.charAt(i)>=65 && a.charAt(i)<=90){
            upper++;
        }
        if(a.charAt(i)>=97 && a.charAt(i)<=122){
            lower++;
        }
        if(a.charAt(i)>=48 && a.charAt(i)<=57){
            number++;
        }
        if(a.charAt(i)==32){
            space++;
        }
        if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
            vowels++;
        }

     }
     System.out.println("uppercase :"+upper);
     System.out.println("lowercase :"+lower);
     System.out.println("number :"+number);
     System.out.println("space :"+space);
     System.out.println("vowels :"+vowels);
     System.out.println("symbols :"+(a.length()-(upper+lower+number+space+vowels)));


    }

} 
