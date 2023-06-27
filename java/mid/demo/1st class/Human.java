public class Human {
   String name,nationality;
      int age;
      static int totalObject;
      void display()
      {
          System.out.println("Name: "+name);
          System.out.println("Nationality: "+nationality);
       System.out.println("Age:"+age);
      }
    public static void main(String[] args) {
   
      Human h1,h2;
      h1=new Human();
      h2=new Human();
      h1.name="opshory";
      h1.age=40;
      h1.nationality="bangla";
      h1.display();
      
      
    }
    
}
