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
public class Test {
    public static void main(String args[])
    {
        Book b1=new Book("Feludar Goyendagiri", 200, 500);
        Author a1=new Author("Satyajit Ray", null, "Male");
        b1.setAuthor(a1);
        System.out.println(b1.toString());
    }
}
