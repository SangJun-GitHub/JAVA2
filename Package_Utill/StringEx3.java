package Package_Utill;

import java.util.StringJoiner;

/**
 * Created by bobsang89@gmail.com on 2019-01-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx3 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/","[","]");
        for(String s : arr)
            sj.add(s);

        System.out.println(sj);
    }
}
