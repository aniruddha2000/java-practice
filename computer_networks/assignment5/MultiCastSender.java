import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MultiCastSender {
	public static void main(String[] args) throws Exception {
		InetAddress group = InetAddress.getByName("224.6.7.8");
		MulticastSocket socket = new MulticastSocket();
		String msg = "Message: UDP Multicasting by Aniruddha.";

		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), group, 3456);
		socket.send(dp);
		socket.close();
	}
}
