package Date_Time_Formatting;

import java.text.MessageFormat;

/**
 * Created by bobsang89@gmail.com on 2019-02-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String message = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'');";

        Object[][] arguments = {{"Sang","000-000-0000","29","08-30",},{"Jun","111-111-1111","29","02-07"}};

        for(int i = 0; i < arguments.length; i++){
            String result = MessageFormat.format(message,arguments[i]);
            System.out.println(result);
        }
    }
}
