package struts2Test;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//����ҵ�������LoginAction��
public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	//��¼�ɹ�Ҫִ�еķ���
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	//��Աע��Ҫִ�еķ���
	public String register(){
		return "regist";
	}
	//�����Աע����Ϣ��ע��ɹ���ת����¼�ɹ�ҳ��
	public String executeReg(){
		return SUCCESS;
	}
	
	//���û��ĵ�¼��Ϣ���浽session������	
	public String login(){
		if("admin".equals(username.trim())){
			ActionContext ac=ActionContext.getContext();
			ac.getSession().put("username", username);
			return SUCCESS;
		}else{
			this.addFieldError("username", "�û���/�������");
			return LOGIN;
		}
	}
		
//		//���û�������û�������������жϣ������ȷ�ͷ���success�ַ���
//		if(username.equals("admin")&&password.equals("hwh")){
//			return SUCCESS;//SUCCESS��Action�ӿ��е�һ��������ֵΪsuccess�ַ���
//		}
//		else{
//			return INPUT;//INPUT��Action�ӿ��е�һ��������ֵΪinput�ַ���
//		}

	//set get����
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
