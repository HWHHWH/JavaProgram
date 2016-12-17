package struts2Test;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

//使用IoC直接访问ServletAPI
public class IoCAddUserAction extends ActionSupport implements ServletRequestAware {

	private String username;
	private String password;
	private String name;
	private int age;
	private String sex;
	private HttpServletRequest request;//定义request对象
	private HttpSession session;//定义session对象
	private ServletContext application;//定义application对象

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;//获取request对象
		this.session=request.getSession();//获取session对象
		this.application=session.getServletContext();//获取application对象
	}
	
	//使用IoC直接访问ServletAPI
	@Override
	public String execute() throws Exception {
		//使用application对象读取属性
		application.setAttribute("uname", username);
		application.setAttribute("upwd", password);
		application.setAttribute("name", name);
		application.setAttribute("age", age);
		application.setAttribute("sex", sex);
		return SUCCESS;
	}
	
	//属性的set get方法

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
