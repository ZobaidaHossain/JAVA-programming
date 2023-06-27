
public class broadcast {
   String[] language={"english","bengli","hindu","nepali","urdu"};
   String[] about={"gender","health","equality"};
   String[] media={"comics","animation","radio"};
   public broadcast(){}
   public void displaybroadcast(){
       System.out.println("language: ");
       for(int i=0;i<5;i++){
           System.out.println("language: "+language[i]);
       }
       System.out.println("about: ");
       for(int i=0;i<3;i++){
           System.out.println("about: "+about[i]);
       }
       System.out.println("media: ");
       for(int i=0;i<3;i++){
           System.out.println("media: "+media[i]);
       }
       
   }
    
    
}
