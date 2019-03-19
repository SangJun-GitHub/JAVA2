package Input_Output;

import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-03-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PrintStreamEx1 {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();

        System.out.printf("Character %c cord is %d\n",i ,i);
        System.out.printf("%d octal number is %o, hexadecimal number is %x\n", i, i ,i);
        System.out.printf("%3d%3d%3d\n", 100, 90, 80);
        System.out.println();
        System.out.printf("123456789012345678901234567890\n");
        System.out.printf("%s%-5s%5s\n", "123", "123", "123");
        System.out.println();
        System.out.printf("%-8.1f%8.1f %e\n",f ,f ,f);
        System.out.println();
        System.out.printf("Today is %tYYears %tmMonthes %tdDays\n",d ,d ,d);
        System.out.printf("Time is %tHHours %tMMinutes %tSSeconds\n",d , d, d);
        System.out.printf("Time is %1$tHHours %1$tMMinutes %1$tSSeconds\n",d , d, d);
    }
}
