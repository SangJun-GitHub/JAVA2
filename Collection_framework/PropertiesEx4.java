package Collection_framework;

import java.util.Properties;

/**
 * Created by bobsang89@gmail.com on 2019-02-24
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version :" + sysProp.getProperty("java.version"));
        System.out.println("user.language :" + sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
