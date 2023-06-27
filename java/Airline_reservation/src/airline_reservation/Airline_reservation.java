
package airline_reservation;

import java.util.Arrays;
import java.util.Scanner;

public class Airline_reservation {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int firstclass_seat=0;
     int economyclass_seat=5;
     Boolean[]arr=new Boolean[10];
     Arrays.fill(arr, Boolean.FALSE);
     
     System.out.println("all seats are empty");
         System.out.println("Airline reservation");
        System.out.println("all seats are empty");
    
     int i = 0;
     do{
         
         System.out.println("type-1 for first class");
         System.out.println("type-2 for economy class");
         int select=scan.nextInt();
         switch(select){
             case 1:
                 
                 System.out.println("boarding pass");
                 System.out.println("your seat is the first section");
                 firstclass_seat++;
                if(firstclass_seat<=5){
                    System.out.println("your seat number is:"+firstclass_seat);
                    }
                else{
                    System.out.println("first class is full");
                    System.out.println("do yo want to go economy class?");
                    System.out.println("if yes then type 1");
                    System.out.println("if no then type 2");
                    int select2=scan.nextInt();
                    if(select2==1){
                         System.out.println("do yo want to go economy class?");
                    System.out.println("if yes then type 1");
                    System.out.println("if no then type 2");
                    }
                    else{
                        System.out.println("next flight leaves in 3 hours");
                    }
                }
                break;
                
             case 2:
                 System.out.println("boarding pass");
                 System.out.println("your seat is the economy section");
                 economyclass_seat++;
                if((economyclass_seat>5)&&(economyclass_seat<=10)){
                    System.out.println("your seat number is:"+economyclass_seat);
                    }
                else{
                    System.out.println("economy class is full");
                    System.out.println("do yo want to go first class? if yes then type 1\n if no then type 2");
                    int select2=scan.nextInt();
                    if(select2==1){
                        System.out.println("press 1 for booking first class seat");
                    }
                    else{
                        System.out.println("next flight leaves in 3 hours");
                    }
                }   
         }
         System.out.println("type-1 for booking again\n ");
          System.out.println("type-2 for exit the reservation\n ");
     i=scan.nextInt();
     }while(i==1);
     
    }
    
}
