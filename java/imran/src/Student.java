public class Student extends Person{
    private String id;
    private Classroom Standard;
    private Teacher t;

    public Student() {
    }

    public Student(String id, Classroom standard, Teacher t) {
        this.id = id;
        Standard = standard;
        this.t = t;
    }

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public Classroom getStandard() {
        return Standard;
    }

    public void setStandard(Classroom standard) {
        Standard = standard;
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    public void displayStudent()
    {
        displayPerson();
        System.out.println("ID No: "+this.id);
        System.out.println("Assigned teacher: "+this.t);
        System.out.println("Standard: " +this.Standard);

    }
}