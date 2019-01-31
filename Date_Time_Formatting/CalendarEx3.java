package Date_Time_Formatting;

import java.util.Calendar;

/**
 * Created by bobsang89@gmail.com on 2019-01-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"Hour", "Minute", "Second"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + " hour " + time1.get(Calendar.MINUTE) + " minute " + time1.get(Calendar.SECOND) + "second");
        System.out.println("time2 : " + time1.get(Calendar.HOUR_OF_DAY) + " hour " + time1.get(Calendar.MINUTE) + " minute " + time1.get(Calendar.SECOND) + "second");

        long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
        System.out.println("the difference between time1 and time2 : " + difference + " second" );

        String tmp = "";
        for(int i = 0; i < TIME_UNIT.length; i++){
            tmp +=difference/TIME_UNIT[i] + " " + TIME_UNIT_NAME[i] + " ";
            difference %= TIME_UNIT[i];
        }
        System.out.println("convert to hour, minute and second  : "+ tmp);
    }
}
