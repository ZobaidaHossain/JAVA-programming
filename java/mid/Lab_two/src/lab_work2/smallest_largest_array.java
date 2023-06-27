
package lab_work2;

import java.util.Scanner;

public class smallest_largest_array {
 public static void main(String[]args){
     int i,n,large=0,small=0;
     Scanner input=new Scanner(System.in);
     System.out.println("inter the value of n: ");
     n=input.nextInt();
     int a[]=new int[n];
     large=a[0];
     
     for(i=0;i<a.length;i++){
         System.out.println("enter the array number: ");
         a[i]=input.nextInt();
         
     }
     for(i=0;i<a.length;i++){
         if(a[i]>large){
             large=a[i];
         }
     }
     System.out.println("largest value is: "+large);
     small=a[0];
     for(i=0;i<a.length;i++){
         if(a[i]<small){
             small=a[i];
         }
     }
     System.out.println("smallest value is: "+small);
     
 }   
}
