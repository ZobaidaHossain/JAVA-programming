  public abstract class Applicant {
    protected String ApplicantName, ApplicantEmail;

    public Applicant() {
    }

    public Applicant(String applicantName, String applicantEmail) {
        this.ApplicantName = applicantName;
        this.ApplicantEmail = applicantEmail;
    }

    public void setApplicantName(String applicantName) {
        this.ApplicantName = applicantName;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.ApplicantEmail = applicantEmail;
    }
}