
package abstract_employee;


public class test {
    public static void main(String args[]){
        
       
       employee e1 = new part_time_employee("zobaida","201-15-13671",25,26);
       
       employee e2=new full_time_employee(100000,"Shabab","777");
       address a1= new address(17,2,"kalshi,mirpur-12");
       address a2=new address(22,99,"senpara");
       e1.setaddress(a1);
       e2.setaddress(a2);
       System.out.println("parttime job for employee-1:");
       a1.displayaddress();
        System.out.println("calculatesalary:"+e1.calculatesalary());
        e1.display();
        System.out.println(e1.toString());
        System.out.println("\n");
         System.out.println("fulltime job for employee-2:");
         a2.displayaddress();
        System.out.println("calculatesalary:"+e2.calculatesalary());
        e2.display();
        System.out.println(e2.toString());
    }
}
