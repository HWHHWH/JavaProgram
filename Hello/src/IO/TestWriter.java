package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {
	public static void main(String[] args) {
		//������ϵ
		File file=new File("F:/test.txt");
		//ѡ����
		Writer wr=null;
		try {
			wr=new FileWriter(file);
			//��������
			String str="\n����writertest";
			wr.write(str);//Ĭ���Ǹ������е����ݣ����ǹ�����д FileWriter��file��true��
			wr.append("\nappend����������ļ���");//�������ļ��Ļ������������
			wr.append("\n��Ҳ�Ǹ��ӵ�");
			wr.flush();
			//ѭ��д��
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=wr){
				try {
					wr.close();
				} catch (Exception e2) {
				}
			}
		}
	}

}
