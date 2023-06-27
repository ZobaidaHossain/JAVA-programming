
package teachers;


public class Teacher {
     private int id;
   private String name;
   private int salary;
   private int receivedsalary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.receivedsalary=0;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getReceivedsalary() {
        return receivedsalary;
    }

    public void setReceivedsalary(int receivedsalary) {
        this.receivedsalary = receivedsalary;
    }
   public void receivesalary(int salary){
       receivedsalary+=salary;
   }
   
   public int getunpaidsalary(){
       return getSalary()-getReceivedsalary();
   }
}
