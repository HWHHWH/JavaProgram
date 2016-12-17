package TestCollection;

import java.util.ArrayList;
import java.util.List;



public class TestSimple {
	
	//泛型方法
	public static <T> void test(T t){
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		
		//泛型
		List<String> list =new ArrayList<String>();
	 	list.add("sdafsg");
	    //System.out.println(list.get(0));
		
		//泛型类
		MyStudent<Integer> stu=new MyStudent<Integer>();
		stu.setScore(80);
		MyStudent<String> stu2=new MyStudent<>();
		stu2.setScore("优秀");
		System.out.println(stu.getScore());
		System.out.println(stu2.getScore());
		
		//
		
	}

}
