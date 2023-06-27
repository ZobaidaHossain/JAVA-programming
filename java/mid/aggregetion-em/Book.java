public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, double price, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void DisplayBookInfo()
    {
        System.out.println("Book Name: "+this.name);
        System.out.println("Book Author: "+this.author);
        System.out.println("Book Price: "+this.price);
        System.out.println("Quantity in Stock: "+this.qtyInStock);
    }

    public void UpdatePrice(double p)
    {

    }

    public double getPrice() {
        return price;
    }
}
