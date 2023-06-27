
package assignment1;

import java.util.Scanner;

public class triangle {
 public static void main(String[]args){
     Scanner input=new Scanner(System.in);
     System.out.println("enter three sides: ");
     double side1 = input.nextDouble();
     double side2 = input.nextDouble();
     double side3 = input.nextDouble();
     boolean result = isvalid(side1,side2,side3);
     double area = area(side1,side2,side3);
     System.out.println("the value of the side is "+ result);
     if(result=true)
      System.out.println("area: "+ area);  
     else
         System.out.println("error!");
 }
 public static boolean isvalid(double side1,double side2,double side3){
     boolean result = ((side1+side2)>side3) && ((side1+side3)>side2) && ((side2+side3)>side1);
     return result;
 }
 public static double area(double side1,double side2,double side3){
     double s=((side1+side2+side3)/2);
     return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
 }
}
