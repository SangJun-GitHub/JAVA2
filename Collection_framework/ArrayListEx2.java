package Collection_framework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobsang89@gmail.com on 2019-02-09
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()ZZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10);

        for(int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
