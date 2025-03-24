import java.lang.*;
class shape{
   public float length,breadth,radius;
}
class rect extends shape{
    rect(float l,float b){
        length=l;
        breadth=b;

    }
    float rectarea(){
        return (length*breadth);
    }
}
class circle extends shape{
    circle(float r){
        radius=r;
    }
    float circlearea(){
        return (3.14f*(radius*radius));
    }
}
class square extends shape{
    square(float s){
        length=s;
    }
   float squarearea(){
    return (length*length);
   }

}
public class hierarchical {
    public static void main(String args[]){
        rect r= new rect( 10,20);
        circle c= new circle(5);
        square s =new square(10);
        System.out.println("the rectangle area:"+r.rectarea());
        System.out.println("the area of circle:"+c.circlearea());
        System.out.println("the square area:"+s.squarearea());
    }


}
