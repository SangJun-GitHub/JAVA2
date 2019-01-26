package Package_Utill;

import java.util.StringTokenizer;

/**
 * Created by bobsang89@gmail.com on 2019-01-26
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
