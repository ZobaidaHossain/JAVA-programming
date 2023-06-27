
package course_product;

public class product {
    private String name,id;
    private double price;
    public product(){}
    public product(String n, String i, double p){
        this.name=n;
        this.id=i;
        this.price=p;
    }
    public void displayproductinformation()
    {
        System.out.println("product name: "+this.name);
        System.out.println("product id: "+this.id);
        System.out.println("product price: "+this.price);
    }
}
