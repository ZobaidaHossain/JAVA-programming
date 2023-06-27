package ClassRelation_Association;

import java.util.ArrayList;


public class Student {
    private String name, id;
    private int age;
    private ArrayList<Course> courseList=new ArrayList();
    
    public Student(){}

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", age=" + age +  '}';
    }
    
    public void displayStudentInformation()
    {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Age: "+this.age);
    }
    public boolean addCourse(Course c)
    {
        if(courseList.size()<4)
        {
            courseList.add(c);
            return true;
        }
        else 
            return false;
    
    }
    public boolean removeCourse(Course c)
    {
            if(courseList.remove(c))
                return true;
            else
                return false;
    }
    public void displayEnrolledCourse()
    {
        
        for(Course c:courseList)
            c.displayCourseInformation();
    }
}
