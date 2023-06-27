
public class teacher extends person{
    private String designation;
    private String dept;
   

    public teacher(String designation, String dept, String name, String age) {
        super(name, age);
        this.designation = designation;
        this.dept = dept;
    }

    
    public void displayteacherinfo(){
      System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("designation: "+this.designation);
        System.out.println("depertment: "+this.dept);
    }

    @Override
    public void displaypersoninfo() {
          System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("designation: "+this.designation);
        System.out.println("depertment: "+this.dept);
    }
}
