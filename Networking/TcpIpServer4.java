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
public class TcpIpServer4 implements Runnable{
    ServerSocket serverSocket;
    Thread[] theadArr;

    public static void main(String args[]){
        TcpIpServer4 server = new TcpIpServer4(5);
        server.start();
    }

    public TcpIpServer4(int num){
        try{
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() +" The server is ready");
            theadArr = new Thread[num];
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void start(){
        for(int i = 0; i < theadArr.length; i++){
            theadArr[i] = new Thread(this);
            theadArr[i].start();
        }
    }

    public void run(){
        while(true){
            try{
                System.out.println(getTime() + " Wait for connection request");
                Socket socket = serverSocket.accept();
                System.out.println(getTime() +" A connection request came in from " +  socket.getInetAddress());

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
        String name = Thread.currentThread().getName();
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date()) + name;
    }
}
