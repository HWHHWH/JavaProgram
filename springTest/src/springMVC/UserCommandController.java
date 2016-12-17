package springMVC;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import models.LoginMessage;

//���������
public class UserCommandController extends AbstractCommandController{
	private String page;
	//������
	public UserCommandController() {
		setCommandClass(LoginMessage.class);//���������������
	}
	
	@Override//������handle
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		LoginMessage login=(LoginMessage)command;//��ȡ�û�����
		String username=login.getUsername();//��ȡ�û���
		String password=login.getPassword();//��ȡ����
		List list=new ArrayList();
		list.add(0,username);
		list.add(1,password);
		return new ModelAndView(getPage(), "info", list);
	}
	
	//set get ����
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	
}