
package main;

import java.util.Scanner;


import school.School;


public class Main {
    static Scanner input=new Scanner(System.in);
    static String choice;
    static School school;
    
   public static void main(String[]args){
       school=new School(name="ops");
       display();
  
  
   }
   public static void display(){
       System.out.println("---Welcome to"+school.getName()+"---");
       System.out.println("1:Schhol\n2.Student\n3.Teacher\n4.Exit");
       choice=input.next();
   }
}
