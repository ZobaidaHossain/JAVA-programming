
//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;


public class ArrayListDemo {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> arrList=new ArrayList();
        System.out.println("Enter total number of data: ");
        int total=scan.nextInt();
        for(int i=0;i<total;i++)
        {
            arrList.add(scan.nextInt());
        }
         System.out.println("Enter data for searching: ");
         int search=scan.nextInt();
         
         boolean flag=false;
         
         for(Integer i:arrList)
         {
         
               if(i==search)
               {
                   flag=true;
                   break;
               }
               
         }
         if(flag==true)
             System.out.println("Data Found");
         else
             System.out.println("Data not Found");
         
         
        
    }
}
