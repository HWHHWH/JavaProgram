package actions;

import com.opensymphony.xwork2.ActionSupport;
//�û��������۵�action��
public class ContentAction extends ActionSupport{
	private String name;//������
	private String content;//��������
	//
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	//set get ����
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
