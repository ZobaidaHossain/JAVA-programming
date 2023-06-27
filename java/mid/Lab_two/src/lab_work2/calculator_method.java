
package lab_work2;

import java.util.Scanner;

public class calculator_method {
    public static int addition(int x, int y){
      return x+y; 
    }
    public static int subtraction(int x, int y){
       
        return x-y;
    }
    public static int multipication(int x, int y){
       return x*y;
        
    }
    public static int division(int x, int y){
        
        return x/y;
    }
    public static void main(String[]args){
        int a,b,result=0;
        char c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first value: ");
        a=input.nextInt();
         System.out.println("enter the second value: ");
        b=input.nextInt();
         System.out.println("enter the operator: ");
        c=input.next().charAt(0);
        
        switch(c)
        {
            case '+':
                result=addition(a,b);
                break;
            case '-':
                result=subtraction(a,b);
                break;
            case '*':
                result=multipication(a,b);
                break;
            case '/':
                result=division(a,b);
                break;
            default:
                System.out.println("error!");
            }
        System.out.println("final result: "+result);
                
        }
    }

