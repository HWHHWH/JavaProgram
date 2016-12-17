package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import models.User;

public class ByNameTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		User user=(User)ac.getBean("user");
		System.out.println(user);
	}

}

