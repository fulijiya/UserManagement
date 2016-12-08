<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
<center>
<s:form action="user" method="post">
<tr>
<td colspan="2" align="center">                      <!-- 将2个表格合并，删除原 -->
<h1><s:text name="欢迎注册"/></h1><br>
<s:property value="exception.message"/>
</td>
</tr>

<s:textfield name="user.name" key="用户名" tooltip="Enter your name!"></s:textfield>
<s:textfield name="user.password" key="密码" tooltip="Enter your password!"></s:textfield>
<s:textfield name="user.type" key="类型" tooltip="Enter your type!"></s:textfield>
<s:submit value="提交"/>
<s:set/>
</s:form>

</center>
</body>
</html>