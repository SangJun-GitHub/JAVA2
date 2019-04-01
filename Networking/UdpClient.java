package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by bobsang89@gmail.com on 2019-03-30
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class UdpClient {
    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("192.168.2.237");

        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramSocket.send(outPacket);
        datagramSocket.receive(inPacket);

        System.out.println("current server time : " + new String(inPacket.getData()));

        datagramSocket.close();
    }

    public static void main(String[] args) {
        try{
            new UdpClient().start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
