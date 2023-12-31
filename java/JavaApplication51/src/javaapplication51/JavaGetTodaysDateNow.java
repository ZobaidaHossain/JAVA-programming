
import java.util.*;

/**
 * A Java Date and Calendar example that shows how to
 * get today's date ("now").
 * 
 * @author alvin alexander, devdaily.com
 */
public class JavaGetTodaysDateNow
{

  public static void main(String[] args)
  {
    // create a calendar instance, and get the date from that
    // instance; it defaults to "today", or more accurately,
    // "now".
    Date today = Calendar.getInstance().getTime();
    System.out.println(today);
  }

}
