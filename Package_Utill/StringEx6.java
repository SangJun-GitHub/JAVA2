package Package_Utill;

/**
 * Created by bobsang89@gmail.com on 2019-01-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx6 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        //find '.' index at fullName
        int index = fullName.indexOf('.');

        //extract string from the first character to '.'
        String fileName = fullName.substring(0, index);

        //extract string from after '.' to the last character
        String ext = fullName.substring(index + 1);

        System.out.println(fileName);
        System.out.println(ext);
    }
}
