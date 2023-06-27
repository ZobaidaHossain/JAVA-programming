
import java.util.ArrayList;


public class classroom {
    private String classroomName;
    private String classroomNumber;
    private String brightPoster;
    private String colorFullWall;
    private String arragementoffurniture;
    private String DecorationWall;
    
    private ArrayList<student> studentList=new ArrayList();
    private ArrayList<teacher> teacherList=new ArrayList();

    public classroom(String classroomName, String classroomNumber, String brightPoster,
    String colorFullWall, String arragementoffurniture, String DecorationWall) {
        this.classroomName = classroomName;
        this.classroomNumber = classroomNumber;
        this.brightPoster = brightPoster;
        this.colorFullWall = colorFullWall;
        this.arragementoffurniture = arragementoffurniture;
        this.DecorationWall = DecorationWall;
    }

   
  
    public void addstudent(student s){
        studentList.add(s);
    }
    public void removestudent(student s){
        studentList.remove(s);
    }
    public void displayStudentList(){
        for(student s:studentList){
            s.displaystudentinfo();
        }
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public String getBrightPoster() {
        return brightPoster;
    }

    public void setBrightPoster(String brightPoster) {
        this.brightPoster = brightPoster;
    }

    public String getColorFullWall() {
        return colorFullWall;
    }

    public void setColorFullWall(String colorFullWall) {
        this.colorFullWall = colorFullWall;
    }

    public String getArragementoffurniture() {
        return arragementoffurniture;
    }

    public void setArragementoffurniture(String arragementoffurniture) {
        this.arragementoffurniture = arragementoffurniture;
    }

    public String getDecorationWall() {
        return DecorationWall;
    }

    public void setDecorationWall(String DecorationWall) {
        this.DecorationWall = DecorationWall;
    }

  public void Thermal_comfort(){
      System.out.println("Thermal_comfort :The temperature in the classroom is  18ºC (64.4ºF) which gives thermal comfort to students and teachers");
  }
    public void Visual_comfort(){
      System.out.println("Visual_comfort :Student can see board, projection screen, teachers which gives visual comfort");
  }
    public void Acoustic_comfort(){
      System.out.println("Acoustic_comfort :Classroom environment is silent which gives visual comfort to students and teachers");
  }
  
    public void Cooperative_Learning_Arrangement(){
       System.out.println("Cooperative_Learning_Arrangement: Classroom has enough place where students can do group work comfortablely");
  }
    public void clean_classroom(){
      System.out.println("clean_classroom: Classroom is always clean");
  }
    public void organized_space(){
      System.out.println("organized_space: classroom arranges areas, seats, and decorations based on the most effective for the students."
              + "\n Set aside clear, easily-identifiable areas for specific purposes, and create a system so that student never lose your papers ,pen etc. ");
  }
    public void Ensuring_the_utmost_comfort_of_the_young_learners(){
      System.out.println("ensured the utmost comfort for every students");
  }
    public void Offering_all_the_needful_right_at_hand_for_them(){
      System.out.println("classroom always offers needfull rights for all students");
  }
    public void Minimizing_the_distractions_to_their_studies(){
      System.out.println("minimized the distractions that can take their mind away from learning.");
  }
    public void Increasing_engagement_and_participation_among_students(){
      System.out.println("Always encurage students for participate more extra curriculam activities");
  }
    
   
    
    public void displayall(){
      System.out.println("classroomname               :"+classroomName);
      System.out.println("classroomcode               :"+classroomNumber);
      System.out.println("BrightPoster                :"+brightPoster);
      System.out.println("colorfull wall              :"+colorFullWall);
      System.out.println("Arrangement of furniture    :"+arragementoffurniture);
      System.out.println("Decorate the wall           :"+DecorationWall);
    }
     
    public static void main(String args[]){
        classroom c1=new classroom("class-1-room","101","trigonometrical drawing,colours picture,Mathematics equation picture","Blue","space and sequentially","Displaying natural environment picture on walls");
        System.out.println("*****classroomname Details******");
        c1.displayall();
        System.out.println("\n");
        System.out.println("*****classroomname Environment******");
        System.out.println("\n");
        c1.Visual_comfort();
        System.out.println("\n");
        c1.Thermal_comfort();
        System.out.println("\n");
        c1.Acoustic_comfort();
        System.out.println("\n");
        c1.Cooperative_Learning_Arrangement();
        System.out.println("\n");
        c1.clean_classroom();
        System.out.println("\n");
        c1.organized_space();
        System.out.println("\n");
        c1.Ensuring_the_utmost_comfort_of_the_young_learners();
        System.out.println("\n");
        c1.Increasing_engagement_and_participation_among_students();
        System.out.println("\n");
        c1.Minimizing_the_distractions_to_their_studies();
        System.out.println("\n");
        c1.Offering_all_the_needful_right_at_hand_for_them();
        System.out.println("\n");
          teacher t1=new teacher("lecturer","CSE","zakia","26");
          System.out.println("****Teacher Information***");
          System.out.println("\n");
          t1.displayteacherinfo();
          System.out.println("\n");
           System.out.println("****Teacher Activitity***");
           System.out.println("\n");
           t1.teachHerStudent();
           System.out.println("\n");
           t1.write();
           System.out.println("\n");
           t1.FriendlyBehavior();
           System.out.println("\n");
            t1.motivatingStudent();
        System.out.println("\n");
        student s1=new student("201-15-13671","4.00","zobaida","20");
        System.out.println("****Student Information***");
        s1.displaystudentinfo();
        System.out.println("\n");
         System.out.println("****Student Activities***");
         System.out.println("\n");
       s1.CompleteTheLesson();
       System.out.println("\n");
        s1.payAttentionInClass();
        System.out.println("\n");
        c1.addstudent(s1);
        student s2=new student("201-15-13666","3.94","opshory","20");
        System.out.println("****Student Information***");
        s2.displaystudentinfo();
        System.out.println("\n");
         System.out.println("****Student Activities***");
         System.out.println("\n");
       s2.CompleteTheLesson();
       System.out.println("\n");
        s2.payAttentionInClass();
        System.out.println("\n");
        c1.addstudent(s2);
        student s3=new student("201-15-13555","3.88","sami","20");
        System.out.println("****Student Information***");
        s3.displaystudentinfo();
        System.out.println("\n");
         System.out.println("****Student Activities***");
        System.out.println("\n");
       s3.CompleteTheLesson();
       System.out.println("\n");
        s3.payAttentionInClass();
        System.out.println("\n");
        c1.addstudent(s3);
        System.out.println("****display student list***");
        c1.displayStudentList();
       
    }
    
}
