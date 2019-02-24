package Collection_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by bobsang89@gmail.com on 2019-02-23
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
            System.exit(0);
        }

        Properties prop = new Properties();

        String inputFile = args[0];

        try{
            prop.load(new FileInputStream(inputFile));
        }catch (IOException e){
            System.out.println("Could not find the file");
            System.exit(0);
        }

        String name = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(",");
        int max = 0;
        int min = 0;
        int sum = 0;

        for(int i = 0; i < data.length; i++){
            int intValue = Integer.parseInt(data[i]);

            if(i == 0) max = min = intValue;

            if(max < intValue)
                max = intValue;
            else if(min > intValue)
                min = intValue;

            sum += intValue;
        }
        System.out.println("Name : " + name);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Sum : " + sum);
        System.out.println("Avg : " + (sum*100.0/data.length)/100);
    }
}
