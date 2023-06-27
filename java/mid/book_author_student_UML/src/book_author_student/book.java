
package book_author_student;


public class book {
   private String name;
    private double price;
    private int qty;
    private author au;
    public book(){}

    public book(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   public void setauthor(author a){
       this.au=a;
   }
   public author getauthor(){
       return this.au;
   }

    @Override
    public String toString() {
        return "book{" + "book name=" + name + ","
                + "\n book price=" + price + ","
                + "\n book qty=" + qty + ","
                + "\n au=" + au + '}';
    } 
    public void displaybookinformation(){
        System.out.println("name: "+this.name);
        System.out.println("price: "+this.price);
        System.out.println("qty: "+this.qty);
    }
}
