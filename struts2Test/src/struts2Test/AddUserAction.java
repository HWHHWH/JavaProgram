package struts2Test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//实现添加用户信息的类
@SuppressWarnings("serial")
public class AddUserAction extends ActionSupport{
	private String username;//用户名
	private String password;//密码
	private String name;//姓名
	private int age;//年龄
	private String sex;//性别
	
	
	@Override
	public String execute() throws Exception {
		//使用ActionContext间接访问ServletAPI
		ActionContext ac=ActionContext.getContext();
		ac.getApplication().put("uname", username);
		ac.getApplication().put("upwd", password);
		ac.getApplication().put("name", name);
		ac.getApplication().put("age", age);
		ac.getApplication().put("sex", sex);
		return SUCCESS;
	}
	
	
	//set get方法
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
