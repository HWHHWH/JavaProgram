package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import interfaceSet.Person2;

public class FactoryTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/bean.xml");
		Person2 p=null;
		p=(Person2)ctx.getBean("japanese");
		System.out.println(p.sayHello("��ΰ��"));
		System.out.println(p.sayGoodBye("��ΰ��"));
		
		p=(Person2)ctx.getBean("american");
		System.out.println(p.sayHello("huweihuang"));
		System.out.println(p.sayGoodBye("huweihuang"));
		
	}

}
