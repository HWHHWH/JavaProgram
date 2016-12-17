package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import interfaceSet.Person;

public class BeanTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/bean.xml");
		Person p=(Person)ctx.getBean("chinese");
		p.useAxe();
	}

}
