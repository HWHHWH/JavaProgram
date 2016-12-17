package servletTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.runtime.HttpJspBase;

public class LoginServlet implements Servlet{

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}
	//ȫ�ֱ���
	private ServletConfig servletConfig;
	
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		this.servletConfig=servletConfig;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//+++++++++++++++++++++++++++++++++++++||request||+++++++++++++++++++++++++++++++++++
		
		HttpServletRequest httpServletRequest=(HttpServletRequest)request;
		httpServletRequest.setCharacterEncoding("UTF-8");
		System.out.println("���ڽ�������");
		System.out.println("request�ĵ�ַ�ǣ�"+request);
		
		//getParameter��ȡ���������ֺͲ���ֵ��ֻ�ܻ�ȡ��һ����
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		System.out.println("�û����ǣ�"+user+"  �����ǣ�"+password);
		
		//��ȡweb��ʼ������
		ServletContext servletContext=servletConfig.getServletContext();
		String initUser=servletContext.getInitParameter("user");
		String ininPassword=servletContext.getInitParameter("password");
		System.out.println("web��ʼ��user�ǣ�"+initUser);
		System.out.println("web��ʼ��password�ǣ�"+ininPassword);
		System.out.println("--->"+servletContext);
		//
		PrintWriter out=response.getWriter();
		if(initUser.equals(user)&&ininPassword.equals(password)){
			out.print("hello  "+user);
		}else{
			out.println("sorry  "+user);
		}
		
		//getParameterValues��ȡ�б�������ֺͲ���ֵ
		String[] interests=request.getParameterValues("insteresting");
		System.out.println("��Ȥ�ǣ�");
		for(String insterest:interests){
			System.out.println(insterest);
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		//
		Enumeration<String> names=request.getParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement();
			String val=request.getParameter(name);
			System.out.println("�����ǣ�"+name+"��"+"ֵ�ǣ�"+val);
		}
		//
		Map<String, String[]> map=request.getParameterMap();
		for(Map.Entry<String, String[]> entry:map.entrySet()){
			System.out.println(""+entry.getKey()+Arrays.asList(entry.getValue()));
		}
				
		
		//��ȡ�����ύ�ķ�ʽ
		System.out.println("��ȡ����ķ�ʽ�ǣ�"+httpServletRequest.getMethod());
		
		//++++++++++++++++++++++++++++++++++||response||+++++++++++++++++++++++++++++++++++++
		
		//������Ӧ����
		//response.setContentType("application/msword");
		
		//response��response.getWriter()����
//		PrintWriter outPut=response.getWriter();
//		outPut.println("test response.getWriter()");
		
		
	}


}
