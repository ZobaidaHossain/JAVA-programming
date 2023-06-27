
import java.util.ArrayList;
import java.util.Scanner;


public class Applicant implements application,requirements_and_deadlines,motivation_letter,recommendation_letter,IELTS_or_TOEFL_test,Translate_and_authenticate_your_documents,online_application_platforms,Register_for_the_entrance_exam,confident_for_the_interview,Schedule_your_visa_appointment ,Plan_for_the_costs{
private String name;
private String age;
private String Address;
private String homeland;
private String Marital_status;
private String previous_college_name;

  private ArrayList<university> universityList=new ArrayList();

    public Applicant(String name, String age, String Address, String homeland, String Marital_status, String previous_college_name) {
      
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.homeland = homeland;
        this.Marital_status = Marital_status;
        this.previous_college_name = previous_college_name;
    
    }


    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    public String getMarital_status() {
        return Marital_status;
    }

    public void setMarital_status(String Marital_status) {
        this.Marital_status = Marital_status;
    }

    public String getPrevious_college_name() {
        return previous_college_name;
    }

    public void setPrevious_college_name(String previous_college_name) {
        this.previous_college_name = previous_college_name;
    }


    
  @Override
    public void choose_your_program() {
        System.out.println("Application");
         Scanner scan=new Scanner(System.in);
         System.out.println("choose a country to study abroad");
         System.out.println("Type-1 for America");
         System.out.println("Type-2 for Australia");
         System.out.println("Type-3 for London");
         int country=scan.nextInt();
         switch(country){
              case 1:
                 System.out.println("Ammerican Top university");
                 System.out.println("Type-1 for Harverd");
                 System.out.println("Type-2 for Stanford University");
                 System.out.println("Type-3 for Columbia University");
                 int university=scan.nextInt();
                 switch(university){
                    case 1:
                 System.out.println("Harverd University");
                 System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          int program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 break;
                     case 2:
                 System.out.println("Stanford University");
                   System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 
                 break;
                     case 3:
                 System.out.println("Columbia University");
                   System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 }
                
                 break;
                     case 2:
                 System.out.println("Australia Top university");
                  System.out.println("Type-1 for Australian National University");
                 System.out.println("Type-2 for University of Sydney");
                 System.out.println("Type-3 for  University of Melbourne");
                  university=scan.nextInt();
                 switch(university){
                    case 1:
                 System.out.println("Australian National University");
                 System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          int program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 break;
                     case 2:
                 System.out.println("University of Sydney");
                   System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 
                 break;
                     case 3:
                 System.out.println("University of Melbourne");
                   System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 }
                 break;
                     case 3:
                 System.out.println("London Top university");
                  System.out.println("Type-1 for University college london");
                 System.out.println("Type-2 for Imperial college london");
                 System.out.println("Type-3 for King's college london");
               university=scan.nextInt();
                 switch(university){
                    case 1:
                 System.out.println("University college london");
                 System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          int program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 break;
                     case 2:
                 System.out.println("Imperial college london");
                   System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 
                 break;
                     case 3:
                 System.out.println("King's college london");
                   System.out.println("choose your program");
          System.out.println("Type -1 for CSE for science student");
         System.out.println("Type -2 for BBA for comerce student");
         System.out.println("Type -3 for MBA for comerce student");
         System.out.println("Type -4 for MSC for science student");
          program=scan.nextInt();
         switch(program){
             case 1:
                 System.out.println("CSE Depertment");
                 break;
                     case 2:
                 System.out.println("BBA Depertment");
                 break;
                     case 3:
                 System.out.println("MBA Depertment");
                 break;
                     case 4:
                 System.out.println("MSC Depertment");
                
         }
                 }
                
         
         
        
         }
    
    }



    @Override
    public void requirements_and_deadlines() {
      System.out.println("Fill up all requirments and submit it in the deadlines");
      
    }

    @Override
    public void motivation_letter() {
          System.out.println("Write a motivation letter");
    }

    @Override
    public void recommendation_letter() {
       System.out.println("Write a recommendation letter from your previous university teacher");
               }

    @Override
    public void IELTS_or_TOEFL_test() {
     System.out.println("Write a your IELTS or TOEFEL test");
    }

    @Override
    public void Translate_and_authenticate_your_documents() {
        System.out.println("submit your translate and authenticate your documents");
    }

    @Override
    public void online_application_platforms() {
     System.out.println("fillup the online application plateform");
    }

    @Override
    public void Register_for_the_entrance_exam() {
        System.out.println("Register_for_the_entrance_exam");
    }

    @Override
    public void confident_for_the_interview() {
      System.out.println("confident for the interview");
    }

    @Override
    public void Schedule_your_visa_appointment() {
         System.out.println("schedule your visa application");
    }

    @Override
    public void Plan_for_the_costs() {
        System.out.println("fill up all cost");
    }
 
   public void display(){
   System.out.println("name:"+name);
   System.out.println("age:"+age);
   System.out.println("Address:"+Address);
   System.out.println("homeland:"+homeland);
   System.out.println("Marital_status:"+Marital_status);
   System.out.println("previous_college_name:"+previous_college_name);
}
public static void main(String[]args){
   Applicant s1=new Applicant("Zobaida","20","Mirpur,Dhaka","Bangladesh","Single","Cambrian College");
 university u1=new university("America,Australia,London","harverd University,stamform university,colombia university,Australian National University,University of Sydney,University of Melbourn,University college london,Imperial college,londonKing's college","CSE,BBA,MBA,MSC");

 System.out.println("*****University information******");
  u1.displayabroad();
   System.out.println("*****Applicant Information******");
   s1.display();
   System.out.println("*****Applicant proccess******");
   s1.choose_your_program();
   System.out.println("*****follow the instraction******");
   s1.requirements_and_deadlines();
   s1.motivation_letter();
   s1.recommendation_letter();
   s1.IELTS_or_TOEFL_test();
   s1.Translate_and_authenticate_your_documents();
   s1.online_application_platforms();
   s1.Register_for_the_entrance_exam();
   s1.confident_for_the_interview();
   s1.Schedule_your_visa_appointment();
   s1.Plan_for_the_costs();
     System.out.println("*****Successfully submitted******");  
}
}
