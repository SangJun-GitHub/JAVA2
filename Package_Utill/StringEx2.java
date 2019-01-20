package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx2 {
    public static void main(String[] args) {
        char[] cArr = new char[0];      //char[] cArr = {};
        String s = new String(cArr);    //String s = new String("");

        System.out.println("cArr.length=" + cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
