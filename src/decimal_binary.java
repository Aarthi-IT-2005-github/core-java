
import java .util.Scanner;
import java .lang.*;
public class decimal_binary {
    public static void decitobina(int n){
        int[] binarynum= new int[1000];//array declaration
        int i=0;
        while(n>0){
            binarynum[i]=n%2;//reminder
            n=n/2;//quatient
            i++;//iincrement the index
        }
        for(int j=i-1;j>=0;j--){//here we are taking the  reverse value
            System.out.print(binarynum[j]);//i is teh initialization the array and j is teh end of the array then j-- means to print it reverse

        }

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the decimal value:");
        int n= in.nextInt();
        System.out.println("binary value is:");
        decitobina(n);

        
    }

}
