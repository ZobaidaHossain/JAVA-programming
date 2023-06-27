
package Labwork;
import java.util.Scanner;
public class odd_number_square {
    public static void main(String[]args){
        int i,n,Sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("series: "+(i*i));
                Sum=Sum+(i*i);
                
            }
        }
        System.out.println("result:"+Sum);
        
        
    }
    
}
