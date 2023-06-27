
import java.util.ArrayList;


public class adventure {
    private ArrayList<character>characterList=new ArrayList();
    public void education(){
    
}
    public void equal(){
        
    }
     public void hiv(){
        
    }
      public void baby(){
        
    }
       public void people(){
        
    }
       public static void main(String[]args){
           character c1=new character("meena");
           character c2=new character("raju");
           character c3=new character("meethu");
           c1.addcharacter(c1);
           c2.addcharacter(c2);
           c3.addcharacter(c3);
           c1.displaycharacter();
            c2.displaycharacter();
             c3.displaycharacter();
           broadcast b=new broadcast();
           b.displaybroadcast();
       }
}
