package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//�ֽ������
public class TestOutput {
	public static void main(String[] args) throws IOException {
		//������ϵ
		File file=new File("F:/test.txt");
		//ѡ����
		OutputStream os=null;
		try {
			os = new FileOutputStream(file, true);//true��ʾ׷������
			String str="\n���������Ե�\r\n";
			//�ַ���ת������
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			os.flush();//ǿ��ˢ��
		} catch (Exception e) {
			System.out.println("�ļ�δ�ҵ�");
		}finally{
			if(null!=os){
				os.close();//�ر���Դ
			}
		}
	}

}
