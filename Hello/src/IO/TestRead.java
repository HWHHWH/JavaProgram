package IO;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class TestRead {
	public static void main(String[] args) {
		//������ϵ
		File file=new File("F:/test.txt");
		//ѡ����
		Reader reader=null;
		try {
			reader = new FileReader(file);
			//��������
			char[] flush=new char[1024];
			int len;
			//ѭ����ȡ
			while(-1!=(len=reader.read(flush, 0, flush.length))){
				//���ַ�ת�����ַ���
				String str=new String(flush,0,len);
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("��ȡ�ļ�ʧ��");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (Exception e2) {
					System.out.println("�ر��ļ���ʧ��");
				}
			}
		}
	}

}
