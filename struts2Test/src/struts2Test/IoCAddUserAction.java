package struts2Test;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

//ʹ��IoCֱ�ӷ���ServletAPI
public class IoCAddUserAction extends ActionSupport implements ServletRequestAware {

	private String username;
	private String password;
	private String name;
	private int age;
	private String sex;
	private HttpServletRequest request;//����request����
	private HttpSession session;//����session����
	private ServletContext application;//����application����

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;//��ȡrequest����
		this.session=request.getSession();//��ȡsession����
		this.application=session.getServletContext();//��ȡapplication����
	}
	
	//ʹ��IoCֱ�ӷ���ServletAPI
	@Override
	public String execute() throws Exception {
		//ʹ��application�����ȡ����
		application.setAttribute("uname", username);
		application.setAttribute("upwd", password);
		application.setAttribute("name", name);
		application.setAttribute("age", age);
		application.setAttribute("sex", sex);
		return SUCCESS;
	}
	
	//���Ե�set get����

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
