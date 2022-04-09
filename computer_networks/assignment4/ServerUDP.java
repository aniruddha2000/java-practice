import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

public class ServerUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(4899);

        byte[] data = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data, data.length);
        ds.receive(dp);

        String str = new String(dp.getData());
        int num = Integer.parseInt(str.trim());
        int res = num * num * num;

        byte[] b = String.valueOf(res).getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(b, b.length, ip, dp.getPort());

        ds.send(dp1);
    }
}
