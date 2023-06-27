public class ApplicantInformations extends Applicant {
    protected String Age, MarriageStatus, Nationality, Religion, EconomicStatus;

    public ApplicantInformations() {
    }

    public ApplicantInformations(String age, String marriageStatus, String nationality, String religion, String economicStatus) {
        this.Age = age;
        this.MarriageStatus = marriageStatus;
        this.Nationality = nationality;
        this.Religion = religion;
        this.EconomicStatus = economicStatus;
    }

    public ApplicantInformations(String applicantName, String applicantEmail, String age, String marriageStatus, String nationality, String religion, String economicStatus) {
        super(applicantName, applicantEmail);
        this.Age = age;
        this.MarriageStatus = marriageStatus;
        this.Nationality = nationality;
        this.Religion = religion;
        this.EconomicStatus = economicStatus;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.MarriageStatus = marriageStatus;
    }

    public void setNationality(String nationality) {
        this.Nationality = nationality;
    }

    public void setReligion(String religion) {
        this.Religion = religion;
    }

    public void setEconomicStatus(String economicStatus) {
        this.EconomicStatus = economicStatus;
    }

    public void display(){
        System.out.println("\n\tShowing Applicant Informations : ");
        System.out.println("Applicant Name : "+this.ApplicantName);
        System.out.println("Email : "+this.ApplicantEmail);
        System.out.println("Age : "+this.Age);
        System.out.println("Marriage Status : "+this.MarriageStatus);
        System.out.println("Nationality : "+this.Nationality);
        System.out.println("Religion : "+this.Religion);
        System.out.println("Economic Status : "+this.EconomicStatus);
    }
}

    