package models;

public class User {
	private int id;
	private int age;
	private Role role;
	private LoginMessage loginMessage;
	
	public String toString(){
		return "用户信息--用户名："+loginMessage.getUsername()+",密码："+loginMessage.getPassword()+
				",年龄："+age+",角色："+role.getName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public LoginMessage getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(LoginMessage loginMessage) {
		this.loginMessage = loginMessage;
	}

	//SET GET方法
	
	
}
