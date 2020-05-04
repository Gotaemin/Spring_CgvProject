<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/layout.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/movie/movieReservation.css" rel="stylesheet" type="text/css">

<title>Insert title here</title>
</head>
<body>

	<div class="root">
		<c:import url="../template/header.jsp"></c:import>

		<h1>영화예매 페이지</h1>

		<div id="container">
			<div id="ticket">
			
				<!-- navigation -->
				<div class="navi">
					<span class="right">
						<a href="#" class="button btn-guide">
							<span>예매가이드</span>
						</a>
						<a href="#" class="button btn-reservation-restart">
							<span>예매 다시하기</span>
						</a>
					</span>
				</div>
				
				
				
				
				<!-- container selector -->
				<div class="steps">
					<div class="step step1">
					
						<!-- 영화선택 -->
						<div class="section section-movie">
							<div class="col-head">
								<h3 class="sreader">영화</h3>
							</div>
							<div class="col-body">
								<div class="movie-select">
									
									<!-- 탭 메뉴 -->
									<div class="tabmenu">
										<span class="side on"></span>
										<a href="#" class="button menu1 selected">전체</a>
										<span class="side on"></span>
										<div class="button menu2"></div>
									</div>
									
									<!-- 메뉴 (정렬방법 선택) -->
									<div class="sortmenu">
										<a href="#" class="button btn-rank selected">예매율순</a>
										<a href="#" class="button btn-abc">가나다순</a>
									</div>
									
									<!-- 리스트 출력부분 -->
									<div class="movie-list nano">
										<ul class="content scroll-y" style="right: -21px;">
										<c:forEach begin="1" end="10">
											<li class="rating-all">
												<a href="#" title="제목" alt="제목">
													<span class="icon">&nbsp;</span>
													<span class="text">제목</span>
													<span class="sreader"></span>
												</a>
											</li>
											<li class="rating-15">
												<a href="#" title="제목" alt="제목">
													<span class="icon">&nbsp;</span>
													<span class="text">제목</span>
													<span class="sreader"></span>
												</a>
											</li>
											<li class="rating-12">
												<a href="#" title="제목" alt="제목">
													<span class="icon">&nbsp;</span>
													<span class="text">제목</span>
													<span class="sreader"></span>
												</a>
											</li>
											<li class="rating-18">
												<a href="#" title="제목" alt="제목">
													<span class="icon">&nbsp;</span>
													<span class="text">제목</span>
													<span class="sreader"></span>
												</a>
											</li>
										
										</c:forEach>
											
										</ul>
										
										<div class="pane pane-y" style="display: block; opacity: 1; visibility: visible;">
											<div class="slider slider-y" style="height: 50px; top: 0px;"></div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<!-- 극장선택 -->
						<div class="section section-theater">
							<div class="col-head">
								<h3 class="sreader">극장</h3>
							</div>
							<div class="col-body">
								<div class="theater-select">
									<div class="tabmenu">
										<span class="side on"></span>
										<a href="#" class="button menu1 selected">전체</a>
										<span class="side on"></span>
										<div class="button menu2"></div>
									</div>
									<div class="theater-list nano has-scrollbar has-scrollbar-y">
										<div class="theater-area-list">
											<ul>
												<li class="selected">
													<a href="#">
														<span class="name">서울</span>
														<span class="count">(30)</span>
													</a>
													<div class="area_theater_list nano has-scrollbar has-scrollbar-y">
														<ul class="content scroll-y">
														<c:forEach begin="1" end="13">
															<li>
																<a href="#">
																	강남
																	<span class="sreader"></span>
																</a>
															</li>
														</c:forEach>
														</ul>
														<div class="pane pane-y">
															<div class="slider slider-y"></div>
														</div>
													</div>
												</li>
												<c:forEach begin="1" end="10">
													<li>
													<a href="#">
														<span class="name">경기</span>
														<span class="count">(44)</span>
													</a>
												</li>
												</c:forEach>
												
											</ul>
											<div class="pane pane-y" style="display: block; opacity: 1; visibility: visible;">
												<div class="slider slider-y" style="height: 50px; top: 0px;"></div>
											</div>
										</div>
									</div>
									
								</div>
							</div>
						</div>
						
						
						<!-- 날짜선택 -->
						<div class="section section-date">
							<div class="col-head"></div>
							<div class="col-body" style="height: 560px;">
								<div class="date-list nano has-scrollbar has-scrollbar-y" id="date_list">
									<ul class="content scroll-y" tabindex="-1" style="right: -21px;">
										<li class="month dimmed">
											<span class="year">2020</span>
											<span class="month">5</span>
										</li>
										
										<c:forEach begin="1" end="5">
											<li data-index="0" class="day dimmed">
												<a href="#">
													<span class="dayweek">월</span>
													<span class="day">4</span>
													<span class="sreader">선택불가</span>
												</a>
											</li>
											<li data-index="0" class="day">
												<a href="#">
													<span class="dayweek">화</span>
													<span class="day">5</span>
													<span class="sreader"></span>
												</a>
											</li><li data-index="0" class="day">
												<a href="#">
													<span class="dayweek">월</span>
													<span class="day">4</span>
													<span class="sreader">선택불가</span>
												</a>
											</li>
											<li data-index="0" class="day day-sat">
												<a href="#">
													<span class="dayweek">토</span>
													<span class="day">4</span>
													<span class="sreader">선택불가</span>
												</a>
											</li>
											<li data-index="0"  class="day day-sun">
												<a href="#">
													<span class="dayweek">일</span>
													<span class="day">4</span>
													<span class="sreader">선택불가</span>
												</a>
											</li>
										</c:forEach>
										
									</ul>
									<div class="pane pane-y" style="display: block; opacity: 1; visibility: visible;">
										<div class="slider slider-y" style="height: 50px; top: 0px;"></div>
									</div>
								</div>
							</div>
						</div>
						
						
						<!-- 시간선택 -->
						<div class="section section-time">
							<div class="col-head"></div>
							<div class="col-body"></div>
						</div>
						
					</div>
				</div>			
			</div>
		
		</div>
		
		<!-- 선택내용 출력,좌선선택 페이지로 이동버튼 출력부분 -->
		<div class="ticket_tnb">
			
		</div>






		<c:import url="../template/footer.jsp"></c:import>
		<c:import url="../template/sidebar.jsp"></c:import>
	</div>

</body>
</html>