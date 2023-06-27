/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
       
        SecondHandVehicle S1 = new SecondHandVehicle("100", 2000, 2020, 133333.50, 3);
        System.out.println("Vehicle: ");
        System.out.println("Registration NO : " + S1.getRegNo());
        System.out.println("Year Of Manufacture : " + S1.getYearOfManufacture());
        System.out.println("Year : " + S1.getCurrentYear());
        System.out.println("Value: " + S1.getValue());
        System.out.println("Number Of Owners : " + S1.getNumberOfOwners());
        System.out.println("Age: " + S1.CalculateAge() + " Years");
        S1.sellVehicle();
        System.out.println("Vehicle 02 After Selling : ");
        System.out.println("Registration NO : " + S1.getRegNo());
        System.out.println("Year Of Manufacture : " + S1.getYearOfManufacture());
        System.out.println("Year : " + S1.getCurrentYear());
        System.out.println("Value  : " + S1.getValue());
        System.out.println("Number Of Owners: " + S1.getNumberOfOwners());
        System.out.println("Age: " + S1.CalculateAge() + " Years");

    }
}
