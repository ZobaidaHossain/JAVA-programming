
package lab_work2;

import java.util.Scanner;

public class temperature_conversion {
    public static void fahrenheit_to_celsius(){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the fahrenheit value: ");
        float f=input.nextFloat();
        System.out.println("celcius: "+((5*(f-32))/9));
    }
    public static void celsius_to_fahrenheit(){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the celcius value: ");
        float c=input.nextFloat();
        System.out.println("celcius: "+((c*9/5)+32));
    }
    
    public static void main(String[]args){
    int n,j,i;
    Scanner input=new Scanner(System.in);
    System.out.println("n=1 means fahrenheit to celsius");
    System.out.println("n=2 means celsius to fahrenheit");
        System.out.println("enter the value of n: ");
    n=input.nextInt();
    if(n==1){
        
        fahrenheit_to_celsius();
    }
    else if(n==2){
        
        celsius_to_fahrenheit();
    }
    else{
        System.out.println("error!");
    }
    
    
    
    }
}
