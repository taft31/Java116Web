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
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>注册页面</title>
    <script src="js/jq_1_7_2.js" language="JavaScript"></script>
    <script type="text/javascript">
        $(function () {
            $("input[name=userName]").focus(function () {
                $("#sp1").css("color", "white").text("");
                $("input[value=注册]").attr("disabled",false);
            });
            $("input[name=userName]").blur(function () {
                if ("" == $.trim($("input[name=userName]").val())) {
                    alert("用户名未输入");
                    return;
                } else {
                    $.ajax({
                        url: 'register',
                        type: 'post',
                        data: {
                            check: 'check',
                            userName: $("input[name=userName]").val()
                        },
                        success: function (sdt) {
                            var cc = $.trim(sdt);
                            if (cc == "用户名可用") {
                                $("#sp1").css("color", "green").text("用户名可用");
                            } else {
                                $("#sp1").css("color", "red").text("用户名不可用");
                                $("input[value=注册]").attr("disabled",true);
                            }
                        },
                        error: function () {
                            alert("校验用户名失败");
                        }

                    });
                }

            });
            $("input[value=注册]").click(
                    function () {
                        if ("" == $.trim($("input[name=userName]").val())) {
                            alert("用户名未输入");
                            return;
                        }
                        if ("" == $.trim($("input[name=userPass]").val())) {
                            alert("密码未输入");
                            return;
                        }
                        if ($.trim($("input[name=userPass2]").val()) != $.trim($(
                                        "input[name=userPass]").val())) {
                            alert("两次输入的密码不一样");
                            return;
                        } else {
                            $.ajax({
                                url: 'register',
                                type: 'post',
                                data: {
                                    userName: $("input[name=userName]").val(),
                                    userPass: $("input[name=userPass2]").val()
                                },
                                success: function (sdt) {
                                    var cc = Number(sdt);
                                    if (cc == 1) {
                                        alert("注册成功，5秒后跳转到登录页面");
                                        window.location.href = "pages/login.jsp";
                                    } else {
                                        alert("注册失败");
                                    }
                                },
                                error: function () {
                                    alert("提交注册失败失败");
                                }

                            });
                        }
                    });

        });
    </script>
</head>

<body>
<form action="login" method="post">
    用户名： <input type="text" name="userName"><span id="sp1"></span><br/>
    密 码： <input type="password" name="userPass"><br/>
    确认密码： <input type="password" name="userPass2"> <br/>
    <input type="button" value="注册"/>
    <input type="reset" value="重置"/>
    <a href="../login.jsp">返回登录</a>
</form>
</body>
</html>