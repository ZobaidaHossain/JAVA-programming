import javax.swing.*;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Book b1 = new Book("The Coalition Years", 500, 100);
        Author a1 = new Author("Pranab Mukherjee", "PMukherjee.23@yahoo.com", "Male");
        b1.setAuthor(a1);
        Book b2 = new Book("Two Lives", 800, 50);
        Author a2 = new Author("Vikram Seth", "Vseth123@gmail.com", "Male");
        b2.setAuthor(a2);
        Book b3 = new Book("Wings of Fire", 700, 87);
        Author a3 = new Author("APJ Abdul Kalam", "kalam346@hotmail.com", "Male");
        b3.setAuthor(a3);
        String name = JOptionPane.showInputDialog("Enter Name: ");
        String id = JOptionPane.showInputDialog("Enter ID: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));


        Student s1 = new Student(name, id, age);

        s1.display();
        b1.DisplayBookInfo();
        b2.DisplayBookInfo();

        System.out.println("\n\nList of Selected Books: ");
        s1.AddBook(b1);
        b1.setQtyInStock(99);

        System.out.println("\n");
        s1.AddBook(b2);
        b2.setQtyInStock(49);

        s1.ListOfSelectedBooks();
        s1.RemoveBook(b2);

//        System.out.println("Press 1 to Remove" + b1.getName() + "From Selection");
//        System.out.println("Press 2 to Remove" + b2.getName() + "From Selection");
//        Scanner scan = new Scanner(System.in);
//        int rep = scan.nextInt();
//        if (rep == 1)
//            s1.RemoveBook(b1);
//        if (rep == 2)
            s1.RemoveBook(b2);
            b2.setQtyInStock(50);
//        else
//            System.out.println("Sorry!! Invalid Input");

        System.out.println("\n\nList of Selected Books After Removing: ");
        s1.ListOfSelectedBooks();

        s1.AddBook(b3);
        b3.setQtyInStock(86);
        System.out.println("\n\nList of Selected Books After Addition: ");
        s1.ListOfSelectedBooks();
        //JOptionPane.showMessageDialog(null, s1.ListOfSelectedBooks());
    }
}
