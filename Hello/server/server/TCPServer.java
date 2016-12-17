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
		//�ȴ�����
		ServerSocket ss=new ServerSocket(6666);
		while(true){
			//��������
			Socket s=ss.accept();
			System.out.println("client connected");
			//��ͻ��˶Ի�
			is=s.getInputStream();
			os=s.getOutputStream();
			DataInputStream dis=new DataInputStream(is);
			DataOutputStream dos=new DataOutputStream(os);
			//�ȶ�ȡ�ͻ�����Ϣ
			String str=null;
			if((str=dis.readUTF())!=null){
				System.out.println(str);
				System.out.println("ip:"+s.getInetAddress());//�ͻ���
				System.out.println("port:"+s.getPort());//�ͻ��˶˿ڣ��������
			}
			//����ͻ��˷�����Ϣ
			dos.writeUTF("hi,client");
			//�ر���
			dis.close();
			dos.close();
			s.close();
		}
		
	}

}
