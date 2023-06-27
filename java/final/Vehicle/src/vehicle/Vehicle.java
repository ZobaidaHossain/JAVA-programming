
package vehicle;


  public abstract class Vehicle {
    private String regno;
    private int Currentyear;
    private int yearOfManufacture;
    
    private double value;

    public Vehicle() {
    }

    public Vehicle(String regno, int yearOfManufacture, int todaysDate, double value) {
        this.regno = regno;
        this.yearOfManufacture = yearOfManufacture;
        this.Currentyear = todaysDate;
        this.value = value;
    }

    public String getRegNo() {
        return regno;
    }

    public void setRegNo(String regNo) {
        this.regno = regNo;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getCurrentYear() {
        return Currentyear;
    }

    public void setCurrentYear(int currentYear) {
        this.Currentyear = currentYear;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public int CalculateAge(){
        return (Currentyear -yearOfManufacture);
    }
  }