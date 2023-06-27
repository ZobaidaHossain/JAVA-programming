 public class Person {
    protected String Name;
    protected int Age;

    public Person() {
    }

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public void display(){
        System.out.printf(this.toString());
    }
}
