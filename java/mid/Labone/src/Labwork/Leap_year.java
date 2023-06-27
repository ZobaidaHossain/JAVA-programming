
package Labwork;
import java.util.Scanner;
public class Leap_year {
    public static void main(String[]args){
    int y;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the year: ");
    y=input.nextInt();
    if(y%4==0)
    {
        System.out.println(y+ "this year is leap year");
    }
    else{
        System.out.println(y+"this year is not leap year");
    }
}
}
