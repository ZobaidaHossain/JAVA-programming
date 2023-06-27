
import java.util.ArrayList;


public class depertment {
    private String deptname;
    private String deptcode;
    private ArrayList<student> stdList=new ArrayList();
    private ArrayList<teacher> teaList=new ArrayList();
    public depertment(String deptname, String deptcode) {
        this.deptname = deptname;
        this.deptcode = deptcode;
    }
    public void addstudent(student s){
        this.stdList.add(s);
    }
    public void addteacher(teacher t){
        this.teaList.add(t);
    }

    @Override
    public String toString() {
        return "depertment{" + "deptname=" + deptname + ", deptcode=" + deptcode + ", stdList=" + stdList + ", teaList=" + teaList + '}';
    }
    
    public void displayall(){
        System.out.println(this.toString());
        System.out.println("student information ");
        for(student s:this.stdList)
            s.displaystudentinfo();
         System.out.println("teacher information ");
        for(teacher t:this.teaList)
            t.displayteacherinfo();
    }
    
    public static void main(String args[]){
        student s1=new student("201-15-13671","3.84","zobaida","20");
        teacher t1=new teacher("lecturer","CSE","zakia","30");
        depertment d1=new depertment("Computer","CSE111");
        
        d1.addstudent(s1);
       
        d1.addteacher(t1);
        d1.displayall();
    }
    
}
