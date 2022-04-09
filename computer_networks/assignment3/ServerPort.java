import java.net.*;

public class ServerPort {
	public static void main(String[] args) throws Exception {
		try {
			ServerSocket mySsocket = new ServerSocket(8000);

			System.out.println("Server started");
			System.out.println("Waiting for a client ...");

			Socket socket = mySsocket.accept();

			System.out.println(
					"Client accepted through the port number: "
							+ mySsocket.getLocalPort());
		}

		catch (Exception e) {

			return;
		}
	}
}
