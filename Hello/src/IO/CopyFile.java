package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	
	public static void main(String[] args) {
		String srcpath="F:/test.txt";
		String destpath="F:/testcopy.txt";
		try {
			copyfile(srcpath, destpath);
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ��");
		}
	}
	//�ļ������ķ���
	public static void copyfile(String srcpath,String destpath) throws IOException{
		//������ϵ
		File src=new File(srcpath);
		File dest=new File(destpath);
		//ѡ����
		InputStream is =new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		//��������
		byte[] data=new byte[1024];
		int len=0;
		//ѭ����ȡ
		while(-1!=(len=is.read(data))){
			os.write(data, 0, len);
		}
		os.flush();
		os.close();//�������ȹر�
		is.close();
		
	}

}
