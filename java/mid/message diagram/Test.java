
import javax.swing.JOptionPane;

class Student
{
   private String name,id;
   private int age;
   
   public Student(String n, String i, int a)
   {
       this.name=n;
       this.id=i;
       this.age=a;
   }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }
   
   public void display()
   {
       JOptionPane.showMessageDialog(null,this.toString());
   }
}
public class Test {
    public static void main(String args[])
    {
        Student s1=new Student("Bahar","123-456",18);
        s1.display();
        String name=JOptionPane.showInputDialog("Enter Name");
        String id=JOptionPane.showInputDialog("Enter ID");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        
        Student s2=new Student(name, id, age);
        s2.display();
    }
    
}
