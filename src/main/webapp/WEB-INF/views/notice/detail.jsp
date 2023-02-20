<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세공지</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container-fluid">
		<div class="row md-7">
			<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">Notice Detail</h1>
		</div>
		<c:if test="${not empty dto.noticeNum}">
		<div class="row text-center">
			<h3>제목 : ${dto.noticeName}</h3>
			<h3>작성자 : ${dto.writer}</h3>
			<h3>내용 : ${dto.noticeDetail}</h3>
			<h3>작성날짜 : ${dto.writeDate}</h3>
			<h3>조회수 : ${dto.hits}</h3>
		</div>
		<c:if test="${not empty dto.noticeImgDTO}">
			<img src="../resources/upload/notice/${dto.noticeImgDTO.fileName}"><br>
		</c:if>
		<div class="row text-center">
		<a href="./update?noticeNum=${dto.noticeNum}"><button class="btn btn-primary" type="button">상품수정</button></a>
		<a href="./delete?noticeNum=${dto.noticeNum}"><button class="btn btn-primary" type="button">상품삭제</button></a>
		<a href="./list"><button class="btn btn-primary" type="button">목록으로</button></a>
		</div>
		</c:if>
		<c:if test="${empty dto.noticeNum}">
			<h3>Message : 존재하지 않는 상품입니다.</h3>
		</c:if>
	</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>