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
public class Author {
    private String name, email, gender;
    public Author(){}

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }
    
    public void display()
    {
        System.out.println("Name: "+this.name+" "+"Email: "+this.email);
    
    }
    
    
}
