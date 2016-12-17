package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Person p1=new Person("���»�",100);
		Person p2=new Person("����ΰ",70);
		Person p3=new Person("�ܽ���",60);
		Person p4=new Person("������",80);
		
		TreeSet<Person> persons=new TreeSet<Person>(
				//�����ڲ���ʵ��comparator�ӿ�
				new java.util.Comparator<Person>(){
					//��д�ȽϷ���
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getHandsome()-o2.getHandsome();//����
					}
					
				});
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
	
		System.out.println(persons);
	}

}
