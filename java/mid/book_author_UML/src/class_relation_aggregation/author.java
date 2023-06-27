
package class_relation_aggregation;

public class author {
    private String name;
    private String email;
    private String gender;
    public author(){}

    public author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "author{" + "author name=" + name + 
                ",\n author email=" + email + 
                ",\n author gender=" + gender + '}';
    }

  
    public void display(){
        System.out.println("Author Name: "+this.name);
         System.out.println("Author email: "+this.email);
          System.out.println("Author gender: "+this.gender);
       
        
    }
}
