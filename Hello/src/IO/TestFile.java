package IO;

import java.io.File;
import java.util.Arrays;

public class TestFile {
	public static void main(String[] args) {
		String parentpath="E:/";
		String name="IMG_4810.JPG";
		File file=new File(parentpath,name);
		System.out.println("文件名："+file.getName());
		System.out.println("文件路径："+file.getPath());
		System.out.println("上级目录"+file.getParent());
		System.out.println("文件的绝对路径"+file.getAbsolutePath());
		System.out.println("文件是否存在"+file.exists());
		System.out.println("文件是否可读"+file.canRead());
		System.out.println("文件是否可写"+file.canWrite());
		System.out.println("是否是文件"+file.isFile());
		System.out.println("是否是目录"+file.isDirectory());
		System.out.println("文件的大小是："+file.length()+"字节");
		System.out.println("-----------------分割线-------------------");
		//list查看文件列表
		String path="E:/HWH";
		File src=new File(path);
		if(src.isDirectory()){
			String[] list=src.list();
			for(String temp:list){
				System.out.println("目录下包含的文件有："+temp);
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		//递归打印文件名
		File filelist=new File("F:/简历");
		printName(filelist);//调用递归方法
		
		//输出盘符
		File[] roots=File.listRoots();
		System.out.println("输出盘符："+Arrays.toString(roots));
		
	}
	//递归打印文件名
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
