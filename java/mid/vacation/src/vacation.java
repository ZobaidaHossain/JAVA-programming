       import java.util.ArrayList;

public class Vacation {
    private String name;
    private int day;
    private int numOfVacation;
    private String month;
    private ArrayList<Vacation> VacationList = new ArrayList();

    public Vacation() {

    }

    public Vacation(String name, int day, int numOfVacation, String month) {
        this.name = name;
        this.day = day;
        this.numOfVacation = numOfVacation;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNumOfVacation() {
        return numOfVacation;
    }

    public void setNumOfVacation(int numOfVacation) {
        this.numOfVacation = numOfVacation;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    Vacation(Vacation VC) {
        name = VC.name;
        day = VC.day;
        numOfVacation = VC.numOfVacation;
        month = VC.month;
    }

    public void sameName() {

    }

    public void averageVacation() {

    }

    @Override
    public String toString() {
        return "Vacation{" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", numOfVacation=" + numOfVacation +
                ", month='" + month + '\'' +
                ", VacationList=" + VacationList +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

public  void addVacation(Vacation V) {
        this.VacationList.add(V);
    }
    public static void main(String[] args) {

        Vacation V1 = new Vacation("Birthday", 9, 1, "January");
        V1.display();
    }

}
