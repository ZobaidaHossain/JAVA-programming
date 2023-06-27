
package course_product;

import java.util.ArrayList;

public class customer {
  private String name,id;
private int age;
private ArrayList<product>productList=new ArrayList();
public customer(){}
public customer(String n, String i, int a){
    this.name=n;
    this.id=i;
    this.age=a;
}

    @Override
    public String toString() {
        return "customer{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }

public void displaycustomerinformation(){
    System.out.println("Name: "+this.name);
    System.out.println("id: "+this.id);
    System.out.println("age: "+this.age);
}
public boolean addproduct(product f){
    if(productList.add(f))
            return true;
     else
            return false;
}
public boolean removeproduct(product f){
    if(productList.remove(f))
        return true;
    else
        return false;
}
public void displayenrolledproduct(){
    for(product f: productList)
        f.displayproductinformation();
}
}

