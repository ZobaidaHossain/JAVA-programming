
public class Test_1 {
    public static void main(String[]args){
       second_hand_vehicle v1=new second_hand_vehicle(1,"reg-200",2020,2000,1333);
       System.out.println("vehicle: ");
       System.out.println("regno: "+v1.getRegno());
       System.out.println("year of manufacture: "+v1.getYear());
       System.out.println("year: "+v1.getMake());
       System.out.println("value: "+v1.getValue());
       System.out.println("numbers of owners: "+v1.getNumberofowners());
       System.out.println("age: "+v1.calculateage());
       v1.sellvehicle();
        System.out.println("vehicle 2 after selling: ");
       System.out.println("regno: "+v1.getRegno());
       System.out.println("year of manufacture: "+v1.getYear());
       System.out.println("year: "+v1.getMake());
       System.out.println("value: "+v1.getValue());
       System.out.println("numbers of owners: "+v1.getNumberofowners());
       System.out.println("age: "+v1.calculateage());
       
       
       
       
    }
}
