package Date_Time_Formatting;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-02-07
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception{
        String tableName = "CUST_INFO";
        String fileName = "./src/Date_Time_Formatting/data4.txt";
        String message = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});";

        Scanner scanner = new Scanner(new File(fileName));

        String pattern = "{0},{1},{2},{3}";
        MessageFormat messageFormat = new MessageFormat(pattern);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            Object[] object = messageFormat.parse(line);
            System.out.println(MessageFormat.format(message,object));
        }
    }
}
