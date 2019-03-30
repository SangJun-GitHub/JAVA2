package Networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bobsang89@gmail.com on 2019-03-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpServer2 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + " The server is ready");
        }catch(IOException e){
            e.printStackTrace();
        }

        while(true){
            try{
                System.out.println(getTime() + " Wait for connection request");
                Socket socket = serverSocket.accept();
                System.out.println(getTime() +" A connection request came in from " +  socket.getInetAddress());

                System.out.println("getPort() : " + socket.getPort());
                System.out.println("getLocalPort() : " + socket.getLocalPort());

                OutputStream out = socket.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(out);

                dataOutputStream.writeUTF("[Notice] Test Message form Server");
                System.out.println(getTime() + " data has been transferred");

                dataOutputStream.close();
                socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
