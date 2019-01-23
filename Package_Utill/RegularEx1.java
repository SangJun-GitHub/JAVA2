package Package_Utill;
import java.util.regex.*;

/**
 * Created by bobsang89@gmail.com on 2019-01-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};

        Pattern p = Pattern.compile("c[a-z]*");

        for(int i = 0; i < data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches())
                System.out.println(data[i] + " ");
        }
    }
}
