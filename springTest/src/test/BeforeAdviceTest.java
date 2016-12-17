package test;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import aopTest.CheckUser;
import aopTest.UserLoginImpl;
import interfaceSet.UserLogin;

public class BeforeAdviceTest {
	public static void main(String[] args) {
		UserLogin target=new UserLoginImpl();//����ĵ�¼�û�
		BeforeAdvice advice=new CheckUser();//ǰ��֪ͨ
		ProxyFactory pf=new ProxyFactory();//spring������
		pf.setTarget(target);//���ô���Ŀ��
		pf.addAdvice(advice);//Ϊ����Ŀ�����ǰ��֪ͨ
		UserLogin proxy=(UserLogin)pf.getProxy();//���ɴ���ʵ��
		proxy.login("huweihuang");//���õ�¼����
	}
}
