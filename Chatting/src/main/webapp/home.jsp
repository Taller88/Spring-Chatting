<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<c:set  var="hContext" value="${pageContext.request.contextPath }"></c:set>
<!-- hContext는 webapp/WEB-INF/Servlet-context.xml에서 설정 -->
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
 <h1>Hello, world! ${hContext}</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
