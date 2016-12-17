<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

		<table cellpading="0" cellspacing="0" border="0" width="100%">
			<tr>
				<td>
					草稿箱
				</td>
			</tr>
			<tr><td>收件人：</td><td><s:property value="#session.name"/></td></tr>
			<tr><td>主题：</td><td><s:property value="#session.title"/></td></tr>
			<tr><td>正文：</td><td><s:property value="#session.content"/></td></tr>
		</table>
