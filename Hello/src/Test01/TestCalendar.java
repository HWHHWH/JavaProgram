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
		System.out.println("���������ڣ���ʽ��2015-11-16");
		Scanner scanner=new Scanner(System.in);
		String temp=scanner.nextLine();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
		try {
			Date date=format.parse(temp);//�����ַ����ı��������ڸ�ʽ
			Calendar calendar=new GregorianCalendar();
			calendar.setTime(date);           // ʹ�ø����� Date ���ô� Calendar ��ʱ��
			int day=calendar.get(Calendar.DATE);//��ȡ��ǰ����
			calendar.set(Calendar.DATE, 1);      //���õ�ǰ����Ϊ1��
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//��ʾ1�����ܼ������ּ�һ��1�������ա�
			System.out.println("���µ����������"+calendar.getActualMaximum(Calendar.DATE));//���µ��������
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			int maxDate=calendar.getActualMaximum(Calendar.DATE);
			for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
				System.out.print('\t');
			}
			
			//System.out.println();
			for(int i=1;i<=maxDate;i++){
				if( i==day){
					System.out.print("*");//��ǵ�ǰ����
				}
				System.out.print(i+"\t");
				int w=calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY){  //����������
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);//��ǰ����+1
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
			}//�ر���Դ
		}
		
		
	}
}
