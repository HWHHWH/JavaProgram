package server;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		InputStream is=null;
		OutputStream os=null;
		//�������ӷ�����
		Socket s=new Socket("localhost",6666);
		System.out.println("client started");
		//��������Ի�
		os=s.getOutputStream();
		is=s.getInputStream();
		DataOutputStream dos=new DataOutputStream(os);
		DataInputStream dis=new DataInputStream(is);
		//�ȸ�������������Ϣ
		dos.writeUTF("hello server");
		//���ȡ��������Ϣ
		String str=null;
		if((str=dis.readUTF())!=null){
			System.out.println(str);
		}
		//�ر���
		dos.flush();//
		dos.close();
		dis.close();
		os.close();
	}

}
