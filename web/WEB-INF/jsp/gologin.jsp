<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/4
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <script type="text/javascript" src="static/js/alter.js"></script>
</head>
<body onunload="showInfo()">
 ${Mgs}
    <form action="goUserLogin" method="post" >
       用户名 <input type="text" name="uname">
       密码 <input type="password" name="upwd">
        <input type="submit" value="确定">
    </form>
</body>
</html>
