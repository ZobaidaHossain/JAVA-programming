
import javax.swing.JOptionPane;


public class buyitem {
    private String buydate;
    private int quantity;

    public buyitem(String buydate, int quantity) {
        this.buydate = buydate;
        this.quantity = quantity;
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "buyitem{" + "buydate=" + buydate + ", quantity=" + quantity + '}';
    }
    public void buyitem(){
        System.out.println("buydate:"+buydate);
        System.out.println("quantity:"+quantity);
        JOptionPane.showMessageDialog(null,this.toString());
    }
}
