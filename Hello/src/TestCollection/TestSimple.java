package TestCollection;

import java.util.ArrayList;
import java.util.List;



public class TestSimple {
	
	//���ͷ���
	public static <T> void test(T t){
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		
		//����
		List<String> list =new ArrayList<String>();
	 	list.add("sdafsg");
	    //System.out.println(list.get(0));
		
		//������
		MyStudent<Integer> stu=new MyStudent<Integer>();
		stu.setScore(80);
		MyStudent<String> stu2=new MyStudent<>();
		stu2.setScore("����");
		System.out.println(stu.getScore());
		System.out.println(stu2.getScore());
		
		//
		
	}

}
