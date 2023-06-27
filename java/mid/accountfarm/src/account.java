    


import javax.swing.JOptionPane;

public class account {
 private String email;
 private String username;
 private String password;
 public account(){}

    public account(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "account{" + "email=" + email + ", username=" + username + ", password=" + password + '}';
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null,this.toString());
    }
    public static void main(String args[]){
 account a1=new account();
 a1.setEmail("zobaida.com");
 a1.setUsername("oppo");
 a1.setPassword("ops");
 a1.display();
  String email=JOptionPane.showInputDialog("enter email");
   String username=JOptionPane.showInputDialog("enter username");
    String password=JOptionPane.showInputDialog("enter password");
 account a2=new account(email,username,password);
 a2.display();
}
}
