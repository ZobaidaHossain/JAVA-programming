/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
    
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
       
        for(student d:this.stdList)
            d.displaystudentinfo();
         
        for(teacher d:this.teaList)
            d.displayteacherinfo();
    }
    
    public static void main(String args[]){
        person s1=new student("201-15-13671","3.84","zobaida","20");
        person t1=new teacher("lecturer","CSE","zakia","30");
        depertment d1=new depertment("Computer","CSE111");
        
        System.out.println("student:");
        s1.displaypersoninfo();
        System.out.println(s1.toString());
        
        System.out.println("teacher:");
        t1.displaypersoninfo();
        System.out.println(t1.toString());
        
        d1.displayall();
    }
    
}

