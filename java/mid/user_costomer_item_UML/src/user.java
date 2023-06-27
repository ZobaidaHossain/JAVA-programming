
import javax.swing.JOptionPane;


public class user {
    protected String userid;
    protected String passwd;
    protected customer c;

    public user(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }

   public user(){}
    public customer getcustomer() {
        return c;
    }

    public void setcustomer(customer c) {
        this.c = c;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "user{" + "userid=" + userid + ", passwd=" + passwd + ", c=" + c + '}';
    }

  
    public void displayuser(){
        System.out.println("id:"+this.userid);
        System.out.println("password:"+this.passwd);
        System.out.println("customer:"+this.c);
        JOptionPane.showMessageDialog(null,this.toString());
    }
}