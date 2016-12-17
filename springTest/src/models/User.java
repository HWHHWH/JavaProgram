package models;

public class User {
	private int id;
	private int age;
	private Role role;
	private LoginMessage loginMessage;
	
	public String toString(){
		return "�û���Ϣ--�û�����"+loginMessage.getUsername()+",���룺"+loginMessage.getPassword()+
				",���䣺"+age+",��ɫ��"+role.getName();
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

	//SET GET����
	
	
}
