
package employee_uml;
import javax.swing.*;
import javax.swing.JOptionPane;

public class employee {
    private String name,id,designation;
    private String salary;
    public employee(){}

    public employee(String name, String id, String designation,String salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" + "name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary + '}';
    }
   public void displayemployee(){
   JOptionPane.showMessageDialog(null,this.toString());
   }
   public static void main(String[]args){
       employee e1=new employee();
      e1.setName("opshory");
      e1.setId("201");
      e1.setDesignation("CEO");
      e1.setSalary("100000");
   employee e2=new employee();
      e2.setName("zobaida");
      e2.setId("101");
      e2.setDesignation("manager");
      e2.setSalary("30000");
      employee e3=new employee();
      e3.setName("sami");
      e3.setId("20111");
      e3.setDesignation("assistent manager");
      e3.setSalary("20000");
      e1.displayemployee();
      e2.displayemployee();
      e3.displayemployee();
      
   }
   
}
