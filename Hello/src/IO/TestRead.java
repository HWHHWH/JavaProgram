package IO;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class TestRead {
	public static void main(String[] args) {
		//建立联系
		File file=new File("F:/test.txt");
		//选择流
		Reader reader=null;
		try {
			reader = new FileReader(file);
			//建立数组
			char[] flush=new char[1024];
			int len;
			//循环读取
			while(-1!=(len=reader.read(flush, 0, flush.length))){
				//将字符转换成字符串
				String str=new String(flush,0,len);
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("读取文件失败");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (Exception e2) {
					System.out.println("关闭文件流失败");
				}
			}
		}
	}

}
