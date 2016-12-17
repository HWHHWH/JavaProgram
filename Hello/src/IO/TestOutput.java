package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//字节输出流
public class TestOutput {
	public static void main(String[] args) throws IOException {
		//建立联系
		File file=new File("F:/test.txt");
		//选择流
		OutputStream os=null;
		try {
			os = new FileOutputStream(file, true);//true表示追加内容
			String str="\n我是做测试的\r\n";
			//字符串转成数组
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			os.flush();//强制刷新
		} catch (Exception e) {
			System.out.println("文件未找到");
		}finally{
			if(null!=os){
				os.close();//关闭资源
			}
		}
	}

}
