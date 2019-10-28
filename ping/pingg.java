import java.net.*;
import java.util.Scanner;
import java.io.*;

public class pingg {
	public static void main(String[] args) {

		try {
			System.out.println("Enter the Ip Address or Host name");
			Scanner sc= new Scanner(System.in);
			String ipAddress = sc.nextLine();
			InetAddress inet = InetAddress.getByName(ipAddress);
			System.out.println("Sending Ping Request to " + ipAddress);
			if (inet.isReachable(5000)) {
				System.out.println(ipAddress + " is reachable.");
			} else {
				System.out.println(ipAddress + " NOT reachable.");
			}
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}