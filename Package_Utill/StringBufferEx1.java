package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));


        //convert StringBuffer to String
        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println("s == s2 ? " + (s == s2));
        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
