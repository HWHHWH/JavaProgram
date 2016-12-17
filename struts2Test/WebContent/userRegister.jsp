<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="regist/regist.action" method="post">
	<s:textfield name="username" label="用户名" size="15"/>
	<s:textfield name="password" label="密码" size="15"/> 
	<s:textfield name="spwd" label="确认密码" size="15"/>
	<s:textfield name="name" label="真实姓名" size="15"/>
	<s:submit type="iamge" src="images/logbtn.jpg"/>
</s:form>