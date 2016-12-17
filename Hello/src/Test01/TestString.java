package Test01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestString {
	public static void main(String[] args) {
	/*String s1=new String("ghnghjhgsmkjg");
	System.out.println(s1.length());
	System.out.println(s1.contains("hgds"));
	System.out.println(s1.substring(3, 6));
	StringBuilder s=new StringBuilder("1234567890");
	System.out.println(s.append("dfsg"));
	System.out.println(s.delete(2,3));
	System.out.println(s.deleteCharAt(2));
	System.out.println(s.insert(2,6));
	System.out.println(s.reverse());
	System.out.println(s.replace(6,8,"tbt  vgghg  "));
	System.out.println(s1.indexOf("j",6));
	*/
	DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date d=new Date();
	String str=df.format(d);
	System.out.println(str);
	
}
}
//StringBuilder StringBuffer