package actions;

import com.opensymphony.xwork2.ActionSupport;
//用户发表评论的action类
public class ContentAction extends ActionSupport{
	private String name;//评论人
	private String content;//评论内容
	//
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	//set get 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
