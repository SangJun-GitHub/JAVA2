package Date_Time_Formatting;

import java.text.MessageFormat;

/**
 * Created by bobsang89@gmail.com on 2019-02-06
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] arguments = { "SangJun", "000-000-0000", "29", "08-30"};
        String result = MessageFormat.format(msg, arguments);

        System.out.println(result);
    }
}
