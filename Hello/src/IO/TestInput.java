package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//�ֽ�������
public class TestInput {
	public static void main(String[] args) {
		File file=new File("F:/test.txt");//�ļ���ַ
		InputStream is=null;//ѡ��������
		try {
			is =new FileInputStream(file);//������ϵ
			//����byte����
			byte[] car=new byte[1024];
			int len=0;
			//ѭ����ȡ
			while(-1!=(len=is.read(car, 0, car.length))){
				//������ַ�����ת�����ַ���
				String info=new String(car,0,len);
				System.out.println(info);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {			
			e.printStackTrace();
			System.out.println("��ȡ�ļ���ʧ��");
		}finally{
			try {//�ر���Դ
				if (null != is) {
					is.close();
				}
			} catch (Exception e2) {
			System.out.println("�ر��ļ���ʧ��");
			}
		}
	}

}
