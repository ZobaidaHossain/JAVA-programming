
package lab_work2;

import java.util.Scanner;

public class ASCII {
    public static void main(String[]args){
        char ch;
        int n,i;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number: ");
    n=input.nextInt();
    
    for(i=0;i<n;i++)
    {
       System.out.println("enter the value: ");
    ch=input.next().charAt(0); 
    
        if(ch<='9' && ch>='0')
        {
            System.out.println("this is a digit");
        }
        else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            if((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') || (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
            {
                System.out.println("this is an alphabet:it is a vowel");
            }
            else
            {
                System.out.println("this is an alphabet:it is a consonant");
            }
                    
        }
        else{
            System.out.println("this is a special character");
        }
    }
    
    
    
    
}
}