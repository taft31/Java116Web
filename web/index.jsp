<%--
  Created by IntelliJ IDEA.
  User: taft
  Date: 15/7/7
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <base href="<%=basePath%>"/>
    <title></title>
  </head>
  <body background="images/0010.jpg">
      <h1 align="center">欢迎使用116网上购物系统</h1>
      <a href="pages/login.jsp">登录</a><br/>
      <a href="pages/register.jsp">注册</a><br/>
  </body>
</html>
