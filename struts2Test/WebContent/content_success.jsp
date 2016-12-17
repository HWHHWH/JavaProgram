<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<table cellpadding="0" cellspacing="0" border="0" align="left">
	<tr style="line-height:30px;">
		<td style="font-size:14px;font-weight:bold;" align="left">
			对该书的评论
		</td>
	</tr>
	<tr>
		<td style="font-size:12px">
			评论人：<s:property value="name"/>
		</td>
	</tr>
	<tr>
		<td style="font-size:12px">
			评论正文：<s:property value="content"/>
		</td>
	</tr>
</table>