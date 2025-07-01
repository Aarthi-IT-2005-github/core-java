import java.lang.*;
public class pattrnpractice6 {
    public static void main(String[]args){
        pattern6(5);
    }
    static void pattern6(int n){
        for(int row=0;row<2*n+1;row++ ){
           // int totalcolinrow=row>n?2*n-row:row;
           int totalcolinrow=row>n?2*n-row:row;
            int space=n-totalcolinrow;
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }
            
            for(int col=0;col<=totalcolinrow;col++){
                System.out.print("* ");
            }
            System.out.println();

        }  
        
         }

}
