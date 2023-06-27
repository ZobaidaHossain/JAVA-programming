
package assignment1;
 import java.util.Scanner;
public class name {
    public static void main(String[]arg){
        int i,score=0,highest=0,n;
       double d;
        String name=null;
        String h = null;
        Scanner input=new Scanner(System.in);
            System.out.println("enter the number of student: ");
            n=input.nextInt();
            for(i=0;i<n;i++){
            System.out.println("Student name: ");
            name=input.next();
            System.out.print("score: ");
            score=input.nextInt();
             d= input.nextDouble();       
                    ;}
            if(highest>score){
                        score=highest;
                        name=h;
                for(i=0;i<n;i++){
                    
                    System.out.println("decending order name: "+h +"score:"+highest);
                }
                
            }
        }
        
    }
  


