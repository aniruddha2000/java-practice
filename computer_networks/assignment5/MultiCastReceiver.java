import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MultiCastReceiver {
	public static void main(String[] args) throws Exception {
		InetAddress group = InetAddress.getByName("224.6.7.8");
		MulticastSocket socket = new MulticastSocket(3456);
		socket.joinGroup(group);

		byte[] buffer = new byte[100];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		socket.receive(dp);
		System.out.println(new String(buffer));
		socket.close();
	}
}
