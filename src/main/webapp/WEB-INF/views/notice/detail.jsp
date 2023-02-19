<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice Detail</h1>
	<h3>제목 : ${dto.noticeName}</h3>
	<h3>작성자 : ${dto.writer}</h3>
	<h3>내용 : ${dto.noticeDetail}</h3>
	<h3>작성날짜 : ${dto.writeDate}</h3>
	<h3>조회수 : ${dto.hits}</h3>
</body>
</html>