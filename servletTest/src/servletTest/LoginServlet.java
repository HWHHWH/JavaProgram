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
	//全局变量
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
		System.out.println("正在接受请求");
		System.out.println("request的地址是："+request);
		
		//getParameter获取参数的名字和参数值，只能获取单一单数
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		System.out.println("用户名是："+user+"  密码是："+password);
		
		//获取web初始化参数
		ServletContext servletContext=servletConfig.getServletContext();
		String initUser=servletContext.getInitParameter("user");
		String ininPassword=servletContext.getInitParameter("password");
		System.out.println("web初始化user是："+initUser);
		System.out.println("web初始化password是："+ininPassword);
		System.out.println("--->"+servletContext);
		//
		PrintWriter out=response.getWriter();
		if(initUser.equals(user)&&ininPassword.equals(password)){
			out.print("hello  "+user);
		}else{
			out.println("sorry  "+user);
		}
		
		//getParameterValues获取列表参数名字和参数值
		String[] interests=request.getParameterValues("insteresting");
		System.out.println("兴趣是：");
		for(String insterest:interests){
			System.out.println(insterest);
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		//
		Enumeration<String> names=request.getParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement();
			String val=request.getParameter(name);
			System.out.println("名称是："+name+"；"+"值是："+val);
		}
		//
		Map<String, String[]> map=request.getParameterMap();
		for(Map.Entry<String, String[]> entry:map.entrySet()){
			System.out.println(""+entry.getKey()+Arrays.asList(entry.getValue()));
		}
				
		
		//获取请求提交的方式
		System.out.println("获取请求的方式是："+httpServletRequest.getMethod());
		
		//++++++++++++++++++++++++++++++++++||response||+++++++++++++++++++++++++++++++++++++
		
		//设置响应类型
		//response.setContentType("application/msword");
		
		//response的response.getWriter()方法
//		PrintWriter outPut=response.getWriter();
//		outPut.println("test response.getWriter()");
		
		
	}


}
