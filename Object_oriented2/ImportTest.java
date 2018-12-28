package Object_oriented2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2018-12-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("Today is " + date.format(today));
        System.out.println("Current time is " + time.format(today));
    }
}
