package aopTest;

import interfaceSet.UserLogin;

public class UserLoginImpl implements UserLogin{
	@Override
	public void login(String username) {
		System.out.println(username+"正在登录系统后台！");
	}

}
