
public abstract class vehicle {
    private String regno;
    private int make;
    private int year;
    private double value;

    public vehicle() {
    }

    public vehicle(String regno, int make, int year, double value) {
        this.regno = regno;
        this.make = make;
        this.year = year;
        this.value = value;
    }

    public String getRegno() {
        return regno;
    }

    public int getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public int calculateage(){
        return (make-year);
    }
    
}
