package Package_Utill;

import java.util.StringTokenizer;

/**
 * Created by bobsang89@gmail.com on 2019-01-29
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + "|");

        System.out.println("Number:" + result.length + " <- split()");

        int i = 0;
        for(;st.hasMoreTokens();i++)
            System.out.print(st.nextToken()+ "|");
        System.out.println("Number:" + i + " <- StringTokenizer");
    }
}
