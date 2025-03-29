import java.lang.*;
class phone{
    void call(){
        System.out.println("hare all mobile phone connect through the voice call");
    }
}
interface player{
    void games();
    void soundeffects();

}

interface dispaly{
    void screenplay();
    void playvedio();
    void pause();
}
class smartphone extends phone implements player,dispaly{
   public void games(){//here if we wants to implements interface method  u will must  define specifier like public.
        System.out.println("vedio games are implemented");
    }
   public void soundeffects(){
        System.out.println("here sound effect ARE GOOD");
    
    }
   public void screenplay(){
        System.out.println("screen paly super good");
    }
   public void playvedio(){
        System.out.println("paly the flim");
    }
   public void pause(){
        System.out.println("pause the flim");
    }
}
public class interfacedemo2 {
    public static void main(String args[]){
        smartphone s=new smartphone();
        s.games();
    }

}
