package javaapplication62;

import java.util.Scanner;

public class Solution 
{

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("Divisors of " +  num + " are " );
        for(int a = 1; a < num; a++)
        {
            if (num % a == 0)
            {
              
                System.out.print(+a);
                for(int i=1;i<2;i++){
                 
            } 
                System.out.print(",");
                 //break;
           }
          // break; 
           
        }
        break;
       
        
    }
}