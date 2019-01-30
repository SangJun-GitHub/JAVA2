package Date_Time_Formatting;

import java.util.Calendar;

/**
 * Created by bobsang89@gmail.com on 2019-01-29
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CalenderEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("This year is : " + today.get(Calendar.YEAR));
        System.out.println("Month(0~11) : " + today.get(Calendar.MONTH));                     //Start from 0 (0 = January)
        System.out.println("Week of year : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of month : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Date : " + today.get(Calendar.DATE));
        System.out.println("Day of month : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of year : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of week(1~7, 1:Sunday) : " + today.get(Calendar.DAY_OF_WEEK));//Start from 1 (1 = Sunday)
        System.out.println("Day of week in month : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM_PM(AM:0, PM:1) : " + today.get(Calendar.AM_PM));
        System.out.println("Hour(0~12) : " + today.get(Calendar.HOUR));
        System.out.println("Hour of day(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute(0~59) : " + today.get(Calendar.MINUTE));
        System.out.println("Second(0~59) : " + today.get(Calendar.SECOND));
        System.out.println("Millisecond(0~999) : "+ today.get(Calendar.MILLISECOND));
        //1 hour = 60 * 60seconds
        System.out.println("TimeZon(-12~+12) : " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
        System.out.println("Last date of month : " + today.getActualMaximum(Calendar.DATE));
    }
}
