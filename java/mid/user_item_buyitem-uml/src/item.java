
import javax.swing.JOptionPane;


public class item {
   private String itemname;
   private double price;
   private buyitem b;
    public item(String itemname, double price) {
        this.itemname = itemname;
        this.price = price;
    }

    public buyitem getbuyitem() {
        return b;
    }

    public void setbuyitem(buyitem b) {
        this.b = b;
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
        return "item{" + "itemname=" + itemname + ", price=" + price + ", b=" + b + '}';
    }

    
   public void displayiteminfo(){
       System.out.println("itemname: "+this.itemname);
       System.out.println("price:"+this.price);
       System.out.println("buyitem:"+this.b);
       JOptionPane.showMessageDialog(null,toString());
   }
}
