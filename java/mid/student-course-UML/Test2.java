package ClassRelation_Association;

import javax.swing.JOptionPane;


public class Test {
    public static void main(String args[])
    {
        Student s1=new Student("Abdul Hamid", "456-789", 20);
        
        Course c1=new Course("Math", "MAT111", 3.0);
        Course c2=new Course("Phy", "Phy111", 3.0);
        Course c3=new Course("OOP", "CSE221", 3.0);
        Course c4=new Course("OOP Lab", "CSE222", 1.0);
        Course c5=new Course("Statistics", "Sta111", 3.0);
        
        if(s1.addCourse(c1))
            System.out.println("Course Added");
        else
            System.out.println("Course Not Added");
        
        if(s1.addCourse(c2))
            System.out.println("Course Added");
        else
            System.out.println("Course Not Added");
        
        if(s1.addCourse(c3))
            System.out.println("Course Added");
        else
            System.out.println("Course Not Added");
       
        if(s1.addCourse(c4))
            System.out.println("Course Added");
        else
            System.out.println("Course Not Added");
        
        if(s1.addCourse(c5))
            System.out.println("Course Added");
        else
            System.out.println("Course Not Added");
        
       JOptionPane.showMessageDialog(null, s1.toString());
       
       System.out.println("Initial Enrolled Course");
       s1.displayEnrolledCourse();
        
       s1.removeCourse(c4);
       System.out.println("Enrolled Courses After Remove");
       s1.displayEnrolledCourse();
        
         if(s1.addCourse(c5))
            System.out.println("Course Added");
        else
            System.out.println("Course Not Added");
         System.out.println("Enrolled Courses After new Addition:");
         s1.displayEnrolledCourse();
        
    }
}
