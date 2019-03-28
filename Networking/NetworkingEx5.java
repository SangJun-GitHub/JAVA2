package Networking;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by bobsang89@gmail.com on 2019-03-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class NetworkingEx5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        String address = "https://github.com/SangJun-GitHub/JAVA2/tree/master/Networking";

        int ch = 0;

        try{
            url = new URL(address);
            inputStream = url.openStream();
            outputStream = new FileOutputStream("java_src.zip");

            while((ch=inputStream.read()) != -1){
                outputStream.write(ch);
            }
            inputStream.close();
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
