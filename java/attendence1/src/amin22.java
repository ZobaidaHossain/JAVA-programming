
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
public class amin22 {
    public static void main(String args[]){
        int l,j;
        for(l=0;l<2;l++){
         String student_name=JOptionPane.showInputDialog("enter the student's name:");
          String student_id=JOptionPane.showInputDialog("enter the student's id: ");
           String attendence=JOptionPane.showInputDialog("enter the student's attendence:\n present for-p \n absent for a");
           
           attendence a1=new attendence(student_name,student_id,attendence);
          
       a1.displayuser();
        
           
        }
        
         
    }
}
