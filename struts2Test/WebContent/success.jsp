<%@ page language="java" import="java.util.*"
    pageEncoding="UTF-8"%>


<%@taglib prefix="s" uri="/struts-tags" %>

	<s:if test="#session.username==null">
		<font color:"red">您还未登录，请登录</font>
		<s:a href="login.action" namespace="/">登录</s:a>
	</s:if>
	<s:else>
		欢迎您：<s:property value="#session.username"/>
	</s:else>
	
	<!-- redirect类型的success页面 -->
	<%-- 用户名：<s:property value="%{#parameters.username}"/>
	<br/><br/>
	密码：<s:property value="%{#parameters.password}"/> --%>

	<!-- 普通的success页面 -->
	<%-- 用户名：<s:property value="username"/>
	<br/><br/>
	密码：<s:property value="password"/> --%>
	