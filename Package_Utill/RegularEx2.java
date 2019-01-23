package Package_Utill;
import java.util.Arrays;
import java.util.regex.*;

/**
 * Created by bobsang89@gmail.com on 2019-01-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class RegularEx2 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "c#", "car", "combat", "count", "date", "disc"};

        String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]",
                "c.", "c.*", "c\\.", "c\\w", "c\\d", "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}"};

        System.out.println("data : " + Arrays.toString(data));
        System.out.println();
        for(int i = 0; i < pattern.length; i++){
            Pattern p = Pattern.compile(pattern[i]);
            System.out.print("Pattern : " + pattern[i] + " result : ");
            for(int j = 0; j < data.length; j++){
                Matcher m = p.matcher(data[j]);
                if(m.matches())
                    System.out.print(data[j]+", ");
            }
            System.out.println();
        }
    }
}
