package Package_Utill;

import java.util.StringTokenizer;

/**
 * Created by bobsang89@gmail.com on 2019-01-26
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
