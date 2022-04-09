import java.net.*;

public class ClientPort {
	public static void main(String[] args) throws Exception {
		try {
			Socket myCsocket = new Socket("localhost", 8000);
			System.out.println("Connected to Server");
		} catch (Exception e) {
			return;
		}
	}
}
