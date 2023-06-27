
package class_relation_aggregation;

public class test {
    public static void main(String args[]){
     book b1=new book("oppo naki opshory",200,500);
     author a1=new author("opshory","zobaida.opshory@gmail.com","female");
     b1.setauthor(a1);
     System.out.println(b1.toString());
     
    }
}
