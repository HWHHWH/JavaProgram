package test;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import aopTest.CheckUser;
import aopTest.UserLoginImpl;
import interfaceSet.UserLogin;

public class BeforeAdviceTest {
	public static void main(String[] args) {
		UserLogin target=new UserLoginImpl();//具体的登录用户
		BeforeAdvice advice=new CheckUser();//前置通知
		ProxyFactory pf=new ProxyFactory();//spring代理工厂
		pf.setTarget(target);//设置代理目标
		pf.addAdvice(advice);//为代理目标添加前置通知
		UserLogin proxy=(UserLogin)pf.getProxy();//生成代理实例
		proxy.login("huweihuang");//调用登录方法
	}
}
