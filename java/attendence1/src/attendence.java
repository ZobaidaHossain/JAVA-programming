
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class attendence {
     protected String student_name;
     protected String student_id;
    protected String attendence;

    public attendence(String student_name, String student_id, String attendence) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.attendence = attendence;
    }
   
  

   public attendence(){}

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getAttendence() {
        return attendence;
    }

    public void setAttendence(String attendence) {
        this.attendence = attendence;
    }

    @Override
    public String toString() {
        return "attendence{" + "student_name=" + student_name + ", student_id=" + student_id + ", attendence=" + attendence + '}';
    }
  


   

  
    public void displayuser(){
        System.out.println("Student name:"+this.student_name);
        System.out.println("id:"+this.student_id);
        System.out.println("attendence:"+this.attendence);
        
        JOptionPane.showMessageDialog(null,this.toString());
    }
}
