package Date_Time_Formatting;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by bobsang89@gmail.com on 2019-02-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1989,8,30);
        LocalTime birthTime = LocalTime.of(23,59,59);

        System.out.println("Today : " + today);
        System.out.println("Now : " + now);
        System.out.println("BirthDate : " + birthDate);                         //1989-8-30
        System.out.println("BirthTime : " + birthTime);                         //23:59:59

        System.out.println(birthDate.withYear(2000));                           //2000-8-30
        System.out.println(birthDate.plusDays(1));                              //2000-8-31
        System.out.println(birthDate.plus(1,ChronoUnit.DAYS));      //2000-8-31

        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));            //23:59:59 -> 23:00

        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());              //1-24
        System.out.println(ChronoField.HOUR_OF_DAY.range());                    //0-23



    }
}
