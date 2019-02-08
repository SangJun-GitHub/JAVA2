package Date_Time_Formatting;

import java.text.MessageFormat;

/**
 * Created by bobsang89@gmail.com on 2019-02-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx3 {
    public static void main(String[] args) throws Exception {
        String[] data = {"INSERT INTO CUST_INFO VALUES ('Sang','000-000-0000','29','08-30');",
                "INSERT INTO CUST_INFO VALUES ('Jun','111-111-1111','29','08-30');"};

        String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
        MessageFormat messageFormat = new MessageFormat(pattern);

        for(int i = 0; i < data.length; i++){
            Object[] objects = messageFormat.parse(data[i]);
            for(int j = 0; j < objects.length; j++){
                System.out.print(objects[j]+ ",");
            }
            System.out.println();
        }
    }
}
