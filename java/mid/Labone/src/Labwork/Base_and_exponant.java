
package Labwork;
import java.util.Scanner;
public class Base_and_exponant {
    public static void main(String[]args){
  int b,e;
Scanner input=new Scanner(System.in);
System.out.println("enter the base number: ");
b=input.nextInt();
System.out.println("enter the exponant number: ");
e=input.nextInt();

double pow=Math.pow(b,e);
System.out.println("Result: "+pow);
    }
}
