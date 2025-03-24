import java.lang.*;
import java.util.Scanner;
public class binary_decimal {
    public static int bintodeci(int bin){
        int decimal=0,power=0;
        while(bin!=0){
            int reminder=bin%10;//reminder madulas is to seprate the single digit 
            decimal+=reminder*Math.pow(2,power);//
            bin=bin/10;//quatient value hsre 110 11 1
            power++;//0,1,2,3...
        }
        return decimal;
    }
    public static void main(String args[]){
        System.out.println("the decimal value is:"+bintodeci(100));
    }

}
