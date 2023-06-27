
package course_product;

import javax.swing.JOptionPane;

public class test {
    public static void main(String args[]){
        customer c1=new customer("Opshory","201-15-13671",20);
         product p1=new product("rice","r111",50);
         product p2=new product("milk","m111",70);
         product p3=new product("juice","j111",30);
         product p4=new product("pen","p111",5);
         product p5=new product("egg","e111",10);
         if(c1.addproduct(p1))
             System.out.println("product added");
         else
             System.out.println("product not added");
         if(c1.addproduct(p2))
             System.out.println("product added");
         else
             System.out.println("product not added");
         if(c1.addproduct(p3))
             System.out.println("product added");
         else
             System.out.println("product not added");
         if(c1.addproduct(p4))
             System.out.println("product added");
         else
             System.out.println("product not added");
         if(c1.addproduct(p5))
             System.out.println("product added");
         else
             System.out.println("product not added");
         JOptionPane.showMessageDialog(null,c1.toString());
         System.out.println("initial enrolled product ");
         c1.displayenrolledproduct();
         c1.removeproduct(p4);
         System.out.println("enrolled product after remove ");
         c1.displayenrolledproduct();
        // if(c1.addproduct(p5))
             //System.out.println("product added");
         //else
             //System.out.println("product not added");
         System.out.println("enrolled product after new addition");
         c1.displayenrolledproduct();
                     
         
    }
}
