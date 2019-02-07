package Date_Time_Formatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-02-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df1 = new SimpleDateFormat("yyyy'year' MM'month' dd'day'");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try{
            Date d = df1.parse("1989year 08month 30day");
            System.out.println(df2.format(d));
        }catch(Exception e) {

        }
    }
}
