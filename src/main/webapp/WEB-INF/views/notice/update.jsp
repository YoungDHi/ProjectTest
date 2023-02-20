<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>NoticeUpdate Page</h1>
	<form action="./update" method="post">
		<input type="hidden" name="noticeNum" value="${dto.noticeNum}">
		<fieldset>
			<legend>공지명</legend>
			<input type="text" name="noticeName" value="${dto.noticeName}">
		</fieldset>
		<fieldset>
			<legend>공지내용</legend>
			<textarea name="noticeDetail" rows="" cols="">${dto.noticeDetail}</textarea>
		</fieldset>
		<fieldset>
			<legend>작성자</legend>
			<input type="text" name="writer" value="${dto.writer}">
		</fieldset>
		<fieldset>
			<legend>작성날짜</legend>
			<input type="text" name="writeDate" value="${dto.writeDate}">
		</fieldset>
		<fieldset>
			<legend>조회수</legend>
			<input type="hidden" name="hits" value="${dto.hits}">
		</fieldset>
		<fieldset>
		<button type="submit">상품수정</button>
		</fieldset>
	</form>
</body>
</html>