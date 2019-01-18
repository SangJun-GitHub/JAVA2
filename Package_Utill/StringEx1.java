package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("\"abc\"");
        String str4 = new String("\"abc\"");
        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ? " + (str3 == str4));     //false,because there are pointing different address
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));

    }
}
