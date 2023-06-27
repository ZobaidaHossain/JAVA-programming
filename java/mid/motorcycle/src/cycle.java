
public class cycle {
  protected String model;
protected String company;
public cycle(){}
    public cycle(String model, String company) {
        this.model = model;
        this.company = company;
    }

    @Override
    public String toString() {
        return "cycle{" + "model=" + model + ", company=" + company + '}';
    }
     public void displaycycle(){
         System.out.println(this.toString());
     }
}
