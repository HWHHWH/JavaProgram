package IO;

import java.io.File;
import java.util.Arrays;

public class TestFile {
	public static void main(String[] args) {
		String parentpath="E:/";
		String name="IMG_4810.JPG";
		File file=new File(parentpath,name);
		System.out.println("�ļ�����"+file.getName());
		System.out.println("�ļ�·����"+file.getPath());
		System.out.println("�ϼ�Ŀ¼"+file.getParent());
		System.out.println("�ļ��ľ���·��"+file.getAbsolutePath());
		System.out.println("�ļ��Ƿ����"+file.exists());
		System.out.println("�ļ��Ƿ�ɶ�"+file.canRead());
		System.out.println("�ļ��Ƿ��д"+file.canWrite());
		System.out.println("�Ƿ����ļ�"+file.isFile());
		System.out.println("�Ƿ���Ŀ¼"+file.isDirectory());
		System.out.println("�ļ��Ĵ�С�ǣ�"+file.length()+"�ֽ�");
		System.out.println("-----------------�ָ���-------------------");
		//list�鿴�ļ��б�
		String path="E:/HWH";
		File src=new File(path);
		if(src.isDirectory()){
			String[] list=src.list();
			for(String temp:list){
				System.out.println("Ŀ¼�°������ļ��У�"+temp);
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		//�ݹ��ӡ�ļ���
		File filelist=new File("F:/����");
		printName(filelist);//���õݹ鷽��
		
		//����̷�
		File[] roots=File.listRoots();
		System.out.println("����̷���"+Arrays.toString(roots));
		
	}
	//�ݹ��ӡ�ļ���
	public static void printName(File sr){
		if(null==sr||!sr.exists()){
			return;
		}
		System.out.println(sr.getAbsolutePath());
		if(sr.isDirectory()){
			for(File sub:sr.listFiles()){
				printName(sub);
			}
		}
	}

}
