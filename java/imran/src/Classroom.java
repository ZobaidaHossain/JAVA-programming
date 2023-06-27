
import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private int ClassStandard, MaxNoOfStudent = 10;
   public boolean studentBench[] = new boolean[10];
    private String colorOfWalls;
    private boolean mobilityOfStudent, VisibilityToTeacher, tools, posters;
    String PosterType[] = {"Circle", "Triangle", "Cylinder", "Cube", "Pyramid"};
    public ArrayList<Student> StudentList = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(int classStandard, boolean mobilityOfStudent, boolean visibilityToTeacher, boolean tools, boolean posters) {
        ClassStandard = classStandard;
        this.mobilityOfStudent = mobilityOfStudent;
        VisibilityToTeacher = visibilityToTeacher;
        this.tools = tools;
        this.posters = posters;
    }

    public int getClassStandard() {
        return ClassStandard;
    }

    public void setClassStandard(int classStandard) {
        ClassStandard = classStandard;
    }

    public boolean isMobilityOfStudent() {
        return mobilityOfStudent;
    }

    public void setMobilityOfStudent(boolean mobilityOfStudent) {
        this.mobilityOfStudent = mobilityOfStudent;
    }

    public boolean isVisibilityToTeacher() {
        return VisibilityToTeacher;
    }

    public void setVisibilityToTeacher(boolean visibilityToTeacher) {
        VisibilityToTeacher = visibilityToTeacher;
    }

    public boolean isTools() {
        return tools;
    }

    public void setTools(boolean tools) {
        this.tools = tools;
    }

    public boolean isPosters() {
        return posters;
    }

    public void setPosters(boolean posters) {
        this.posters = posters;
    }

    public String getColorOfWalls() {
        return colorOfWalls;
    }

    public void setColorOfWalls(String colorOfWalls) {
        this.colorOfWalls = colorOfWalls;
    }

    @Override
    public String toString() {
        return ClassStandard +
                "\n\nClassRoom Details: \nMax No Of Student = " + MaxNoOfStudent +
                ",\nmobility Of Student = " + mobilityOfStudent +
                ",\nVisibility To Teacher = " + VisibilityToTeacher +
                ",\nAvailability of Required tools = " + tools +
                ",\nAvailability of posters = " + posters+"\n";
    }

    public void displayClassroomDetails()
    {
        System.out.println(this.toString());

        for(int i = 0; i< PosterType.length; i++)
        {
            System.out.println(i+". "+PosterType[i]);
        }
    }

    public void addStudent(Student st)
    {
        if(StudentList.size()<MaxNoOfStudent)
        {
            StudentList.add(st);
            studentBench[StudentList.size()-1] = true;
        }

        else
            System.out.println("Sorry! The class is full of its capacity");
    }

    public void RemoveStudent(Student st)
    {
        if(StudentList.size() != 0)
        {
            StudentList.remove(st);
            studentBench[StudentList.size()] = false;
        }
    }

    public void displayBenchStatus()
    {
        for(int i = 0; i<10; i++)
        {
            System.out.println("Bench "+(1+i)+" = "+studentBench[i]);
        }
    }

    public void displayStudentList()
    {
        for(Student st: StudentList)
        {
            st.displayStudent();
        }
    }
}

    