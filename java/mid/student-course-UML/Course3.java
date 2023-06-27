package ClassRelation_Association;


public class Course {
    private String courseId, courseName;
    private double credit;
    
    public Course(){}

    public Course(String courseId, String courseName, double credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", credit=" + credit + '}';
    }
    
    public void displayCourseInformation()
    {
      
        System.out.println("Course Name: "+this.courseName);
        System.out.println("Course ID: "+this.courseId);
        System.out.println("Credit Hours: "+this.credit);
    }
}
