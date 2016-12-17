package server;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		InputStream is=null;
		OutputStream os=null;
		//请求连接服务器
		Socket s=new Socket("localhost",6666);
		System.out.println("client started");
		//与服务器对话
		os=s.getOutputStream();
		is=s.getInputStream();
		DataOutputStream dos=new DataOutputStream(os);
		DataInputStream dis=new DataInputStream(is);
		//先给服务器发送信息
		dos.writeUTF("hello server");
		//后读取服务器信息
		String str=null;
		if((str=dis.readUTF())!=null){
			System.out.println(str);
		}
		//关闭流
		dos.flush();//
		dos.close();
		dis.close();
		os.close();
	}

}
