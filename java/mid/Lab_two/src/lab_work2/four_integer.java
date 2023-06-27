
package lab_work2;
import java.util.Scanner;
public class four_integer {
    public static void main(String[]args)
    {
        int a,b,c,d;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        a=input.nextInt();
        System.out.println("enter the value of b: ");
        b=input.nextInt();
        System.out.println("enter the value of c: ");
        c=input.nextInt();
        System.out.println("enter the value of d: ");
        d=input.nextInt();
        System.out.println("Solution of Equation - 1 = "+(a*b-c*d));
        System.out.println("Solution of Equation - 2 = "+((2*a)-b+(3*d)));
        System.out.println("Solution of Equation - 3 = "+((a*a)+(b*b)-(c*c)+(d*d)));
        System.out.println("Solution of Equation - 4 = "+((a*a*a)+b-(c*c)));
        
    }
}
