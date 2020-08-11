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
			<c:forEach items="${memberList}" var="member">
				<tr>
					<td>${member.no}</td>
					<td>${member.user_id}</td>
					<td>${member.name}</td>
				</tr>
			</c:forEach>
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
</body>
</html>