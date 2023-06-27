
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private String name, id, designation;
    private int age;
    private double salary;
    
    public Employee(){}
    
    public Employee(String name, String id)
    {
        this.name=name; this.id=id;
    }

    public Employee(String name, String id, String designation, int age, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Designation: "+this.designation);
    }
    public static void main(String[] args) {
     
     ArrayList<Employee> emplist=new ArrayList();
     Employee e1=new Employee();
     Scanner scan=new Scanner(System.in);
     
     System.out.print("Enter name: ");
     String name=scan.next();
     e1.setName(name);
     emplist.add(e1);
     Employee e2=new Employee("Abdul", "123-456", "Manager",40, 80000);
     emplist.add(e2);
     e2.setSalary(85000);
     
     e1.display();
     e2.display();
     
             
    }
}
