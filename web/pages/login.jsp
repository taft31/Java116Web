<%--
  Created by IntelliJ IDEA.
  User: taft
  Date: 15/7/7
  Time: 15:08
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
    <title>登录</title>
    <script src="js/jq_1_7_2.js" language="javascript"></script>
    <script language="JavaScript" type="text/javascript">
      $(function(){
        $("input[type=button]").click(function(){
          if("" == $.trim($("input[name=lName]").val())){
            alert("用户名未输入");
            return;
          }
          if("" == $.trim($("input[name=lPass]").val())){
            alert("密码未输入");
            return;
          }
          $("form").submit();
        });
      });

    </script>
</head>
<body>
  <form action="login" method="post">
    用户名：<input type="text" name="lName"/><br/>
    密  码：<input type="password" name="lPass"/><br/>
    <input type="button" value="登录"/>
  </form>

  <%String error = (String)request.getAttribute("error");
    if(error!=null){
  %>
    用户名或密码输入错误
  <%}%>
</body>
</html>
