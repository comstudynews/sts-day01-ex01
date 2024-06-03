<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유 게시판 목록</title>
</head>
<body>

<h1>게시 글 목록</h1>
<table width="600" border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="row" items="${boardList }">
		<tr>
			<td>${row.seq }</td>
			<td><a href="detail.do?seq=${row.seq }">${row.title }</a></td>
			<td>${row.writer }</td>
			<td>${row.regdate }</td>
			<td>${row.cnt }</td>
		</tr>
	</c:forEach>
</table>
<a href="input.do">글쓰기</a>

</body>
</html>