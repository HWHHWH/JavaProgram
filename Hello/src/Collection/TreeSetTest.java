package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Person p1=new Person("刘德华",100);
		Person p2=new Person("梁朝伟",70);
		Person p3=new Person("周杰伦",60);
		Person p4=new Person("黄晓明",80);
		
		TreeSet<Person> persons=new TreeSet<Person>(
				//匿名内部类实现comparator接口
				new java.util.Comparator<Person>(){
					//重写比较方法
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getHandsome()-o2.getHandsome();//升序
					}
					
				});
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
	
		System.out.println(persons);
	}

}
