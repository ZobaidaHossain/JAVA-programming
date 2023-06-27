
import java.util.Scanner;


public class university {
   private String country;
   
   private String University_name;
   private String subject_name;

    public university(String country, String University_name, String subject_name) {
        this.country = country;
        this.University_name = University_name;
        this.subject_name = subject_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String University_name) {
        this.University_name = University_name;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
   public void displayabroad(){
       
       System.out.println("country: "+country);
       System.out.println("university name: "+University_name);
       System.out.println("subject name: "+subject_name);
   }
}

