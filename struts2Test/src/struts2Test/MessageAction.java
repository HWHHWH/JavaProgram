package struts2Test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//�ʼ���
public class MessageAction extends ActionSupport{
	private String name;//�ռ���
	private String title;//�ʼ�����
	private String content;//�ļ�����
	private int sign;//����ʼ����ͳɹ�
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	//�ݸ��䷽��
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
