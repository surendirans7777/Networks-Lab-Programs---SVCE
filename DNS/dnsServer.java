import java.io.*;
import java.net.*;
import java.util.*;
public class dnsServer {
        public static void main(String[] args) {
                try {
                        DatagramSocket csock = new DatagramSocket(2233);
                        DatagramSocket s = new DatagramSocket();
                        byte msg[] = new byte[100];
                        String str = "";
                        DatagramPacket packet = new DatagramPacket (msg, msg.length);
                        csock.receive(packet);
                        String url = new String(packet.getData());
                        InetAddress addr = InetAddress.getByName(url);
                        System.out.println("URL received : " + url);
                        System.out.println("IP address : " + addr.getHostAddress());
                        str = addr.toString();
                        byte msg2[] = new byte[100];
                        msg2 = str.getBytes();
                        DatagramPacket packet2 = new DatagramPacket(msg2, msg2.length, InetAddress.getLocalHost(), 3412);
                        s.send(packet2);
                }
                catch (Exception e) {
                        System.out.println(e);
                }
        }
}
