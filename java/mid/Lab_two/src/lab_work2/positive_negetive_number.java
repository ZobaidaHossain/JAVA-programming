
package lab_work2;

import java.util.Scanner;

public class positive_negetive_number {
  public static void main(String[]args)
  {
      int i,n,num=0,p,ne;
      Scanner input=new Scanner(System.in);
     System.out.println("enter the value of n: ");
      n=input.nextInt();
      int a[]=new int[n];
      num=a[0];
      for(i=0;i<a.length;i++){
         System.out.println("enter the array number: ");
         a[i]=input.nextInt();
                 
      }
      for(i=0;i<a.length;i++){
          if(a[i]>=0){
              System.out.println("positive number: "+a[i]);
              
          }
          else if(a[i]<0){
              System.out.println("negetive number: "+a[i]);
          }
          
      }
              
  }
}
