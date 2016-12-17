<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript">
	function save(){
		myform.action="save.action";
		myform.submit();
	}
</script>
<!-- 邮件发送成功的标记 -->
<s:if test="sign==1">
	<font style="font-size:12px;color:red;">邮件发送成功</font>
</s:if>

<s:form action="message.action?sign=1" method="post" name="myform" namespace="/">
	<s:textfield name="name" label="收件人" cssStyle="width:500px;"/>
	<s:textfield name="title" label="主题" cssStyle="width:500px;"/>
	<s:textarea name="content" label="正文" rows="10" cols="68"/>
	<input type="submit" value="发送"/>
	<input type="button" value="存草稿" onclick="save()"/>
</s:form>