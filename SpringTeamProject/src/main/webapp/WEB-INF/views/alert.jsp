<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8"); %>


<%
	String msg = "잘못된 접근입니다!";
%>

<script>
	alert('<%=msg%>');
	location.href='../posts';
</script>