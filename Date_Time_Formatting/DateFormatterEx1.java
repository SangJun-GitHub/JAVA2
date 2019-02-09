package Date_Time_Formatting;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by bobsang89@gmail.com on 2019-02-08
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        String[] patternArr = {
                "yyyy-MM-dd HH:mm:ss",
                "yyyy'year' MMM dd'day' E",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "'Today is' D'th day of this year'",
                "'Today is' d'th day of this month'",
                "'Today is' w'th week of this year'",
                "'Today is' W'th week of this month'"
        };

        for(String p : patternArr){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(zonedDateTime.format(formatter));
        }
    }
}
