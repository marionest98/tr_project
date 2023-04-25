<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<link rel="stylesheet" href="/css/base.css"/>
<script src="/js/script.js"></script>
</head>
<body>
<div id="wrap">
	<!-- header -->
	<div id="header">
		<h1>글수정</h1>
	</div><!-- // header -->
	
	<!-- container -->
	<div id="container">
		<form method="post">
			<fieldset>
				<legend>게시판 글쓰기 입력폼</legend>
				<input type="hidden" name="no" value="${no}"/>
				<div class="table_grp">
					<div class="table_type_01">
						<table>
							<colgroup>
								<col style="width:120px;"/>
								<col />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row">제목</th>
									<td>										
										<input type="text" class="txt" name="subject" maxlength="50"/>								
									</td>
								</tr>
								<tr>
									<th scope="row">내용</th>
									<td>
										<div class="textarea_grp">
											<pre><textarea name="content"></textarea></pre>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="btn_align_02">
						<span class="btn btnF_03 btnC_02 mr5">
							<input type="submit" value="수정완료"/>
						</span>
						<span class="btn btnF_03 btnC_03 mr5">
							<input type="reset" value="다시작성"/>
						</span>
						<a href="../list" class="btn btnF_03 btnC_02">
							<span>글목록</span>
						</a>
					</div>
				</div>
			</fieldset>
		</form>	
	</div><!-- // container -->
</div><!-- // wrap -->
</body>
</html>