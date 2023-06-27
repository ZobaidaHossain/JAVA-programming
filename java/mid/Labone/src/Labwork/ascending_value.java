
package Labwork;
import java.util.Scanner;
public class ascending_value {
     public static void main(String[]args){
    int i,j,n,temp=0;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number: ");
    n=input.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++){
        System.out.println("Enter the data: ");
        a[i]=input.nextInt();
    }
    for(i=0;i<a.length;i++){
        for(j=i+1;j<a.length;j++){
        if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        }
    }
    for(i=0;i<n;i++){
        System.out.println("ascending order: "+a[i]);
    }
}
}
