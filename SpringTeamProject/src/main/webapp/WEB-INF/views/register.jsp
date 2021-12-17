<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
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
  height:30px;
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
		<form method="post" action="registerUser">
			<div>
				<label>아이디: </label><input type='text' name='userid' />
			</div>
			<div>
				<label>사용자: </label> <input type='text' name='username' />
			</div>
			<div>
				<label>패스워드: </label> <input type='password' name='password' />
			</div>
			<button type='submit'
			style="background: darkcyan;
				color:white;
				border:none;
				font-size:20px;
				border-radius: 8px;
				padding: 10px 24px;">등록하기</button>
			<a type="button" 
			style="background: darkcyan;
				color:white;
				border:none;
				font-size:20px;
				border-radius: 8px;
				padding: 10px 24px;"
				onclick="history.back()">뒤로가기</a>
		</form>
	</div>
</body>
</html>