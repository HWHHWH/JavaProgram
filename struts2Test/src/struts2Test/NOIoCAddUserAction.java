package struts2Test;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

//使用非IoC方式直接访问ServletAPI
public class NOIoCAddUserAction extends ActionSupport{
	private String username;
	private String password;
	private String name;
	private int age;
	private String sex;
	@Override
	public String execute() throws Exception {
		//使用非IoC方式直接访问ServletAPI
		//获取application对象
		ServletContext application=ServletActionContext.getServletContext();
		application.setAttribute("uname", username);
		application.setAttribute("upwd", password);
		application.setAttribute("name", name);
		application.setAttribute("age", age);
		application.setAttribute("sex", sex);
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
