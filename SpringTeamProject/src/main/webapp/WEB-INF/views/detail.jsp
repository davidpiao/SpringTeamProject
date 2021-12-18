<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.com.myapp.dao.BoardDAO, com.com.myapp.bean.BoardVO, com.com.myapp.user.UserVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물품 설명 페이지</title>
<style>
body{
	    background-image: url("https://www.qgiv.com/blog/wp-content/uploads/2019/07/Bids.png");
         font: 100% Lucida Sans, Verdana;
         margin: 20px;
         line-height: 26px;
         }
.data {
         background-color: #ffffff;
         position: relative;
         overflow: auto;
         border-radius: 8px;
         width: 600px;
         height: 400px;
         margin: 0 auto;
}
#datum{
         padding-left:27px;
        }
</style>
</head>
<body>
<div class="data">
   <div id = "datum">
         <p><strong>상품번호:   ${u.getSid()}</strong></p>
         <p><strong>카테고리:   ${u.getCategory()}</strong></p>
         <p><strong>상품명:   ${u.getMaterial()}</strong></p>
         <p><strong>판매자:   ${u.getSeller()}</strong></p>
         <p><strong>상한가:   ${u.getMax()}원</strong></p>
         <p><strong>현재가격:   ${u.getCurrent()}원</strong></p>
         <p><strong>이전가격:   ${u.getPrevious()}원</strong></p>
         <p><strong>등록일:   ${u.getRegdate()}</strong></p>
         <p><a href="../editform/${u.getSid()}">경매하러가기</a>
         <input type="button" value="Cancel" onclick="history.back()"/></p>
   </div>
</div>
</body>
</html>