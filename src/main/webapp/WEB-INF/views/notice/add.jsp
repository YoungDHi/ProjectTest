<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지등록</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container-fluid">
		<div class="row md-7">
			<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">NoticeAdd Page</h1>
		</div>
		<div class="row justify-content-center">
			<form class="col-md-7" action="./add" method="post" enctype="multipart/form-data">
				<div class="mb-3">
					<label for="writer" class="form-label">작성자</label>
					<input type="text" class="form-control" name="writer" id="writer">
				</div>
				<div class="mb-3">
					<label for="noticeName" class="form-label">공지명</label>
					<input type="text" name="noticeName" class="form-control" id="noticeName">
				</div>
				<div class="mb-3">	
					<label for="noticeDetail" class="form-label">공지내용</label>
					<textarea name="noticeDetail" class="form-control" id="noticeDetail" rows="7" ></textarea>
				</div>
				<div class="mb-3">
					<label for="writeDate" class="form-label">작성날짜</label>
					<input type="text" name="writeDate" class="form-control" id="writeDate">
				</div>
				<div class="mb-3">
					<label for="files" class="form-label">Image</label>
					<input type="file" name="pic" class="form-control" id="files">
				</div>
				<div class="mt-5">
					<button class="btn btn-secondary" type="submit">등록</button>
				</div>
			</form>
		</div>
	</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>