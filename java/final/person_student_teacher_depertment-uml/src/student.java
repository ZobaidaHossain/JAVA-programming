
public class student extends person {
    private String id;
    private String cgpa;
    private int feesPaid;
    private int feesTotal;

    public student(String id, String cgpa, String name, String age) {
       super(name, age);
        this.id = id;
        this.cgpa = cgpa;
        this.feesPaid=0;
        this.feesTotal=30000;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
     public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
     
    public void displaystudentinfo(){
     System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("id: "+this.id);
        System.out.println("cgpa: "+this.cgpa);
         System.out.println("feespaid: "+this.feesPaid);
        System.out.println("feesTotal: "+this.feesTotal);
        
    }
}
