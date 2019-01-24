package Package_Utill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bobsang89@gmail.com on 2019-01-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RegularEx4 {
    public static void main(String[] args) {
        String source = "a broken hand works, but not a broken heart.";
        String pattern = "broken";
        StringBuffer sb = new StringBuffer();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        System.out.println("source: " + source);

        int i = 0;
        while(m.find()){
            System.out.println(++i + ". matching: " + m.start() + "~" + m.end());
            // broken -> drunken then save to sb
            m.appendReplacement(sb, "drunken");
        }

        m.appendTail(sb);
        System.out.println("Replacement count : " + i);
        System.out.println("result : " + sb.toString());
    }
}
