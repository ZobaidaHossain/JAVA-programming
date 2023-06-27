
import javax.swing.JOptionPane;


public class item {
  private String itemname;
private double price;

    public item(String itemname, double price) {
        this.itemname = itemname;
        this.price = price;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "item{" + "itemname=" + itemname + ", price=" + price + '}';
    }
public void display(){
    System.out.println("itemname:"+itemname);
    System.out.println("price"+price);
    JOptionPane.showMessageDialog(null,this.toString());
}
}