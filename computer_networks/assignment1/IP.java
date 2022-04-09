import java.io.*;
import java.net.*;

public class IP {
	public static void main(String args[]) throws IOException {
		InetAddress myIP = InetAddress.getLocalHost();
		System.out.println("My loopback IP Address is:");
		System.out.println(myIP.getHostAddress());
		System.out.println("My getby name IP Address is:");
		System.out.println(InetAddress.getByName("192.168.4.111").getHostAddress());
		System.out.println(InetAddress.getByName("google.com").getHostAddress());
	}
}
