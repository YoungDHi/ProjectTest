<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container-fluid">
		<div class="row md-7">
			<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">NoticeList Page</h1>
		</div>
		<div class="row col-md-7 mx-auto">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>공지명</th>
						<th>작성자</th>
						<th>작성날짜</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody class="table-group-divider">
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
		</div>
		<div class="row col-md-7 mx-auto">
			<a href="./add" class="btn btn-primary col-2">공지등록</a>
		</div>
		<c:import url="../template/common_js.jsp"></c:import>
	</div>	
</body>
</html>