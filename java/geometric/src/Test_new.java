
public class Test_new {
  
    public static void main(String args[])
    {
       GeometricObject geo1=new Circle(5,"Red",true);
       GeometricObject geo2=new Rectangle1(5,5,"blue",true);
       
       
      
        
       System.out.println(geo1.getDateCreated());
       System.out.println("Area "+ geo1.getArea());
       System.out.println("Perimeter " +geo1.getPerimiter());
       System.out.println(geo1.toString());
       
       
       System.out.println(geo2.getDateCreated());
       System.out.println("Area "+ geo2.getArea());
       System.out.println("Perimeter " +geo2.getPerimiter());
       System.out.println(geo2.toString());
    }
}
  

