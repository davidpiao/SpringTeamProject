<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 테스트</title>
<style>
img, label {
	display: inline-block;
}

label {
	width: 130px;
	height: 50px;
	font-size: 30px;
}
input {
  width:150px;
  height:35px;
  font-size:25px;
}
button {
	background-color: blue;
	color: white;
	font-size: 15px
}
</style>
</head>
<body>
	<div style='width: 100%; text-align: center; padding-top: 100px'>
	<img src='./img/bid.gif' height="500">
		<form method="post" action="loginOk">
		<br>
		<br>
			<div>
				<label>아이디: </label><input type='text' name='userid' />
			</div>
			<br>
			<div>
				<label>패스워드: </label> <input type='password' name='password' />
			</div>
			<br>
			<button type='submit' 
			style="background: darkcyan;
				color:white;
				border:none;
				font-size:20px;
				border-radius: 8px;
				padding: 10px 24px;">로그인</button>
			<a type='submit' 
			style="background: darkcyan;
				color:white;
				border:none;
				font-size:20px;
				font-style:none;
				border-radius: 8px;
				text-decoration:none;
				padding: 10px 24px;" href="register">회원가입</a>
		</form>
	</div>
</body>
</html>