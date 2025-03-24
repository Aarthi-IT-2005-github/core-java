import java.lang.*;
//data hiding getter and setter (this concept is very useful to hide the data and how to use get and set method through acess)
class shaperectangle{
    private int length,width;//here the declaration private that why we are using the setter anf getter method in this function it easy concept
    int getlength(){
        return length;//here getting the input fron the user
    }
    int getwidth(){
        return width;
    }
    void setlength(int l){//set value to length asign to l through this calculate area of the rectangle
        if(l>0){
        length=l;
        }
        else{
            length=0;
        }

    }
    void setwidth(int w){//similarly width 
     if(w>0){//this for to gave negative valueto the length defaultly asign the 0 that gaving if and else condition
     width=w;
     }
     else{
        width=0;
     }
    }
    int area(){
        int a=length*width;
        return a;
    }

}
public class getandset {
    public static void main(String args[]){
        shaperectangle s=new shaperectangle();
        s.setlength(12);
        s.setwidth(-12);
        System.out.println("area of rectangle:"+s.area());
    }

}
