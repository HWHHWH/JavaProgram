<%@ page language="java" import="java.util.*"
    pageEncoding="UTF-8"%>
<!-- 用户登录信息页面 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="adduser" method="post" namespace="/">
	<s:textfield name="username" label="用户名" size="15"/>
	<s:password name="password" label="密码" size="15"/>
	<s:textfield name="name" label="姓名" size="15"/>
	<s:textfield name="age" label="年龄" size="15"/>
	<s:radio list="#{'男':'男','女':'女' }" name="sex" label="性别" listKey="key" 
	listValue="value"/>
	<s:submit value="添加用户" align="center"/>
</s:form>