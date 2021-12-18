<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.com.myapp.user.UserVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경매 추가 페이지</title>
<style>
body{	
	    background-image: url("https://www.qgiv.com/blog/wp-content/uploads/2019/07/Bids.png");
         font: 100% Lucida Sans, Verdana;
         margin: 20px;
         line-height: 26px;
         align-items: center;
         justify-content: center;
         }
.data {
         background-color: #ffffff;
         position: relative;
         overflow: auto;
         border-radius: 8px;
         width: 600px;
         height: 400px;
         margin: 0 auto;
         align-items: center;
         justify-content: center;
}
#datum{
         padding-left:27px;
        }
input {
  width:150px;
  height:35px;
  font-size:25px;
  text-align: center;
  float: center;
  justify-content: center;
  align-items: center;
}
td {
	width: 130px;
	height: 50px;
	font-size: 30px;
}
</style>
</head>
<body>

<h1 style="background-color: ; 
	font-size:300%; 
	text-align:center; 
	font-family: 'Anton', sans-serif;
	">경매 시작하기</h1>
<form action="addok" method="post" class="data" id="data">
<input type="hidden" name="seller" value="${us.getUsername()}"/>
<table>
<tr><td>카테고리:</td><td><input type="text" name="category"/></td></tr>
<tr><td>상한가:</td><td><input type="text" name="max"/></td></tr>
<tr><td>상품명:</td><td><input type="text" name="material"/></td></tr>
<tr><td>시작가:</td><td><input type="text" name="current"/></td></tr>
<tr><td><a href="posts">목록 보기</a></td><td align="right"><input type="submit" value="경매 추가하기"/></td></tr>
</table>
</form>

</body>
</html>