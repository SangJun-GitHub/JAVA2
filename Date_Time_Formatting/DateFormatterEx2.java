package Date_Time_Formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by bobsang89@gmail.com on 2019-02-09
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatterEx2 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.parse("1989-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date = LocalDate.parse("2019-01-01");
        LocalTime time = LocalTime.parse("23:59:59");
        LocalDateTime dateTime = LocalDateTime.parse("2019-01-01T23:59:59");
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("1989-12-31 23:59:59", pattern);

        System.out.println(newYear);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(endOfYear);
    }
}
