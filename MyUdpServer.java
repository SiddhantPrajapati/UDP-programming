import java.util.*;
import java.io.*;
import java.net.*;

public class MyUdpServer {
	public static void main(String[] args) throws Exception {
		System.out.println("Waiting for Client");
		try {
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramSocket ds = new DatagramSocket(1111);
		byte []data = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(data , 1024);
		ds.receive(dp);
		
		String str = new String(dp.getData(), 0, dp.getLength());
		System.out.println(str);
		ds.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
		
		
		