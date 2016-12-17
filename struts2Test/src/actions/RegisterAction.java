package actions;



import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

//ʹ��ע������Action û��ʹ��struts.xml����
@ParentPackage(value="struts-default")
@Namespace("/regist")
@Action(
		value="regist",//Action������
		results={//result
				@Result(location="/registSuccess.jsp"),
				@Result(name="input",location="/userRegister.jsp")
		}
)

public class RegisterAction extends ActionSupport{
	private String username;
	private String password;
	private String spwd;//ȷ������
	private String name;//��ʵ����
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	
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
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
}