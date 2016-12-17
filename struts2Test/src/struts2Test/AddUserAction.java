package struts2Test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//ʵ������û���Ϣ����
@SuppressWarnings("serial")
public class AddUserAction extends ActionSupport{
	private String username;//�û���
	private String password;//����
	private String name;//����
	private int age;//����
	private String sex;//�Ա�
	
	
	@Override
	public String execute() throws Exception {
		//ʹ��ActionContext��ӷ���ServletAPI
		ActionContext ac=ActionContext.getContext();
		ac.getApplication().put("uname", username);
		ac.getApplication().put("upwd", password);
		ac.getApplication().put("name", name);
		ac.getApplication().put("age", age);
		ac.getApplication().put("sex", sex);
		return SUCCESS;
	}
	
	
	//set get����
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	

}
