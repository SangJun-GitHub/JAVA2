package Date_Time_Formatting;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-02-05
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy'year' MM'month' dd'day' E");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        sdf5 = new SimpleDateFormat("'today is' D'th day of this year'");
        sdf6 = new SimpleDateFormat("'today is' d'th day of this month'");
        sdf7 = new SimpleDateFormat("'today is' w'th week of this year'");
        sdf8 = new SimpleDateFormat("'today is' W'th week of this month'");
        sdf9 = new SimpleDateFormat("'today is' F'th E of this month'");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println();
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));

    }
}
