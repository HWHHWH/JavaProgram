<%@ page language="java" import="java.util.*"
    pageEncoding="UTF-8"%>
<!-- 显示用户信息页面 -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<table cellpadding="0" cellspacing="0" width="90%" align="center">
	 <tr style="background-color: #cccccc;heignt:28px;">
	 	<th>用户名</th><th>密码</th><th>真实姓名</th><th>年龄</th><th>性别</th>
	 </tr>
 	 <tr>
 	 	<td><s:property value="#application.uname"/></td>
 	 	<td><s:property value="#application.upwd"/></td>
 	 	<td><s:property value="#application.name"/></td>
 	 	<td><s:property value="#application.age"/></td>
 	 	<td><s:property value="#application.sex"/></td>
 	 </tr>
</table>