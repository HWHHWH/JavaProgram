package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import models.Animal;
//����ע��
public class AnimalTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/bean.xml");
		Animal animal=(Animal)ctx.getBean("animal");
		animal.print();
	}
}
