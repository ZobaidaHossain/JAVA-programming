   public class Teacher extends Person{
    private String name, id, Department, P_Num;
    private int age;
    public Teacher() {
    }

    public Teacher(String name,  int age, String department, String p_Num, String id) {
        this.name = name;
        this.id = id;
        Department = department;
        P_Num = p_Num;
        this.age = age;
    }

    public Teacher(String name, int age, String name1, String id, String department, String p_Num, int age1) {
        super(name, age);
        this.name = name1;
        this.id = id;
        Department = department;
        P_Num = p_Num;
        this.age = age1;
    }

    @Override
    public void displayPerson() {
        super.displayPerson();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Department='" + Department + '\'' +
                ", P_Num='" + P_Num + '\'' +
                ", age=" + age +
                '}';
    }

    public void displayTeacher()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("ID no: "+this.id);
        System.out.println("Department: "+this.Department);
        System.out.println("Phone Number: "+this.P_Num);
    }
}