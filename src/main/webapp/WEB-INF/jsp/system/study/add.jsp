<%@ page import="com.jubilantz.services.impl.EasHomeWorkServiceImpl" %>
<%@ page import="com.jubilantz.entity.EasHomeWork" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/3/18
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>个性推荐课程</title>
    <%@ include file="/WEB-INF/jsp/common.jsp"%>
    <style>
        /* 解决LayUI数据表格复选框不居中显示的问题 */
        .layui-table-cell .layui-form-checkbox[lay-skin="primary"] {
            top: 50%;
            transform: translateY(-50%);
        }

        /* 表格样式 */
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>学生ID</th>
        <th>教师ID</th>
        <th>作业路径</th>
        <th>作业分数</th>
        <th>作业名称</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${homeworkList}" var="homework">
        <tr>
            <td>${homework.id}</td>
            <td>${homework.stuid}</td>
            <td>${homework.teaid}</td>
            <td>${homework.workpath}</td>
            <td>${homework.workscore}</td>
            <td>${homework.workname}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>