<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>个性推荐课程</title>
    <%@include file="/WEB-INF/jsp/common.jsp"%>
    <style>
        /*解决LayUI数据表格复选框不居中显示的问题*/
        .layui-table-cell .layui-form-checkbox[lay-skin="primary"] {
            top: 50%;
            transform: translateY(-50%);
        }
    </style>
</head>
<body>
<div class="container">
    <h1>个性推荐课程</h1>
    <table class="layui-table">
        <thead>
        <tr>
            <th>课程名称</th>
            <th>课程简介</th>
            <th>个性推荐理由</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>C++程序设计语言</td>
            <td>本课程介绍C++语言的基础语法，让学生了解面向对象的程序设计思想</td>
            <td>适合对面向对象编程感兴趣的学生</td>
        </tr>
        <tr>
            <td>数据结构与算法</td>
            <td>数据结构是计算机科学的一门非常重要的专业基础课</td>
            <td>适合喜欢解决复杂问题和优化算法的学生</td>
        </tr>
        <tr>
            <td>计算机网络</td>
            <td>计算机专业学生必修的一门专业基础课和核心课程</td>
            <td>适合对网络通信和互联网技术感兴趣的学生</td>
        </tr>
        <tr>
            <td>人工智能导论</td>
            <td>介绍人工智能的基本概念、方法和应用</td>
            <td>适合对人工智能技术和机器学习感兴趣的学生</td>
        </tr>
        <tr>
            <td>Web开发基础</td>
            <td>学习Web开发的基本知识和技术，包括HTML、CSS和JavaScript等</td>
            <td>适合对Web开发和前端技术感兴趣的学生</td>
        </tr>
        <tr>
            <td>数据库设计与管理</td>
            <td>学习数据库的设计原理、SQL语言和数据库管理技术</td>
            <td>适合对数据库和数据管理感兴趣的学生</td>
        </tr>
        <!-- 添加更多推荐课程 -->
        </tbody>
    </table>
</div>
</body>
</html>