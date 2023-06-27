
public class Abroad_University {
    private String country;
    private String university_name;
    private String subject;

    public Abroad_University() {
    }

    public Abroad_University(String country, String university_name, String subject) {
        this.country = country;
        this.university_name = university_name;
        this.subject = subject;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void diplayabroad(){
         
        System.out.println("country name:"+country);
        System.out.println("university name:"+university_name);
        System.out.println("subject:"+subject);
    }
}
