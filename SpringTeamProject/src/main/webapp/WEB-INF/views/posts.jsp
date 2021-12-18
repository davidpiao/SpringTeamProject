<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.com.myapp.dao.BoardDAO, com.com.myapp.bean.BoardVO,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>경매장 메인 페이지</title>
<style>
body {
    background-image: url("https://www.qgiv.com/blog/wp-content/uploads/2019/07/Bids.png");
    background-repeat: no-repeat;
    background-size: 100% 300%; 
}
#list {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#list td, #list th {
  border: 1px solid #ddd;
  padding: 8px;
  text-align:center;
}
#list tr:nth-child(even){background-color: #f2f2f2;}
#list tr:nth-child(odd){background-color: #9ACD32;}
#list th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #6B8E23;
  color: white;
}
</style>
<script>
   function delete_ok(id){
      var a = confirm("정말로 삭제하겠습니까?");
      if(a){
         location.href='deleteok/'+id;
      }
   }
</script>
</head>
<body>
<h1 style="background-color: ; 
	font-size:300%; 
	text-align:center; 
	font-family: 'Anton', sans-serif;
	">경매장 보드</h1>
<a href="add" style="float:left;
				background: #808000;
				color:white;
				border:none;
				font-size:20px;
				font-style:none;
				border-radius: 8px;
				padding: 5px;
				text-decoration:none;">경매 시작하기</a>
<a href="./" style="float:right;
	background: #556B2F;
				color:white;
				border:none;
				font-size:20px;
				font-style:none;
				border-radius: 8px;
				padding: 5px;
				text-decoration:none;">로그아웃</a><br>
<table id="list" width="90%">
<tr>
	<th>상품번호</th>
	<th>카테고리</th>
	<th>상품명</th>
	<th>판매자</th>
	<th>등록일</th>
	<th>상세보기</th>
	<th>배팅하기</th>
	<th>삭제하기</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.getSid()}</td>
		<td>${u.getCategory()}</td>
		<td>${u.getMaterial()}</td>
		<td>${u.getSeller()}</td>
		<td>${u.getRegdate()}</td>
		<td><a href="detail/${u.getSid()}">제품 상세보기</a></td>
		<td><a href="editform/${u.getSid()}">경매하러가기</a></td>
		<td><a href="javascript:delete_ok('${u.getSid()}')">삭제하기</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>