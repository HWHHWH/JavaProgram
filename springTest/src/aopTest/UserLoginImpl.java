package aopTest;

import interfaceSet.UserLogin;

public class UserLoginImpl implements UserLogin{
	@Override
	public void login(String username) {
		System.out.println(username+"���ڵ�¼ϵͳ��̨��");
	}

}