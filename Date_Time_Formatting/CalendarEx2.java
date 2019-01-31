package Date_Time_Formatting;

import java.util.Calendar;

/**
 * Created by bobsang89@gmail.com on 2019-01-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"","Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        //month starts from 0
        //date1.set(2015, Calendar.AUGUST, 15)
        date1.set(2015,7,15);       //2015-08-15
        System.out.println("dat1 : " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("today : " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis());
        System.out.println("the difference from date1 until date2 : " + difference + "seconds");
        System.out.println("the difference from date1 until date2 : " + difference/(24*60*60) + "days");
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "year " + (date.get(Calendar.MONTH)+1) + "month " + date.get(Calendar.DATE) + "day ";
    }
}
