
package Labwork;
import java.util.Scanner;
public class largest_number {
    public static void main(String[]args){
    int i,j,n,large;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number: ");
    n=input.nextInt();
    int a[]=new int[n];
    large=a[0];
    for(i=0;i<a.length;i++){
        System.out.println("Enter the data: ");
        a[i]=input.nextInt();
    }
    for(i=0;i<a.length;i++){
        if(large<a[i])
        {
            large=a[i];
        
    }
    
    }
    System.out.println("largest number: "+large);
}
}
