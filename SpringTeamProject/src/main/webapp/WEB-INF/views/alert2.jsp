<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8"); %>


<%
	String msg = "입찰 가격을 제대로 입력해주세요";
%>

<script>
	alert('<%=msg%>');
	location.href='posts';
</script>