<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示用户信息</title>
</head>
<body>
<center>
<h1>用户信息</h1>
<s:if test="#request.userlist=null||#request.userlist.size()==0">没有任何员工信息
</s:if>
<s:else>
<table border="1" width="400">   <!--定义表格，定义的是表格的宽度为400个单元,border="1"是定义边框的属性,即1px-->

<tr>
<th>用户ID</th>
<th>用户名</th>
<th>密码</th>
<th>用户类型</th>
<th>是否删除</th>
<th>是否修改</th>
</tr>


<s:iterator value="#request.userlist">

<tr>
<td align="center">${id}</td>
<td align="center">${name}</td>
<td align="center">${password}</td>
<td align="center">${type}</td>
<td><a href="userdelede.action?id=${id}">删除</a></td>
<td><a href="update.jsp?id=${id}">更新</a></td>
</tr>


</s:iterator>

</table>
</s:else>
<br>
<a href="save.jsp">添加用户</a>
</center>
</body>
</html>