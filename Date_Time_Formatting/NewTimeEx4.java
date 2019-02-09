package Date_Time_Formatting;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by bobsang89@gmail.com on 2019-02-08
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1989, 8, 30);
        LocalDate date2 = LocalDate.of(2018, 8, 30);

        Period period = Period.between(date1, date2);

        System.out.println("date1=" + date1);
        System.out.println("date2=" + date2);
        System.out.println("period=" + period);

        System.out.println("YEAR=" + period.get(ChronoUnit.YEARS));
        System.out.println("MONTH="+ period.get(ChronoUnit.MONTHS));
        System.out.println("DAY="+ period.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(0,0,0);
        LocalTime time2 = LocalTime.of(12,34,56);
        Duration duration = Duration.between(time1, time2);

        LocalTime tmpTime = LocalTime.of(0,0).plusSeconds(duration.getSeconds());

        System.out.println("HOUR=" + tmpTime.getHour());
        System.out.println("MINUTE="+ tmpTime.getMinute());
        System.out.println("SECOND="+ tmpTime.getSecond());
        System.out.println("NANO="+ tmpTime.getNano());
    }
}
