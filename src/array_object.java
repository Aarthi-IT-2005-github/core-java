import java .lang.*;
class student{
    public int rollno;
    public String name;
    student(int rollno,String name ){
        this.rollno=rollno;
        this.name=name;
    }
    Void display(){
       return rollno,name;
        System.out.println(" student roll no:"+rollno);
        System.out.println(" student name:"+name);
    }

}
public class array_object{
//here array of object means multiple of  object has been stored in the array  is known as array of object.
  public static void main(String[] args){
    student[] o= new student[5];
    o[0]=new student(12,"aarthi");
    o[1]=new student(13,"mithra");
    o[2]=new student(14,"sukesh");
    o[3]=new student(15,"vathani");
    o[4]=new student(16,"siva");
    for(int i=0; i<5; i++){
        o[i].display();//something error on this program but i can not found it .
    }
  }
  
}

    


