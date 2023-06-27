
package lab_work2;

import java.util.Scanner;

public class summation {
    public static void main(String[]args)
    {
        int i,n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        n=input.nextInt();
        int a[]=new int[n];
        sum=a[0];
        for(i=0;i<a.length;i++)
        {
            System.out.println("enter the array number: ");
            a[i]=input.nextInt();
        }
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
            
        }
        System.out.println("summation: "+sum);
    }
}
