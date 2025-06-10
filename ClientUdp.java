import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.util.Scanner; 
 
public class ClientUdp { 
    public static void main(String[] args) throws IOException { 
        DatagramSocket ds = new DatagramSocket(); 
        InetAddress ip = InetAddress.getLocalHost(); 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter messages to send to the server. Type 'bye' to quit."); 
 
        while (true) { 
            System.out.print("Your message: "); 
            String inp = scanner.nextLine(); 
 
            byte[] buf = inp.getBytes(); 
            DatagramPacket dpSend = new DatagramPacket(buf, buf.length, ip, 1234); 
            ds.send(dpSend); 
 
            if ("bye".equalsIgnoreCase(inp)) { 
                System.out.println("Sent 'bye' to server. Closing client."); 
                break; 
            } 
        } 
 
        scanner.close(); 
        ds.close(); 
    } 
} 