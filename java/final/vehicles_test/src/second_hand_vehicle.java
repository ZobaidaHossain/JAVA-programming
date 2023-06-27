
public class second_hand_vehicle extends vehicle {
   
    private int numberofowners;

    public second_hand_vehicle(int numberofowners, String regno, int make, int year, double value) {
        super(regno, make, year, value);
        this.numberofowners = numberofowners;
    }

   

    public int getNumberofowners() {
        return numberofowners;
    }
    public double sellvehicle(){
       return numberofowners++;
       
    }
    
   
    
}
