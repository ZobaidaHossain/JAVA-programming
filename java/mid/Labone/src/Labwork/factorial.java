
package Labwork;
import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        int i,f=1,n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=input.nextInt();
        if(n<0){
            System.out.println("error!");
        }
        else{
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("factorial: "+f);
        }
    }
}
