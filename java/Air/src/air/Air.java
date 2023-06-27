/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air;
  import java.util.Arrays;
import java.util.Scanner;

public class Air {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] array = new boolean[10];

        Arrays.fill(array, Boolean.FALSE);

        int FirstClass = 0, EconomyClass = 5, full;

        System.out.println("AIRLINE SERVICE");
        for (int j = 0; j < array.length; j++) {
            System.out.println((j + 1) + " book: " + array[j]);
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println("Type-1 for first class");
            System.out.println("Type-2 for second class ");
            System.out.println("Type-3 for exit ");

            int select = input.nextInt();
            {
                if (select == 1) {
                    System.out.println("TICKET");
                    if (array[i] == false) {
                        array[i] = true;
                        FirstClass++;
                        if (FirstClass <= 5) {
                            System.out.println("Book:first class ticket");
                            System.out.println("Your seat number is: " + FirstClass);
                        } 
                        
                        else {
                            System.out.println("First class is full");
                             System.out.println("do yo want to go economy class?");
                    System.out.println("if yes then type 1");
                    System.out.println("if no then type 2");
                            full = input.nextInt();
                            if (full == 1) {
                                System.out.println("type 1 for main menu");
                            }
                            else {
                                System.out.println("next flight leaves in 3 hours");
                            }
                        }
                    }
                } 
                else if (select == 2) {
                    System.out.println("Ticket");
                    if (array[i] == false) {
                        array[i] = true;
                        EconomyClass++;
                        if ((EconomyClass > 5) && (EconomyClass <= 10)) {
                            System.out.println("Book:economy class ticket");
                            System.out.println("Your seat number is : " + EconomyClass);
                        } 
                        else {
                            System.out.println("economy class is full");
                           System.out.println("do yo want to go economy class?");
                           System.out.println("if yes then type 1");
                            System.out.println("if no then type 2");
                            full = input.nextInt();
                            if (full == 1) {
                                System.out.println("type 1 for main menu");
                            } else {
                                System.out.println("next flight leaves in 3 hours");
                            }
                        }
                    }
                } else if (select == 3) {
                    System.out.println("thank you");

                    for (int j = 0; j < array.length; j++) {
                        System.out.println((j + 1) + " book: " + array[j]);
                    }
                    break;
                }
                System.out.println("Type-1 for book again");
                System.out.println("type-2 for exit");
            }
        }
    }
}