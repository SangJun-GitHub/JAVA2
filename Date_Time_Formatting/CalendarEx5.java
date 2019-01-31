package Date_Time_Formatting;

import java.util.Calendar;

/**
 * Created by bobsang89@gmail.com on 2019-01-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015, 0, 31);      //2015-01-31
        System.out.println(toString(date));
        date.roll(Calendar.MONTH,1);
        System.out.println(toString(date));         //2015-02-28
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "year " + (date.get(Calendar.MONTH)+1) + "month " + date.get(Calendar.DATE) + "day ";
    }
}
