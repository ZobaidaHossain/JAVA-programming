
import java.util.ArrayList;


public class motorcycle extends cycle{
 private String price;
 private String year;
 private String regnum;
private ArrayList<engine>engList=new ArrayList();
private ArrayList<dashboard>dashList=new ArrayList();
    public motorcycle(String price, String year, String regnum, String model, String company) {
        super(model, company);
        this.price = price;
        this.year = year;
        this.regnum = regnum;
    }

public void changefuel(){
     final Integer stdfuel=100;
     
}
public void checkbattery(){
    final Integer stdbattery=100;
}
public void addengine(engine e){
    this.engList.add(e);
}

public void adddashboard(dashboard d){
    this.dashList.add(d);
}

    @Override
    public String toString() {
        return "motorcycle{" + "price=" + price + ", year=" + year + ", regnum=" + regnum + ", engList=" + engList + ", dashList=" + dashList + '}';
    }
public void displayall(){
    System.out.println(this.toString());
    for(engine e:engList){
        e.displayengineinfo();
    }
   for(dashboard d:dashList){
       d.displaydashboardinfo();
   }
}
   public static void main(String args[]){
       engine e1=new engine("full");
       dashboard d1=new dashboard("large");
       motorcycle m1=new motorcycle("7l","2000","reg11","full","large");
       m1.addengine(e1);
       m1.adddashboard(d1);
       m1.displayall();
      
   }

   
}