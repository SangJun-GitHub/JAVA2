package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by bobsang89@gmail.com on 2019-03-28
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
class Sender extends Thread{
    Socket socket;
    DataOutputStream out;
    String name;

    Sender(Socket socket){
        this.socket = socket;

        try{
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress() + ":" + socket.getPort()+ "]";
        }catch (Exception e){}
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (out != null) {
            try{
                out.writeUTF(name + scanner.nextLine());
            }catch(IOException e){}
        }
    }
}

class Receiver extends Thread{
    Socket socket;
    DataInputStream in;

    Receiver(Socket socket){
        this.socket = socket;
        try{
            in = new DataInputStream(socket.getInputStream());
        }catch(IOException e){}
    }

    public void run(){
        while(in != null){
            try{
                System.out.println(in.readUTF());
            }catch(IOException e){}
        }
    }
}
public class TcpIpServer5 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(8082);
            System.out.println("The server is ready");

            socket = serverSocket.accept();

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
