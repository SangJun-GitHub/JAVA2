package Package_Utill;

import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-01-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("Canada");
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());
    }
}
