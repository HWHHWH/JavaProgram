package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {
	public static void main(String[] args) {
		//建立联系
		File file=new File("F:/test.txt");
		//选择流
		Writer wr=null;
		try {
			wr=new FileWriter(file);
			//建立数组
			String str="\n我是writertest";
			wr.write(str);//默认是覆盖已有的内容，除非构造器写 FileWriter（file，true）
			wr.append("\nappend是用来添加文件的");//在已有文件的基础上添加内容
			wr.append("\n我也是附加的");
			wr.flush();
			//循环写出
			
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
