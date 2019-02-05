package Date_Time_Formatting;

import java.util.Calendar;

/**
 * Created by bobsang89@gmail.com on 2019-02-04
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx7 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage : java CalendarEx7 2019 2");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month-1, 1);

        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));

        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);

        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("    " + year + "year " + month + "month");
        System.out.println(" SU MO TU WE TH FR SA");

        for(int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)){
            int day = sDay.get(Calendar.DATE);
            System.out.print((day < 10) ? "  " + day : " " + day);
            if(n++%7 == 0) System.out.println();
        }
    }
}
