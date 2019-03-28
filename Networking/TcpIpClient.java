package Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by bobsang89@gmail.com on 2019-03-27
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpClient {
    public static void main(String[] args) {
        try{
            String serverIp = "192.168.2.237";

            System.out.println("Connecting to server : " + serverIp);
            Socket socket = new Socket(serverIp, 7777);

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("Messages from the server : " + dataInputStream.readUTF());
            System.out.println("Exit the connection.");

            dataInputStream.close();
            socket.close();
            System.out.println("Connection exited.");
        }catch(ConnectException ce){
            ce.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
