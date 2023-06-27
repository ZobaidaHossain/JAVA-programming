
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class customer {
    private String userid;
    private String passwd;
    private buyitem b;
    private ArrayList<item>itemList = new ArrayList<>();
    public customer(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }

    public buyitem getbuyitem() {
        return b;
    }

    public void setbuyitem(buyitem b) {
        this.b = b;
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
        return "customer{" + "userid=" + userid + ", passwd=" + passwd + ", b=" + b + '}';
    }

  public boolean Additem(item i)
    {
        if(itemList.add(i)) {
            return true;
        }
        else return false;
    }
    public boolean Removeitem(item i){
        if(itemList.remove(i)){
            return true;
        }
        else 
            return false;
    }
    public void listofselecteditem(){
        for(item i:itemList)
            i.displayiteminfo();
    }

    
    public void displaycustomerinfo(){
        System.out.println("userid: "+this.userid);
        System.out.println("password:"+this.passwd);
        System.out.println("buyitem:"+this.b);
        JOptionPane.showMessageDialog(null,this.toString());
    }
}
