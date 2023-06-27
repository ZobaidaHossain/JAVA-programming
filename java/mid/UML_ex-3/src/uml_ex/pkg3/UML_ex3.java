
package uml_ex.pkg3;
import javax.swing.JOptionPane;
class student{
    private String name,id;
    private int age;
    
    public student(String n, String i, int a){
        this.name=n;
        this.id=i;
        this.age=a;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null,this.toString());
    }
}


public class UML_ex3 {

    public static void main(String[] args) {
      student s1=new student("basar","123",18);
      s1.display();
      String name=JOptionPane.showInputDialog("enter the name: ");
      String id=JOptionPane.showInputDialog("enter the id: ");
      int age=Integer.parseInt(JOptionPane.showInputDialog("enter age; "));
      student s2=new student(name,id,age);
      s2.display();
    }
    
}
