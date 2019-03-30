package Networking;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by bobsang89@gmail.com on 2019-03-29
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpClient5 {
    public static void main(String[] args) {
        try{
            String serverIp = "192.168.2.237";
            Socket socket = new Socket(serverIp, 8082);

            System.out.println("Connecting to server : " + serverIp);
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();
        }catch(ConnectException ce){
            ce.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
