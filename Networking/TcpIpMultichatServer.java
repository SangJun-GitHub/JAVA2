package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by bobsang89@gmail.com on 2019-03-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class TcpIpMultichatServer {
    HashMap clients;

    TcpIpMultichatServer(){
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start(){
        ServerSocket serverSocket = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println("The server has started");

            while(true){
                socket = serverSocket.accept();
                System.out.println("You are connected to [" + socket.getInetAddress() + ":" + socket.getPort() + "]");
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void sendToAll(String msg){
        Iterator iterator = clients.keySet().iterator();

        while(iterator.hasNext()){
            try{
                DataOutputStream out = (DataOutputStream)clients.get(iterator.next());
                out.writeUTF(msg);
            }catch(IOException e){}
        }
    }

    public static void main(String args[]){
        new TcpIpMultichatServer().start();
    }

    class ServerReceiver extends Thread{
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket){
            this.socket = socket;
            try{
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            }catch(IOException e){}
        }

        public void run(){
            String name = "";

            try{
                name = in.readUTF();
                sendToAll("#"+name+" have entered");

                clients.put(name, out);
                System.out.println("Currently, the number of servers is " + clients.size());

                while(in != null){
                    sendToAll(in.readUTF());
                }
            }catch(IOException e){

            }finally {
                sendToAll("#"+name+" have left");
                clients.remove(name);
                System.out.println("You are disconnected to [" + socket.getInetAddress() + ":" + socket.getPort() + "]");
                System.out.println("Currently, the number of servers is " + clients.size());
            }
        }
    }
}
