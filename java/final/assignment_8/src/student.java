
public class student extends person {
    private String id;
    private String cgpa;

    public student(String id, String cgpa, String name, String age) {
       super(name, age);
        this.id = id;
        this.cgpa = cgpa;
    }
    
    public void displaystudentinfo(){
       System.out.println("name: "+this.name);
        System.out.println("id: "+this.id);
        System.out.println("age: "+this.age);
       
        System.out.println("cgpa: "+this.cgpa);
    }

    @Override
    public void displaypersoninfo() {
        System.out.println("name: "+this.name);
        System.out.println("id: "+this.id);
        System.out.println("age: "+this.age);
       
        System.out.println("cgpa: "+this.cgpa); 
      
    }
}
