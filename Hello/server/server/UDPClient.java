package server;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {
	public static void main(String[] args) throws IOException {
		long n=100000L;
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		dos.writeLong(n);
		
		byte[] buf=baos.toByteArray();
		DatagramPacket dp=new DatagramPacket(buf, buf.length,
				new InetSocketAddress("localhost",8888));
		DatagramSocket ds=new DatagramSocket(9999);
		ds.send(dp);
		ds.close();
	}

}
