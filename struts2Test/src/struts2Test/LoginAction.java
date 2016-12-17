package struts2Test;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//创建业务控制器LoginAction类
public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	//登录成功要执行的方法
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	//会员注册要执行的方法
	public String register(){
		return "regist";
	}
	//处理会员注册信息，注册成功跳转到登录成功页面
	public String executeReg(){
		return SUCCESS;
	}
	
	//将用户的登录信息保存到session对象中	
	public String login(){
		if("admin".equals(username.trim())){
			ActionContext ac=ActionContext.getContext();
			ac.getSession().put("username", username);
			return SUCCESS;
		}else{
			this.addFieldError("username", "用户名/密码错误");
			return LOGIN;
		}
	}
		
//		//对用户输入的用户名和密码进行判断，如果正确就返回success字符串
//		if(username.equals("admin")&&password.equals("hwh")){
//			return SUCCESS;//SUCCESS是Action接口中的一个常量，值为success字符串
//		}
//		else{
//			return INPUT;//INPUT是Action接口中的一个常量，值为input字符串
//		}

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
	
	
}
