import java.lang.*;
class complex{
    private int real,img;
    complex(){
        this.real=2;
        this.img=4;
    }
    complex(int r,int i){
        this.real=r;
        this.img=i;
    }
    complex(complex c1){//here this the copy constructor in java here passing intead   of parameter here passing the c1 means it is an object of the one constructor.
        this.real=c1.real;
        this.img=c1.img;
    }
    public String tostring(){
        return "("+real+"+"+img+"i)";
    }
}

public class copyconstructor {
    public static void main(String args[]){
        complex c=new complex();
        complex c1=new complex(4,5);
        complex c2= new complex(c1);
        System.out.println("object1:"+c.tostring());
        System.out.println("object2:"+c1.tostring());
        System.out.println("object3:"+c2.tostring());
    }

}
