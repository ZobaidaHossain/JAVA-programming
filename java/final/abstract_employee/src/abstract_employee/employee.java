
package abstract_employee;



public abstract class employee {
    private String name;
    private String id;
    private address a;
    
    public employee() {
    }
    public employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public address getaddress() {
        return a;
    }

    public void setaddress(address a) {
        this.a = a;
    }
   
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" + "name=" + name + ", id=" + id + '}';
    }

   

   
    public abstract double calculatesalary();
    public abstract void display();

   
 
}
