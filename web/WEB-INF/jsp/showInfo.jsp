<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/4
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户操作界面</title>
</head>
<body>
    <h1>${Msg}欢迎您</h1><br/>

    <form action="" method="post">
        <table border="1">
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>爱好</td>
            </tr>
            <c:forEach items="${selectLimitDept}" var="deptList" varStatus="s">
                <tr>
                    <td>${deptList.did}</td>
                    <td>${deptList.dname}</td>
                    <td>${deptList.dhobby}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
    <c:if test="${(pageUtils.index)>1}">
        <a href="getSelectLimitShow?index=1">首页</a>
        <a href="getSelectLimitShow?index=${pageUtils.index-1}">上一页</a>
    </c:if>
    <c:if test="${(pageUtils.index)<(pageUtils.totalPages)}">
    <a href="getSelectLimitShow?index=${pageUtils.index+1}">下一页</a>
    <a href="getSelectLimitShow?index=${pageUtils.totalPages}">末页</a>
    </c:if>
</body>
</html>
