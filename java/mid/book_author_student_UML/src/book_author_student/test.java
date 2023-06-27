
package book_author_student;

import javax.swing.JOptionPane;

public class test {
     public static void main(String args[]){
         student s1 = new student("ppp","202",10);
   s1.display();
   String name=JOptionPane.showInputDialog("enter name");
    String id=JOptionPane.showInputDialog("enter id");
     int age =Integer.parseInt(JOptionPane.showInputDialog("enter age"));
     student s2=new student(name,id,age);
     s2.display();
     book b1=new book("oppo naki opshory",200,500);
     book b2=new book("nondito noroke",100,300);
     author a1=new author("opshory","zobaida.opshory@gmail.com","female");
     b1.setauthor(a1);
     b2.setauthor(a1);
     System.out.println(b1.toString());
     System.out.println(b2.toString());
   
     s1.displayenrolledbook();
     
    } 
}
