
package book_author_student;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class student {
    private String name,id;
    private int age;
    private ArrayList<book>bookList=new ArrayList();
    public student(){}

    public student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void displaystudentinformation(){
        System.out.println("name: "+this.name);
        System.out.println("id: "+this.id);
        System.out.println("age: "+this.age);
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", id=" + id + ", age=" + age + ", bookList=" + bookList + '}';
    }
public void display(){
    JOptionPane.showMessageDialog(null,this.toString());
}
public void displayenrolledbook(){
    for(book b:bookList)
        b.displaybookinformation();
}
}
