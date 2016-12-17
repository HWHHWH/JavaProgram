<%@ page language="java" import="java.util.*"
    pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!-- 注册页面 -->
<s:form action="login!executeReg.action" method="post">
	<s:textfield name="username" label="用户名"/>
	<s:password name="password" label="密码"/>
</s:form>
