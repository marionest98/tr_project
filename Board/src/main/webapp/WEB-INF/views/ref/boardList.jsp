<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="/css/base.css"/>
</head>
<body>
<div id="wrap">
	<!-- header -->
	<div id="header">
		<h1>게시판 글목록</h1>
	</div><!-- // header -->
	
	<!-- container -->
	<div id="container">
		<p class="all_txt">글목록 <span>(전체글 : ${count})</span></p>
		<div class="table_grp">
			<div class="table_type_04">
				<table>
					<colgroup>
						<col style="width:10%;"/>
						<col />
						<col style="width:12%;"/>
						<col style="width:12%;"/>
						<col style="width:12%;"/>
					</colgroup>
					<thead>
						<tr>
							<th scope="col">번호</th>
							<th scope="col">제목</th>
							<th scope="col">작성자</th>
							<th scope="col">작성일</th>
							<th scope="col">조회수</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${count == 0}">
							<tr>
								<td colspan="5" class="tac">게시판에 저장된 글이 없습니다.</td>
							</tr>						
						</c:if>
						<c:if test="${count > 0}">
							<c:forEach var="article" items="${bList}">
							<tr>
								<td>
									<c:out value="${start}"/>
									<c:set var="start" value="${start+1}"/>
								</td>
								<td class="subject">
									<a href="content/${article.no}">
										<c:if test="${article.re_level > 0}">
										<!-- 답변글이 있으면 -->
										<span class="icon">
										<img src="/img/level.gif" width="${article.re_level * 10}">
										<img alt="답변" src="/img/re.gif">
										</span>
										</c:if>
										${article.subject}
										<c:if test="${article.readcount >= 20}">
										<span class="icon"><img alt="인기글" src="/img/hot.gif"></span>
										</c:if>							
									</a>
								</td>
								<td>
									${article.id}
								</td>
								<td><fmt:formatDate value="${article.regdate}" dateStyle="short"/></td>
								<td>${article.readcount}</td>
							</tr>
							</c:forEach>						
						</c:if>
					</tbody>
				</table>			
			</div>
		</div>
		
		<!-- 페이징 -->
		<div class="paging">
			<div id="page">
				<c:if test="${begin > pageNum}">
					<a href="list?p=${begin-1}" class="page prv">$lt;}</a>
				</c:if>
				<c:forEach begin="${begin}" end="${end}" var="i">
					<a href="list?p=${i}">${i}</a>
				</c:forEach>
				<c:if test="${end < totalPages}">
					<a href="list?p=${end+1}" class="page next">&gt;</a>
				</c:if>
			</div>
		</div>
		<div class="btn_align_02">
			<a href="write" class="btn btnF_03 btnC_02">
				<span>글쓰기</span>			
			</a>
		</div><br>
	</div><!-- // container -->
</div><!-- // wrap -->
</body>
</html>