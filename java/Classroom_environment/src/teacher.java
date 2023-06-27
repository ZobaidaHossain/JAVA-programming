    
public class teacher extends person implements Teaching,motivate_student,well_behavior,writing_on_board{
    private String designation;
    private String dept;

    public teacher(String designation, String dept, String name, String age) {
        super(name, age);
        this.designation = designation;
        this.dept = dept;
      
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public void teachHerStudent(){
        System.out.println("Teacher always teaches her students in a amiable way");
    }
    public void write(){
        System.out.println("Teacher teaches her students by writting several educative things that attract her students to learn something attentively");
    }
     public void FriendlyBehavior(){
         System.out.println("Teacher always behave her students friendly");
     }
     @Override
    public void motivatingStudent() {
    System.out.println("Teacher always motivate students");
    }
    public void displayteacherinfo(){
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("designation: "+this.designation);
        System.out.println("depertment: "+this.dept);
     
    }

   
}

    