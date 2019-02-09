package Date_Time_Formatting;

import java.time.*;

/**
 * Created by bobsang89@gmail.com on 2019-02-08
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1989, 8, 30);
        LocalTime time = LocalTime.of(12,34,56);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        ZoneId zoneId = ZoneId.of("America/Toronto");
        ZonedDateTime zonedDateTime = dateTime.atZone(zoneId);

        ZonedDateTime torontoTime = ZonedDateTime.now();
        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.now().withZoneSameInstant(seoulId);

        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();

        System.out.println(date);
        System.out.println(zoneId);
        System.out.println(zonedDateTime);
        System.out.println(torontoTime);
        System.out.println(seoulTime);
        System.out.println(offsetDateTime);
    }
}
