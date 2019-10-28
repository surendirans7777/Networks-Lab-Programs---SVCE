import java.io.*;
import java.net.*;
import java.util.*;

public class dnsClient {
        public static void main(String[] args) {
                try {
                        DatagramSocket csock = new DatagramSocket(3412);
                        DatagramSocket s = new DatagramSocket();
                        Scanner sc = new Scanner(System.in);
                        byte msg[] = new byte[100];
                        String str = "";
                        System.out.println("Enter URL : ");
                        str = sc.nextLine();
                        msg = str.getBytes();
                        DatagramPacket packet = new DatagramPacket(msg, msg.length, InetAddress.getLocalHost(), 2233);
                        s.send(packet);
                        byte msg2[] = new byte[1024];
                        DatagramPacket packet2 = new DatagramPacket (msg2, msg2.length);
                        csock.receive(packet2);
                        str = new String(packet2.getData());
                        System.out.println("IP address received : " + str);
                }
                catch (Exception e) {
                        System.out.println(e);
                }
        }
}
