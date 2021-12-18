<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.com.myapp.dao.BoardDAO, com.com.myapp.bean.BoardVO, com.com.myapp.user.UserVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경매 배팅</title>
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
td1 {
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
	">배팅 페이지</h1><form action="../editok" method="post" class="data id="datum">
<input type="hidden" name="sid" value="${u.getSid()}"/>
<input type="hidden" name="seller" value="${u.getSeller()}"/>
<input type="hidden" name="max" value="${u.getMax()}"/>
<input type="hidden" name="previous" value="${u.getCurrent()}"/>
<input type="hidden" name="buyer" value="${us.getUsername()}"/>
<table>
<br>
<tr><td1 style="float:center">현재 금액:</td1><td><input type="text" name="current" value="${u.getCurrent()}"/></td></tr>
<tr><td colspan="2"><input type="submit" value="배팅하기"/>
<input type="button" value="뒤로가기" onclick="history.back()"/></td></tr>
</table>
</form>

</body>
</html>