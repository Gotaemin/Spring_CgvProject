<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/layout.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/movie/movieList.css" rel="stylesheet" type="text/css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="root">
	<!-- 헤더 -------------------------------------------------------------------------------------->
	<c:import url="../template/header.jsp"></c:import>
	
	<!-- 컨테이너 -------------------------------------------------------------------------------------->
	
	<div class="container">
		<div class="c_nav">
			<div class="nav_linemap">
				<ul>
					<li>
						<a href="../">
							<img alt="go to Home" src="../resources/images/login/btn_home.png">					
						</a>
					</li>
					<li>
						<a href="./movieList">영화</a>
					</li>
					<li>
						<a href="./movieList">무비차트</a>
					</li>
					<li class="last">
						무비차트
					</li>
				</ul>
			</div>
		</div>
		
		<div class="contents">
			<div class="movie-chart">
<!-- 			헤더 제목부분+ 차트종류(서브) -->
				<div class="sect-movie-title">
					<h3>무비 차트</h3>
					<div class="submenu">
						<ul>
							<li class="on"><a href="">무비 차트</a></li>
							<li><a href="">상영예정작</a></li>
						</ul>
					</div>
				</div>
				
<!-- 			정렬부분 -->
				<div class="sect-sorting">
					<select name="order-type">
						<option value="1" selected="selected">예매율순</option>
						<option value="2">최신순</option>
						<option value="3">관람객순</option>
					</select>
					<button type="button" class="round gray">
						<span>GO</span>
					</button>
				</div>
				
<!-- 			리스트 출력부분 -->
				<div class="sect-movie-chart">
					<!-- 첫번째 행 -->
					<ol>
						<li>
							<!-- 윗 부분 -->
							<div class="box-image">
								<strong class="rank">No.1</strong>
								<a href="">
									<span class="thumb-image">
										<img alt="" src="../resources/images/movie/movieList/79273_320.jpg">
										<span class="icon-grade grade-12">청소년 관람불가</span>
									</span>
								</a>
								<span class="screentype"></span>
							</div>
							
							<!-- 아래 부분 -->
							<div class="box-contents">
								<a href=""><strong class="title">제목</strong> </a>
								<div class="score">
									<strong class="percent">예매율<span>9.0%</span> </strong>
									<div class="egg-gage small">
										<span class="egg great"></span>
										<span class="percent">75%</span>
									</div>
								</div>
								<span class="text-info">
									<strong>2020.04.15<span>개봉</span></strong>
								</span>
								<span class="like">
									<a href="" class="link-reservation">예매</a>
								</span>
							</div>						
						</li>
					</ol>
					
					<!-- 두번째행 -->
<!-- 					<ol> -->
<!-- 					</ol> -->
				</div>
			
			</div>
			
		</div>
	</div>
	
	
	<!-- 푸터 -------------------------------------------------------------------------------------->
	<c:import url="../template/footer.jsp"></c:import>
	
	
	
	<!-- 사이드바 ---------------------------------------------------------------------------------------------->
	<c:import url="../template/sidebar.jsp"></c:import>
</div>

</body>
</html>