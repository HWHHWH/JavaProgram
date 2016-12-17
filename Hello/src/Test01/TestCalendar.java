package Test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期：格式如2015-11-16");
		Scanner scanner=new Scanner(System.in);
		String temp=scanner.nextLine();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");//定义日期格式
		try {
			Date date=format.parse(temp);//解析字符串文本生成日期格式
			Calendar calendar=new GregorianCalendar();
			calendar.setTime(date);           // 使用给定的 Date 设置此 Calendar 的时间
			int day=calendar.get(Calendar.DATE);//获取当前日期
			calendar.set(Calendar.DATE, 1);      //设置当前日期为1号
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//表示1号是周几，数字减一【1代表周日】
			System.out.println("该月的最大天数："+calendar.getActualMaximum(Calendar.DATE));//该月的最大天数
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			int maxDate=calendar.getActualMaximum(Calendar.DATE);
			for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
				System.out.print('\t');
			}
			
			//System.out.println();
			for(int i=1;i<=maxDate;i++){
				if( i==day){
					System.out.print("*");//标记当前日期
				}
				System.out.print(i+"\t");
				int w=calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY){  //逢周六换行
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);//当前日期+1
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				scanner.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//关闭资源
		}
		
		
	}
}
