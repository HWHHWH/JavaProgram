package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {
	public static void main(String[] args) {
		Person p1=new Person("刘德华",100);
		Person p2=new Person("梁朝伟",70);
		Person p3=new Person("周杰伦",60);
		Person p4=new Person("黄晓明",80);
		
		TreeMap<Person,String> persons=new TreeMap<Person,String>(
				//匿名内部类实现comparator接口
				new java.util.Comparator<Person>(){
					//重写比较方法
					@Override
					public int compare(Person o1, Person o2) {
						return -(o1.getHandsome()-o2.getHandsome());//降序
					}
					
				});
		
		persons.put(p1, "1");
		persons.put(p2, "1");
		persons.put(p3, "1");
		persons.put(p4, "1");
	
		Set<Person> keyperson=persons.keySet();
		 System.out.println(keyperson);
	}

}
