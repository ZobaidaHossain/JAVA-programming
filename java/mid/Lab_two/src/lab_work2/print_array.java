
package lab_work2;

import java.util.Scanner;

public class print_array {
   public static void main(String[]args){
       int n,i;
      Scanner input=new Scanner(System.in);
      System.out.println("enter the value of n: ");
      n=input.nextInt();
      int a[]=new int[n];
      for(i=0;i<a.length;i++)
      {
          System.out.println("enter the value: ");
          a[i]=input.nextInt();
      }
      for(i=0;i<a.length;i++){
      System.out.println("print the value: "+a[i]);
      }
   } 
}
