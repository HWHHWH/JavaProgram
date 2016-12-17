package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		InputStream is=null;
		OutputStream os=null;
		//等待连接
		ServerSocket ss=new ServerSocket(6666);
		while(true){
			//接受连接
			Socket s=ss.accept();
			System.out.println("client connected");
			//与客户端对话
			is=s.getInputStream();
			os=s.getOutputStream();
			DataInputStream dis=new DataInputStream(is);
			DataOutputStream dos=new DataOutputStream(os);
			//先读取客户端信息
			String str=null;
			if((str=dis.readUTF())!=null){
				System.out.println(str);
				System.out.println("ip:"+s.getInetAddress());//客户端
				System.out.println("port:"+s.getPort());//客户端端口：随机分配
			}
			//后给客户端发送信息
			dos.writeUTF("hi,client");
			//关闭流
			dis.close();
			dos.close();
			s.close();
		}
		
	}

}
