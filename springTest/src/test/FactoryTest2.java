package test;

import interfaceSet.Person2;
import models.PersonFactory;

public class FactoryTest2 {
	public static void main(String[] args) {
		//创建personfactory实例，获得工厂实例
		PersonFactory pf=new PersonFactory();
		//定义接口person实例，面向接口编程
		Person2 p=null;
		//使用工厂获得person实例
		p=pf.getPerson("japan");
		//调用person的接口
		System.out.println(p.sayHello("胡伟"));
		System.out.println(p.sayGoodBye("胡伟"));
		p=pf.getPerson("ame");
		System.out.println(p.sayHello("huwei"));
		System.out.println(p.sayGoodBye("huwei"));
	}

}
