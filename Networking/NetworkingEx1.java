package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by bobsang89@gmail.com on 2019-03-26
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class NetworkingEx1 {
    public static void main(String[] args) {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try{
            ip = InetAddress.getByName("www.google.com");
            System.out.println("getHostName() : " + ip.getHostName());
            System.out.println("getHostAddress() : " + ip.getHostAddress());
            System.out.println("toString() : " + ip.toString());

            byte[] ipAddr = ip.getAddress();
            System.out.println("getAddress() : " + Arrays.toString(ipAddr));

            String result = "";
            for(int i = 0; i < ipAddr.length; i++){
                result +=(ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
                result += ".";
            }
            System.out.println("getAddress()+256 : " + result);
            System.out.println();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }

        try{
            ip = InetAddress.getLocalHost();
            System.out.println("getHostName() : " + ip.getHostName());
            System.out.println("getHostAddress() : " + ip.getHostAddress());
            System.out.println();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

        try{
            ipArr = InetAddress.getAllByName("www.google.com");

            for(int i = 0; i < ipArr.length; i++){
                System.out.println("ipArr[" + i + "] : " + ipArr[i]);
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
