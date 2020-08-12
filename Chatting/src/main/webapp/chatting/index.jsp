<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
		</thead>
		<tbody>
				<tr>
					<td>${member.no}</td>
					<td>${member.user_id}</td>
					<td>${member.name}</td>
				</tr>
	
		</tbody>
		<tr>
			<td>
				<input type="text">
			</td>
			<td>
				<input type="button" value="전송">
			</td>
		</tr>
	</table>
	<form action="/chatting/chatting.spring" method="post" id="chat">
	<input type="hidden" name="userId" id="userId" value="${member.user_id}">
	<input type="hidden" name="name" id="name" value="${member.name}">
	
		<input type="submit" value="채팅장 입장" id="goChat" name="goChat" >
	</form>
</body>

</html>
