package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//字节输入流
public class TestInput {
	public static void main(String[] args) {
		File file=new File("F:/test.txt");//文件地址
		InputStream is=null;//选择流创建
		try {
			is =new FileInputStream(file);//建立联系
			//建立byte数组
			byte[] car=new byte[1024];
			int len=0;
			//循环读取
			while(-1!=(len=is.read(car, 0, car.length))){
				//输出：字符数组转换成字符串
				String info=new String(car,0,len);
				System.out.println(info);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {			
			e.printStackTrace();
			System.out.println("读取文件夹失败");
		}finally{
			try {//关闭资源
				if (null != is) {
					is.close();
				}
			} catch (Exception e2) {
			System.out.println("关闭文件流失败");
			}
		}
	}

}
