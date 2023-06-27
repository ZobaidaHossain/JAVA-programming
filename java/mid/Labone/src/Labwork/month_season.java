
package Labwork;
import java.awt.*;
        import java.util.Scanner;
public class month_season {
    public static void main(String[]args)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("enter the number of month:");
      int month=input.nextInt();
      switch(month){
          case 4,5:
              System.out.println("Summer");
              break;
              case 6,7:
              System.out.println("rainy season");
              break;
              case 8,9:
              System.out.println("autumn");
              break;
              case 10,11:
              System.out.println("late autumn");
              break;
              case 12,1:
              System.out.println("winter");
              break;
              case 2,3:
              System.out.println("spring");
              break;
              default:
                  System.out.println("error");
                  break;
      }
      
    }
}
