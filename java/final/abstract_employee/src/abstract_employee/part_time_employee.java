
package abstract_employee;


public class part_time_employee extends employee{
    private double hourlyrate;
    private int hoursperweek;

    public part_time_employee(String name, String id, double r, int w) {
        super(name, id);
        this.hourlyrate=r;
        this.hoursperweek=w;
    }

  

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public void setHoursperweek(int hoursperweek) {
        this.hoursperweek = hoursperweek;
    }
    

    @Override
    public double calculatesalary() {
       return this.hourlyrate*this.hoursperweek;
    }

    @Override
    public void display() {
      System.out.println("hourlyrate:"+this.hourlyrate);  
      System.out.println("hourperweek:"+this.hoursperweek);
    }
    
}
