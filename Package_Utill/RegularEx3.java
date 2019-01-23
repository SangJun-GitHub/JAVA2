package Package_Utill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bobsang89@gmail.com on 2019-01-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RegularEx3 {
    public static void main(String[] args) {
        String source = "CELL:111-111-1111, HOME:999-999-9999";
        String pattern = "(\\d{3})-(\\d{3})-(\\d{4})";
        // 0\\d{1,2}    start with 0, min 2, max 3
        // \\d{3,4}     min 3, max 4
        // \\d{4}       4

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);

        int i = 0;
        while(m.find())
            System.out.println( ++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
    }
}
