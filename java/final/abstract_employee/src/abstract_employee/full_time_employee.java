
package abstract_employee;

public class full_time_employee extends employee{
   private double salary;

    public full_time_employee() {
    }

    public full_time_employee(double salary, String name, String id) {
        super(name, id);
        this.salary = salary;
    }

   

   

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatesalary() {
       return this.salary;
    }

    @Override
    public void display() {
       System.out.println("salary: "+this.salary);
    }
   
}
