
package account;

import java.time.LocalDateTime;




public class Account {
    private int id;
    private double balance;
    private double annualinterestrate;
   
    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }


    public Account(int id, double balance, double annualinterestrate) {
        this.id = id;
        this.balance = balance;
        this.annualinterestrate = annualinterestrate;
    }

    LocalDateTime datacreated=LocalDateTime.now();

    public String getDatacreated() {
        return this.datacreated.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualinterestrate() {
        return annualinterestrate;
    }
    
    public double getmonthlyinterestrate(){
        return annualinterestrate/12;
    }
   public double withdraw(){
       return(balance-2500);
   }
    public double deposit(){
        return(balance+3000);
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", annualinterestrate=" + annualinterestrate + ", datacreated=" + datacreated + '}';
    }

    
   
    
}
