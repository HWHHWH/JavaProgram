package test;

import interfaceSet.Person2;
import models.PersonFactory;

public class FactoryTest2 {
	public static void main(String[] args) {
		//����personfactoryʵ������ù���ʵ��
		PersonFactory pf=new PersonFactory();
		//����ӿ�personʵ��������ӿڱ��
		Person2 p=null;
		//ʹ�ù������personʵ��
		p=pf.getPerson("japan");
		//����person�Ľӿ�
		System.out.println(p.sayHello("��ΰ"));
		System.out.println(p.sayGoodBye("��ΰ"));
		p=pf.getPerson("ame");
		System.out.println(p.sayHello("huwei"));
		System.out.println(p.sayGoodBye("huwei"));
	}

}
