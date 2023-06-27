
package lab_work2;

import java.util.Scanner;

public class grading_system {
  public static void main(String[]args)
  {
      int mark;
      Scanner input=new Scanner(System.in);
      System.out.println("enter the marks: ");
      mark=input.nextInt();
     if(mark<=100 && mark>=80)
     {
         System.out.println("Grade:A+");
         System.out.println("Grade point equivalent: 4.00");
         System.out.println("Remarks :outstanding");
         
     }
     else if(mark<80 && mark>=75)
     {
         System.out.println("Grade:A");
         System.out.println("Grade point equivalent: 3.75");
         System.out.println("Remarks :Excellent");
     }
     else if(mark<75 && mark>=70)
     {
         System.out.println("Grade:A-");
         System.out.println("Grade point equivalent: 3.50");
         System.out.println("Remarks :very good");
     }
     else if(mark<70 && mark>=65)
     {
         System.out.println("Grade:B+");
         System.out.println("Grade point equivalent: 3.25");
         System.out.println("Remarks :good");
     }
     else if(mark<65 && mark>=60)
     {
         System.out.println("Grade:B");
         System.out.println("Grade point equivalent: 3.00");
         System.out.println("Remarks :Satisfactory");
     }
     else if(mark<60 && mark>=55)
     {
         System.out.println("Grade:B-");
         System.out.println("Grade point equivalent: 2.75");
         System.out.println("Remarks :Above Average");
     }
     else if(mark<55 && mark>=50)
     {
         System.out.println("Grade:C+");
         System.out.println("Grade point equivalent: 2.50");
         System.out.println("Remarks :Average");
     }
     else if(mark<50 && mark>=45)
     {
         System.out.println("Grade:c");
         System.out.println("Grade point equivalent: 2.25");
         System.out.println("Remarks :bellow average");
     }
     else if(mark<45 && mark>=40)
     {
         System.out.println("Grade:D");
         System.out.println("Grade point equivalent: 2.00");
         System.out.println("Remarks :Pass");
     }
     else if(mark<40)
     {
         System.out.println("Grade:F");
         System.out.println("Grade point equivalent: 0.00");
         System.out.println("Remarks :Fall");
     }
     else
     {
         System.out.println("error!");
     }
  }
}
