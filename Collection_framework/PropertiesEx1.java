package Collection_framework;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by bobsang89@gmail.com on 2019-02-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "en");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()){
            String element = (String)e.nextElement();
            System.out.println(element + " = " + prop.getProperty(element));
        }
        System.out.println();
        prop.setProperty("size", "20");
        System.out.println("size=" + prop.getProperty("size"));
        System.out.println("capacity=" + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

        System.out.println(prop);
        prop.list(System.out);
    }
}

//---------------------------Output---------------------------
//capacity = 10
//size = 10
//timeout = 30
//language = en
//
//size=20
//capacity=10
//loadfactor=0.75                                               <- loadfactor key does not exist, so default 0.75 come up
//{capacity=10, size=20, timeout=30, language=en}               <- System.out.println(prop);
//-- listing properties --                                      <- prop.list(System.out);
//capacity=10                                                   <- prop.list(System.out);
//size=20                                                       <- prop.list(System.out);
//timeout=30                                                    <- prop.list(System.out);
//language=en                                                   <- prop.list(System.out);