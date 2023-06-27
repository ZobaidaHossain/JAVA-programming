
package account;

public class test {
    public static void main(String[]args){
        Account a1=new Account(1122,20000.00,4.5);
      System.out.println(a1.toString());
        System.out.println("Account information: "+a1.getId());
    System.out.println("balance: "+a1.getBalance());
    System.out.println("monthly interest rate: "+a1.getmonthlyinterestrate());
    System.out.println("deposit "+a1.deposit());
    System.out.println("withdraw " +a1.withdraw());
    System.out.println("total balance: "+(a1.getBalance()+(3000-2500)));
   System.out.println(a1.getDatacreated());
    }
    
}
