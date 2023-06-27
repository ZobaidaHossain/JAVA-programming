 public class ApplicationProcess implements Program, Requirements, MotivationLetter, RecommendationLetter, IELTSorTOEFL, DocumentAuthentication, ApplicationPlatform, EntranceExam, Interview, VisaAppointment, Costs {

    protected String ApplicationNo;
    public Applicant Applying;

    public ApplicationProcess() {
    }

    public ApplicationProcess(String applicationNo, Applicant applying) {
        this.ApplicationNo = applicationNo;
        this.Applying = applying;
    }

    public void setApplicationNo(String applicationNo) {
        this.ApplicationNo = applicationNo;
    }

    public void setApplying(Applicant applying) {
        this.Applying = applying;
    }

    public Applicant getApplying() {
        return Applying;
    }

    @Override
    public boolean ChooseYourProgram() {
        return true;
    }

    @Override
    public boolean ReadingRequirementsAndDeadlines() {
        return true;
    }

    @Override
    public boolean WritingMotivationLetter() {
        return true;
    }

    @Override
    public boolean AskingForARecommendationLetter() {
        return true;
    }

    @Override
    public boolean BeingConfidentForInterview() {
        return true;
    }

    @Override
    public boolean GettingPreparedForIELTSorTOEFL() {
        return true;
    }

    @Override
    public boolean PlanningForCosts() {
        return true;
    }

    @Override
    public boolean RegisteringForEntranceExam() {
        return true;
    }

    @Override
    public boolean SchedulingVisaAppointment() {
        return true;
    }

    @Override
    public boolean UsingOnlineApplicationPlatform() {
        return true;
    }

    @Override
    public boolean TranslatingAndAuthenticatingDocuments() {
        return true;
    }


    public void Display() {
        System.out.println("\n\tShowing Application Details : ");
        System.out.println("Application NO : " + this.ApplicationNo);
        System.out.println("Applicant      : " + this.Applying);
    }

    public static void main(String[] args) {
        ApplicantInformations Fahim = new ApplicantInformations();
        Fahim.setApplicantName("Fahim Ur Rahman");
        Fahim.setApplicantEmail("Frahman@gmail.com");
        Fahim.setAge("20");
        Fahim.setMarriageStatus("Single");
        Fahim.setNationality("Bangladeshi");
        Fahim.setReligion("Islam");
        Fahim.setEconomicStatus("Decent");


        ApplicationProcess A1 = new ApplicationProcess();
        A1.setApplicationNo("001");
        A1.setApplying(Fahim);
        A1.Display();
        Fahim.display();

        A1.ChooseYourProgram();
        A1.ReadingRequirementsAndDeadlines();
        A1.WritingMotivationLetter();
        A1.AskingForARecommendationLetter();
        A1.GettingPreparedForIELTSorTOEFL();
        A1.TranslatingAndAuthenticatingDocuments();
        A1.UsingOnlineApplicationPlatform();
        A1.RegisteringForEntranceExam();
        A1.BeingConfidentForInterview();
        A1.SchedulingVisaAppointment();
        A1.PlanningForCosts();


        if (Fahim.equals(A1.getApplying()) ) {
            if (A1.ChooseYourProgram() == true && A1.AskingForARecommendationLetter() == true && A1.BeingConfidentForInterview() == true && A1.PlanningForCosts() == true && A1.GettingPreparedForIELTSorTOEFL() == true && A1.ReadingRequirementsAndDeadlines() == true && A1.RegisteringForEntranceExam() == true && A1.SchedulingVisaAppointment() == true && A1.TranslatingAndAuthenticatingDocuments() == true && A1.WritingMotivationLetter() == true && A1.UsingOnlineApplicationPlatform() == true) {
                System.out.println("\n\t!!! Application Successfully Submitted ! Wait For Further Notifications !!!");
            }
            else{
                System.out.println("\n\t***An Error Occurred ! Please Make Sure You Have Submitted Every Necessary Information !***");
            }
        }

    }
}
