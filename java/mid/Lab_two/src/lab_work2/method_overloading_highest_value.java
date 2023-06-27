
package lab_work2;

import java.util.Scanner;

public class method_overloading_highest_value {
    public static int highestvalue(int p, int q)
    {
        if(p>q){
            return p;
        }
        else{
            return q;
        }
    }
    public static int highestvalue(int p, int q, int r)
    {
        if(p>q && p>r){
            return p;
        }
        else if(q>p && q>r){
            return q;
        }
        else{
            return r;
        }
    }
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first value: ");
        a=input.nextInt();
       System.out.println("enter the second value: ");
        b=input.nextInt();
        System.out.println("enter the third value: ");
        c=input.nextInt();
        System.out.println("highest value between two values: "+highestvalue(a,b));
        System.out.println("highest value between three values: "+highestvalue(a,b,c));
        
    }
}
