 public class Teacher extends Person implements Teaching,Drawing {
    protected String Designation, Proficiency;

    public Teacher() {
    }

    public Teacher(String designation, String proficiency) {
        Designation = designation;
        Proficiency = proficiency;
    }

    public Teacher(String name, int age, String designation, String proficiency) {
        super(name, age);
        Designation = designation;
        Proficiency = proficiency;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        this.Designation = designation;
    }

    public String getProficiency() {
        return Proficiency;
    }

    public void setProficiency(String proficiency) {
        this.Proficiency = proficiency;
    }

    public void TeachingQuality(){
        System.out.println("\n\t\tTeacher Is Excellent in Teaching With Great Affection to Her Students.");
    }

    public void DrawingOnBoard(){
        System.out.println("\t\tTeacher is Drawing Several Shapes Such As : Circle, Triangle.");
    }

    public void display(){
        System.out.println("\nTeacher's Name        : "+this.Name);
        System.out.println("Teacher's Age         : "+this.Age);
        System.out.println("Teacher's Designation : "+this.Designation);
        System.out.println("Teacher's Proficiency : "+this.Proficiency);
    }
}

