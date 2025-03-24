import java.lang.*;
class user{
    String name;
    int age;
    user(String n,int a){
        this.name=n;
        this.age=a;
    }
    public void display(){//here  dipaly is the method is created this is base class
     System.out.println("Name :"+name);
        System.out.println("Age:"+age);
    }
   
}
class mains extends user{
    String companyname;
    mains(String n,int a,String c){
        super(n,a);// here using super keyword that means n and a is already defined in the base class we acess through the super keyword
        this.companyname=c;

}
public void display(){//here the same base class method has been redefine the display method here add new companyname
     System.out.println("Name :"+name);
        System.out.println("Age:"+age);
        System.out.println("companyname:"+companyname);

}
}
public class methodoverriding {
    public static void main(String args[]){
        mains u = new mains("aarthi",20,"ARTI TECH");
        u.display();
    }


}
