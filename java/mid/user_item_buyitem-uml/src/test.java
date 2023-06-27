
public class test {
    public static void main(String args[]){
        customer c= new customer("zobaida123","123zo");
        item i1= new item("rice",60);
        buyitem b1=new buyitem("5-3-2021",10);
        c.setbuyitem(b1);
        i1.setbuyitem(b1);
        c.displaycustomerinfo();
        i1.displayiteminfo();
        
        
    }
}
