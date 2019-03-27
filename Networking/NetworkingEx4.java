package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by bobsang89@gmail.com on 2019-03-26
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class NetworkingEx4 {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;

        String address = "https://github.com/SangJun-GitHub/JAVA2/tree/master/Networking";
        String line = "";

        try{
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while((line = input.readLine()) != null){
                System.out.println(line);
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
