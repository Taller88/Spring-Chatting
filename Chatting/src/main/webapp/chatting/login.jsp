<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<c:set var="hContext" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="/chatting/login.spring" method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" placeholder="아이디를 입력해주세요." name="userId"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" placeholder="비밀번호를 입력해주세요." name="password"></td>
		</tr>
		<tr>
		<td colspan="2"><input type="submit" value="로그인"></td>
		</tr>
	</table>
	</form>
</body>
</html>