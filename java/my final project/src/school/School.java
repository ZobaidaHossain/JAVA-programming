
package school;
import java.util.ArrayList;
import teachers.Teacher;
import students.Student;
import java.util.List;


public class School {
    
    private List<Teacher>teachers;
    private List<Student>students;
    private int totalMoneyEarned;
    private int totalMoneySpent;
    private String name;

    public School(String name) {
       
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
         this.name=name;
    }
   public School(List<Teacher> teachers, List<Student> students,String name) {
       
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned =0;
        this.totalMoneySpent = 0;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
   public int getProfitMade(){
       return getTotalMoneyEarned()-getTotalMoneySpent();
   }
}
