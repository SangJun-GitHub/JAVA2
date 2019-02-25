package Collection_framework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by bobsang89@gmail.com on 2019-02-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "en");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        try{
            prop.store(new FileOutputStream("output.txt"), "Properties Example");
            prop.storeToXML(new FileOutputStream("output.txt"), "Properties Example");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
