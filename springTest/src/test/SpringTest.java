package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import interfaceSet.Person;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/bean.xml");
		Person p1=null;
		p1=(Person)ctx.getBean("chinese");
		Person p2=null;
		p2=(Person)ctx.getBean("chinese");
		System.out.println(p1==p2);//表示是单例模式
	}

}
