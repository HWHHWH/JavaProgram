<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="content.action" method="post">
	<s:textfield name="name" label="评论人" size="18"/>
	<s:textarea name="content" label="评论内容" cols="80" rows="10"/>
	<s:checkbox name="arr" label="我已阅读并同意该社区条款"/>
	<s:submit type="image" src="images/logbtn.jpg" align="center"/>
</s:form>
