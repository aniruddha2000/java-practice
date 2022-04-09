import java.net.*;
import java.util.*;

class PortScanner {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter start port no - ");
      int startingPort = sc.nextInt();
      System.out.print("Enter end port number - ");
      int endPort = sc.nextInt();
      int openPorts = 0;
      int closedPorts = 0;
      for (int port = startingPort; port <= endPort; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", port), 1000);
            socket.close();
            System.out.println("Port " + port + " is busy");
            openPorts++;
         } catch (Exception ex) {
            closedPorts++;
         }
      }
      System.out.println("Number of open ports " + openPorts);
      System.out.println("Number of closed ports " + closedPorts);
      sc.close();
   }
}
