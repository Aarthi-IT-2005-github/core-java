import java.lang.*;
public class patternpractice {
    public static void main(String[]args){
        System.out.println("right triangle pattern");
        pattern(5);
        

    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
