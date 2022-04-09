import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.net.DatagramPacket;

public class ClientUDP {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DatagramSocket ds = new DatagramSocket();
        System.out.println("Enter any number: ");
        int i = sc.nextInt();

        byte[] b = String.valueOf(i).getBytes();
        InetAddress ip = InetAddress.getLocalHost();

        DatagramPacket dp = new DatagramPacket(b, b.length, ip, 4899);
        ds.send(dp);

        byte[] data = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(data, data.length);
        ds.receive(dp1);

        String s = new String(dp1.getData());
        System.out.println("The computed data of cube of " + i + " from the server side is: " + s);
        sc.close();
    }
}
