
import java.util.Scanner;

public class OverLoadingDemo {

   public static int findMin(int p, int q){
   
       if(p<q)
           return p;
       else
           return q;
   }
   public static int findMin(int p, int q, int r)
   {
        if(p<q && p<r)
            return p;
        else if(q<p && q<r)
            return q;
        else
            return r;
   
   }
   public static void findMin(float p, float q)
   {
       if(p<q)
           System.out.println("Smallest is : "+p);
       else
           System.out.println("Smallest is : "+q);
   
   }
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int a,b,c;
      float x,y,z;
      System.out.println("Enter first Integer: ");
      a=scan.nextInt();
      
      System.out.println("Enter second Integer: ");
      b=scan.nextInt();
      
      System.out.println("Enter third Integer: ");
      c=scan.nextInt();
      
      System.out.println("Minimum among two integers: "+findMin(a,b));
      System.out.println("Minimum among three integers: "+findMin(a,b,c));
      
      System.out.println("Enter first Float: ");
      x=scan.nextFloat();
      
      System.out.println("Enter second Float: ");
      y=scan.nextFloat();
      
      findMin(x,y);
    }
    
}
