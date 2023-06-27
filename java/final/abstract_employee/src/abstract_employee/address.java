
package abstract_employee;

import java.util.ArrayList;



public class address {
    private int houseno;
    private int road;
    private String area;
   
private ArrayList<employee>employeelist=new ArrayList<>();
    public address() {
    }

    public address(int houseno, int road, String area) {
        this.houseno = houseno;
        this.road = road;
        this.area = area;
    }
    public void displayaddress(){
        System.out.println("house no:"+this.houseno);
        System.out.println("road:"+this.road);
        System.out.println("area:"+this.area);
        
    }
     public void addemployee(employee a){
     employeeList.add(a);   
    }
    public void displayaddressinfo(){
            for(address a:employeeList)
                a.displayaddress();
    }
}
