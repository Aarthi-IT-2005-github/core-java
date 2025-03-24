import java.lang.*;
import java.util.Scanner;
public class fuction_array {
    //if the method acessing in main function u can declare the static keyword and here sendarray is function name
    public static int[] sendarray(){
        //returning array
        return new int[]{1,2,3,4,5};

    }
    //returning arrays from the method
    public static void main(String args[]){
        int arr[]= sendarray();
        for(int a:arr)
           System.out.println(a);
        
    }
    

}
