import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;
public class fuctionsort_array {
    //hare its sortarray is function name
    public static int[] sortarray(){
        //input from the user limit n
        Scanner in = new Scanner(System. in);
        System.out.println("enter the limit");
        int n= in.nextInt();
        // array declaration get array values from the user
        int[] a=new int[n];
         System.out.println("enter the array value:");
         // using the for loop to get array values
        for(int i=0;i<n;i++){
           System.out.println("array index  "+i+":");
            a[i]=in.nextInt();
        }//through the arrays package sort the array value
        Arrays.sort(a);
        return a;
    }
    public static void main(String args[]){
        // sortarray== arr array to store the sort values using teh enhanced loop and print it
        int arr[]=sortarray();
        for(int b:arr){
            System.out.println(b);
        }
    }

}
