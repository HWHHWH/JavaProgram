package struts2Test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//邮件类
public class MessageAction extends ActionSupport{
	private String name;//收件人
	private String title;//邮件主题
	private String content;//文件内容
	private int sign;//标记邮件发送成功
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	//草稿箱方法
	public String save(){
		 ActionContext ac=ActionContext.getContext();
		 ac.getSession().put("name", name);
		 ac.getSession().put("title", title);
		 ac.getSession().put("content", content);
		 return "save";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int sign) {
		this.sign = sign;
	}
	
	//set get
	
	
}
