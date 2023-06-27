
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class customer {
    private String name;
    private String email;
   private ArrayList<item>itemList = new ArrayList<>();
    public customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "customer{" + "name=" + name + ", email=" + email + '}';
    }
    public boolean Additem(item i)
    {
        if(itemList.add(i)) {
            return true;
        }
        else return false;
    }
    public boolean Removeitem(item i){
        if(itemList.remove(i)){
            return true;
        }
        else 
            return false;
    }
    public void listofselecteditem(){
        for(item i:itemList)
            i.display();
    }
    public static void main(String args[]){
       // user u1=new user("zob123","pass123");
          //customer c1=new customer("zobaida","zobaida@gmail.com");
         // customer c2=new customer("sami","sami@gmail.com");
         //u1.setcustomer(c1);
          //u1.displayuser();
         
          //item i1=new item("milk",30);
         // item i2=new item("rice",20);
          //i1.setPrice(50);
             //i1.display();
          //i2.display();
          
         // u1.setcustomer(c2);
          //u1.displayuser();
         // item i3=new item("egg",10);
          //i2.display();
         // i3.display();
          String userid=JOptionPane.showInputDialog("enter the user id");
          String passwd=JOptionPane.showInputDialog("enter the password: ");
          //String name=JOptionPane.showInputDialog("enter the name: ");
          //String email=JOptionPane.showInputDialog("enter the email");
          
          user u2=new user(userid,passwd);
         // customer c3=new customer(name,email);
          u2.setPasswd("1111");
          //u2.setcustomer(c3);
         
          u2.displayuser();
          //if(c3.Additem(i1))
            //  System.out.println("item added");
          //else
             // System.out.println("item not added");
             // if(c3.Additem(i2))
             // System.out.println("item added");
         // else
             // System.out.println("item not added");
                  //if(c3.Additem(i3))
              //System.out.println("item added");
          //else
              ///System.out.println("item not added");
         // JOptionPane.showMessageDialog(null,c3.toString());
       //c3.listofselecteditem();
      // c3.Removeitem(i2);
      // System.out.println("enrolled item after remove: ");
       //c3.listofselecteditem();
        
    }
}