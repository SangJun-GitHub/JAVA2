package Input_Output;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by bobsang89@gmail.com on 2019-03-25
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class SerialEx2 {
    public static void main(String[] args) {
        try{
            String fileName = "UserInfo.ser";
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            ObjectInputStream in = new ObjectInputStream(bufferedInputStream);

            UserInfo u1 = (UserInfo)in.readObject();
            UserInfo u2 = (UserInfo)in.readObject();
            ArrayList list = (ArrayList)in.readObject();

            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
