
package vehicle;
   public class SecondHandVehicle extends Vehicle {
    private int numberOfOwners;

    public SecondHandVehicle() {
    }

    public SecondHandVehicle(int numberOfOwners) {
        this.numberOfOwners = numberOfOwners;
    }

    public SecondHandVehicle(String regNo, int yearOfManufacture, int todaysDate, double value, int numberOfOwners) {
        super(regNo, yearOfManufacture, todaysDate, value);
        this.numberOfOwners = numberOfOwners;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }

    public void setNumberOfOwners(int numberOfOwners) {
        this.numberOfOwners = numberOfOwners;
    }
    public void sellVehicle(){
       numberOfOwners++;
    }

}
