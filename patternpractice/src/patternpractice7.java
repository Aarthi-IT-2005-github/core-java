import java.lang.*;
public class patternpractice7 {
    public static void main(String []args){
        pattern7(5);

    }
    static void pattern7(int n){
        for(int row=0;row<=n;row++){
            for(int i=0;i<=n-row;i++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col++){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
