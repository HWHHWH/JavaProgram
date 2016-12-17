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
			System.out.println("文件拷贝失败");
		}
	}
	//文件拷贝的方法
	public static void copyfile(String srcpath,String destpath) throws IOException{
		//建立联系
		File src=new File(srcpath);
		File dest=new File(destpath);
		//选择流
		InputStream is =new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		//建立数组
		byte[] data=new byte[1024];
		int len=0;
		//循环读取
		while(-1!=(len=is.read(data))){
			os.write(data, 0, len);
		}
		os.flush();
		os.close();//后开启的先关闭
		is.close();
		
	}

}
