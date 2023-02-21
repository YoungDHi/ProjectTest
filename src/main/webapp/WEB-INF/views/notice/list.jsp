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
		<!-- paging -->
			<div class="row">
				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<li class="page-item">
							<a class="page-link" href="./list?page=1&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
							    
						<li class="page-item ${pager.before? 'disabled':''}">
							<a class="page-link" href="./list?page=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
								<span aria-hidden="true">&lsaquo;</span>
							</a>
						</li>
						<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
							<li class="page-item"><a class="page-link" href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
						</c:forEach>
						<li class="page-item ${pager.after? 'disabled' : ''}">
							<a class="page-link" href="./list?page=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
								<span aria-hidden="true">&rsaquo;</span>
							</a>
						</li>
						<li class="page-item">
							<a class="page-link" href="./list?page=${pager.totalPage}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</ul>
				</nav>			
			</div>
		</div>
	</div>
	<div class="row col-md-7 mx-auto">
		<form class="row g-3" action="./list" method="get">
			<div class="col-auto">
				<label for="kind" class="visually-hidden">Kind</label>
				<select class="form-select" name="kind" id="kind" aria-label="Default select example">
					<option value="title">공지제목</option>
					<option value="contents">공지내용</option>
				</select>
			</div>
			<div class="col-auto">
				<label for="search" class="visually-hidden">Search</label>
				<input type="text" class="form-control" name="search" id="search" placeholder="검색어를 입력하세요">
			</div>
			<div class="col-auto">
				<button type="submit" class="btn btn-primary mb-3">검색</button>
			</div>
		</form>
	</div>
	<div class="row col-md-7 mx-auto">
		<a href="./add" class="btn btn-primary col-2">공지등록</a>
	</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>