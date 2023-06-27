
package Labwork;
import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void main(String[]args){
    float f,c;
    Scanner input=new Scanner(System.in);
    System.out.println("Input a degree in Fahrenheit: ");
    f=input.nextFloat();
    c=((5*(f-32))/9);
    System.out.println(f+" degree Fahrenheit is equal to"+c+"in Celsius");
    }
}
