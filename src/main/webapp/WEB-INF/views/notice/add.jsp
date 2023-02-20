<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>NoticeAdd Page</h1>
	<form action="./add" method="post">
		작성자 : 
		<input type="text" name="writer">
		공지명 : 
		<input type="text" name="noticeName" placeholder="공지명을 작성해주세요">
			
		공지내용 : <textarea name="noticeDetail" rows="" cols=""></textarea><br>
		
		작성날짜 : 
		<input type="text" name="writeDate">
		
		<input type="file" name="pic">
		
		<button type="submit">등록</button>
		
	</form>
</body>
</html>