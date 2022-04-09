import java.net.*;
import java.io.*;
import java.util.*;

public class PacketTimeout {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ip or hostname");
		String host = sc.nextLine();
		InetAddress new_net = InetAddress.getByName(host);
		System.out.println("host: " + host + " " + new_net.isReachable(60));
		sc.close();
	}
}
