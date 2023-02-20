<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지수정</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<div class="container-fluid">
		<div class="row md-7">
			<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">NoticeUpdate Page</h1>
		</div>
		<div class="row justify-content-center">
			<form action="./update" method="post">
				<input type="hidden" name="noticeNum" value="${dto.noticeNum}">
				<fieldset class="mb-3">
					<label for="noticeName" class="form-label">공지명</label>
					<input type="text" name="noticeName" class="form-control" id="noticeName" value="${dto.noticeName}">
				</fieldset>
				<fieldset class="mb-3">
					<label for="noticeDetail" class="form-label">공지내용</label>
					<textarea name="noticeDetail" class="form-control" id="bookDetail" rows="7">${dto.noticeDetail}</textarea>
				</fieldset>
				<fieldset class="mb-3">
					<label for="writer" class="form-label">작성자</label>
					<input type="text" name="writer" class="form-control" id="writer" value="${dto.writer}">
				</fieldset>
				<fieldset class="mb-3">
					<label for="writeDate" class="form-label">작성날짜</label>
					<input type="text" name="writeDate" class="form-control" id="writeDate" value="${dto.writeDate}">
				</fieldset>
				<fieldset>
					<input type="hidden" name="hits" value="${dto.hits}">
				</fieldset>
				<fieldset class="mt-5">
				<button class="btn btn-secondary" type="submit">상품수정</button>
				</fieldset>
			</form>
		</div>
	</div>	
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>