import java.lang.*;
public class patternpractice4 {
    public static void main(String[]args){
        pattern4(5);

    }
    static void pattern4(int n){
        for(int row=0;row<2*n;row++){
            int totalcolinrow=row>n?2*n-row:row;
         for(int col=0;col<totalcolinrow;col++){
            System.out.print("* ");
            
         }
         System.out.println();
        }
    }

}
