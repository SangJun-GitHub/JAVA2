package Date_Time_Formatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-02-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatEx4 {
    public static void main(String[] args) {
        String patten = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(patten);
        Scanner scanner = new Scanner(System.in);

        Date inDate = null;

        System.out.println("Enter day like " + patten + "(ex:2019/02/06)");

        while(scanner.hasNextLine()){
            try{
                inDate = df.parse(scanner.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Enter day like " + patten + "(ex:2019/02/06)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
        System.out.println("Between your input and today difference of hour is "+ day);
    }
}
