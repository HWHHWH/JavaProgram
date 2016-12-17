package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {
	public static void main(String[] args) {
		Person p1=new Person("���»�",100);
		Person p2=new Person("����ΰ",70);
		Person p3=new Person("�ܽ���",60);
		Person p4=new Person("������",80);
		
		TreeMap<Person,String> persons=new TreeMap<Person,String>(
				//�����ڲ���ʵ��comparator�ӿ�
				new java.util.Comparator<Person>(){
					//��д�ȽϷ���
					@Override
					public int compare(Person o1, Person o2) {
						return -(o1.getHandsome()-o2.getHandsome());//����
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
