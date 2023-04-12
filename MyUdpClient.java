import java.util.*;
import java.io.*;
import java.net.*;

public class MyUdpClient {
	public static void main(String[] args) throws Exception {
		try {
		DatagramSocket ds = new DatagramSocket();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message :");
		String str = sc.nextLine();
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(), ip,1111);
		ds.send(dp);
		ds.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}