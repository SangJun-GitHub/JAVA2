package Date_Time_Formatting;

/**
 * Created by bobsang89@gmail.com on 2019-02-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "198908";
        String date2 = "201902";

        int month1 = Integer.parseInt(date1.substring(0,4)) * 12 + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0,4)) * 12 + Integer.parseInt(date2.substring(4));

        System.out.println("difference between "+ date1 +" and " + date2 +": " + Math.abs(month1-month2) + "months");
    }
}
