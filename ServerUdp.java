mport java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
public class ServerUdp { 
public static void main(String[] args) throws IOException { 
DatagramSocket ds = new DatagramSocket(1234); 
byte[] receive = new byte[65535]; 
 
        DatagramPacket dpReceive = new DatagramPacket(receive, receive.length); 
        System.out.println("Server is waiting for a message from client..."); 
        ds.receive(dpReceive); 
 
        String message = data(dpReceive.getData()).toString(); 
        System.out.println("Client says: " + message); 
 
        ds.close(); 
        System.out.println("Server exiting after receiving the message."); 
    } 
 
    public static StringBuilder data(byte[] a) { 
        if (a == null) { 
            return null; 
        } 
 
        StringBuilder sb = new StringBuilder(); 
        int i = 0; 
        while (i < a.length && a[i] != 0) { 
            sb.append((char) a[i]); 
            i++; 
        } 
 
        return sb; 
    } 
}