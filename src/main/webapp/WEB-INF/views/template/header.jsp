<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="header">
		<div class="head">
			
			<h1 class="animated swing"><a href="${pageContext.request.contextPath}"><img src="${pageContext.request.contextPath}/resources/images/header/h1_cgv.png" alt="cgvLogo"></a></h1>
			<div class="header_service">
				<ul class="util"></ul>
				<ul class="gnb">
					<li><a class="login" href="${pageContext.request.contextPath}/member/login"><span>로그인</span></a></li>
					<li><a class="join" href="${pageContext.request.contextPath}/member/terms"><span>회원가입</span></a></li>
					<li><a class="mycgv" href="#"><span>MyCGV</span></a></li>
					<li><a class="vip_lounge" href="#"><span>VIPLOUNGE</span></a></li>
					<li><a class="club_service" href="#"><span>Club서비스</span></a></li>
					<li><a class="customer" href="${pageContext.request.contextPath }/bbs/boardList"><span>고객센터</span></a></li>
					<li><a class="english_ticketing" href="#"><span>ENGLISHTICKETING</span></a></li>
				</ul>
			</div>
			<div class="header_menu">
				<h2>
					<img src="${pageContext.request.contextPath}/resources/images/header/h2_cultureplex.png" alt="cultureplex">
				</h2>
				<div class="menu">
					<ul>
						<li class="menu_movie"><a href="http://www.cgv.co.kr/movies/">영화</a></li>
						<li class="menu_reserve"><a href="http://www.cgv.co.kr/ticket/">예매</a></li>
						<li class="menu_theater"><a href="http://www.cgv.co.kr/theaters/">극장</a></li>
						<li class="menu_event"><a href="http://www.cgv.co.kr/culture-event/event/#1">이벤트&컬처</a></li>
					</ul>
				</div>
				<div class="search">
					<fieldset>
						<input type="text" placeholder="주디 3월25일 개봉">
						<button class="btn-go-search">검색</button>
					</fieldset>
				</div>
				<div class="phototicket">
					<a href="#">포토티켓</a>
				</div>
			</div>
		</div>
	</div>
