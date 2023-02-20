<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>NoticeList Page</h1>
	<table>
		<thead>
			<tr>
				<th>공지명</th>
				<th>작성자</th>
				<th>작성날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td><a href="./detail?noticeNum=${dto.noticeNum}">${dto.noticeName}</a></td>
					<td>${dto.writer}</td>
					<td>${dto.writeDate}</td>
					<td>${dto.hits}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="./add">공지등록</a>
</body>
</html>