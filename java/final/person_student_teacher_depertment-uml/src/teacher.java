
public class teacher extends person{
    private String designation;
    private String dept;
private int salary;
    private int salaryEarned;
    public teacher(String designation, String dept, String name, String age,int salary) {
        super(name, age);
        this.designation = designation;
        this.dept = dept;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }

    public void setSalaryEarned(int salaryEarned) {
        this.salaryEarned = salaryEarned;
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
    public void displayteacherinfo(){
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("designation: "+this.designation);
        System.out.println("depertment: "+this.dept);
        System.out.println("Salary: "+this.salary);
        System.out.println("depertment: "+this.salaryEarned);
    }
}
