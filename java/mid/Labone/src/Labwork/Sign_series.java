
package Labwork;
import java.util.Scanner;
public class Sign_series {
    public static void main(String[]args){
        int i,n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i+"-");
            }
            else if(i%2==0)
            {
        System.out.println(i+"+");
            }
            if(i%2!=0)
                sum=sum+i;
                
            
            else if(i%2==0)
                sum=sum-i;
            
        }
        System.out.println("result: "+sum);
    }
}
