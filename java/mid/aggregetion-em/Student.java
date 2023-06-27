import javax.swing.*;
import java.util.ArrayList;

public class Student {
    private String name, id;
    private int age;
    private ArrayList<Book>BookList = new ArrayList<>();

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean AddBook(Book B)
    {
        if(BookList.size()<5)
        {
            BookList.add(B);
            return true;
        }
        else
            return false;
    }

    public boolean RemoveBook(Book B)
    {
        if(BookList.remove(B))
            return true;
        else
            return false;
    }

    public void display()
    {
//        System.out.println("Name: "+this.name);
//        System.out.println("ID: "+this.id);
//        System.out.println("Age: "+this.age);
        JOptionPane.showMessageDialog(null, this.toString());
    }

    public void ListOfSelectedBooks()
    {
        for(Book b: BookList)
            b.DisplayBookInfo();
    }
}
