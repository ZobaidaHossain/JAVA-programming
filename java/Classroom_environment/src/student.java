    
public class student extends person implements Reading,Attentive_to_class{
    private String id;
    private String cgpa;
  

    public student(String id, String cgpa, String name, String age) {
       super(name, age);
        this.id = id;
        this.cgpa = cgpa;
      
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }
    public void CompleteTheLesson(){
        System.out.println("Students always complete their lesson regularly"); 
    }
  public void payAttentionInClass(){
        System.out.println("Students always attentive in his class"); 
        System.out.println("\n");
         System.out.println("Students also attracted  to go his classroom regularly"); 
  }
    
     
    public void displaystudentinfo(){
     System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("id: "+this.id);
        System.out.println("cgpa: "+this.cgpa);
        
    }
}
