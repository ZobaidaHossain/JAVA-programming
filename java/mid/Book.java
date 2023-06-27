/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassRelation_Aggregation;

/**
 *
 * @author zakia
 */
public class Book {
    private String name;
    private double price;
    private int qty;
    private Author author;
    
    public Book(){}

    public Book(String name, double price, int qty) {
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
    public void setAuthor(Author a)
    {
        this.author=a;
    }
    public Author getAuthor()
    {
        return this.author;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + ", qty=" + qty + ", author=" + author + '}';
    }
    
}
