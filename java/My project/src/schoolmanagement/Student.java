
package schoolmanagement;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int totalfees;
    private int paidfees;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.paidfees=0;
        this.totalfees=0;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(int totalfees) {
        this.totalfees = totalfees;
    }

    public int getPaidfees() {
        return paidfees;
    }

    public void setPaidfees(int paidfees) {
        this.paidfees = paidfees;
    }
    
    public int getFeeBalance(){
        return totalfees-paidfees;
    }
    public void payFees(int fee){
        paidfees+=fee;
    }
}
