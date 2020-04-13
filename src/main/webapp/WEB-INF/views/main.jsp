<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/layout.css" rel="stylesheet" type="text/css">
<link href="./resources/css/main_container.css" rel="stylesheet" type="text/css">
<link href="./resources/css/animate.css" rel="stylesheet" type="text/css">
<style type="text/css">
span{
	color: red;
}
</style>
<title>Insert title here</title>
</head>
<body>

<div class="root">
	<!-- 헤더 -------------------------------------------------------------------------------------->
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
					<li><a class="customer" href="${pageContext.request.contextPath}/bbs/boardList"><span>고객센터</span></a></li>
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
	
	<!-- 컨테이너 -------------------------------------------------------------------------------------->
	<div class="container container_bg">
		<div class="contents">
			<div class="section_slider">
				<div class="slide">
					<input type="radio" name="pos" id="pos1" checked>
				    <input type="radio" name="pos" id="pos2">
				    <input type="radio" name="pos" id="pos3">
				    <input type="radio" name="pos" id="pos4">
					<ul>
				      <li><img alt="" src="./resources/images/container/slider/slider_img_1.jpg"></li>
				      <li><img alt="" src="./resources/images/container/slider/slider_img_2.jpg"></li>
				      <li><img alt="" src="./resources/images/container/slider/slider_img_3.jpg"></li>
				      <li><img alt="" src="./resources/images/container/slider/slider_img_4.jpg"></li>
<!-- 				      <li></li> -->
<!-- 				      <li></li> -->
<!-- 				      <li></li> -->
<!-- 				      <li></li> -->
 				   </ul>
 				   <p class="bullet">
				      <label for="pos1">1</label>
				      <label for="pos2">2</label>
				      <label for="pos3">3</label>
				      <label for="pos4">4</label>
				   </p>
				</div>
		
			</div>
			<h3>
				<img src="./resources/images/container/movie/h3_movie_selection.gif">
			</h3>
			<div class="section_movie">
				<div class="section_L">
					<div>
<!-- 					<iframe src="http://ad.cgv.co.kr/NetInsight/html/CGV/CGV_201401/main@Selection_L" width="733" height="388"></iframe>  -->
					</div>
				</div>
				<div class="section_R">
					<a href="#">
						<img src="./resources/images/container/movie/240x388.jpg">
					</a>
					
				</div>
			</div>
			<h3>
				<img src="./resources/images/container/event/h3_event.gif">
			</h3>
			<ul class="tab_menu">
				<li>
					<a href="#" data-filter-type="08">
						CGV스페셜
					</a>
				</li>
				<li><a href="#">영화/예매</a></li>
				<li><a href="#">CGV아트하우스</a></li>
				<li><a href="#">제휴/할인</a></li>
				<li class="last"><a href="#">멤버쉽</a></li>
			</ul>
			<div class="section_event">
			
				<ul>
					<li><a href="#"><img alt="" src="./resources/images/container/event/event_img_1.jpg"></a></li>
					<li><a href="#"><img alt="" src="./resources/images/container/event/event_img_2.jpg"></a></li>
					<li><a href="#"><img alt="" src="./resources/images/container/event/event_img_3.jpg"></a></li>
					<li><a href="#"><img alt="" src="./resources/images/container/event/event_img_4.jpg"></a></li>
				</ul>
			</div>
			<div class="section_banner">
				<div class="banner_1">
					<div class="box_over">
						<div class="box_inner">
							<a href="#"><img alt="" src="./resources/images/container/banner/banner_img_1.jpg"> </a>
						</div>
					</div>
				</div>
				<div class="banner_2">
					<div class="box_over">
						<div class="box_inner">
							<a href="#"><img alt="" src="./resources/images/container/banner/banner_img_2.jpg"> </a>
						</div>
					</div>
				</div>
				<div class="banner_3">
					<div class="box_over">
						<div class="box_inner">
							<a href="#"><img alt="" src="./resources/images/container/banner/banner_img_3.jpg"> </a>
						</div>
					</div>
				</div>
			</div>
			<div class="section_notice">
				<h3>공지사항</h3>
				<div class="notice_list">
					<div class="notice_list_content">
						[극장][CGV아시아드] 4DX/스크린X 도입 및 전관 리뉴얼공사로 인한 일시영업중단 안내
					</div>
					<div class="notice_list_date">
						2020.03.13
					</div>					
				</div>
			</div>
		</div>
	</div>
	
	
	
	<!-- 푸터 -------------------------------------------------------------------------------------->
	<div class="footer">
		<div class="footer_wrap">
			<div class="footer_contents">
				<a href="#">
					<img alt="" src="${pageContext.request.contextPath}/resources/images/footer/980x240.png">
				</a>
			</div>
		</div>
		<div class="foot">
			<div class="smuse">
				<ul>
					<li><a href="#" class="dx"></a></li>
					<li><a href="#" class="imax">IMAX</a></li>
					<li><a href="#" class="screenx">SCREENX</a></li>
					<li><a href="#" class="spherex">SPHEREX</a></li>
					<li><a href="#" class="cinema">CINEMA</a></li>
					<li><a href="#" class="goldclass">GOLDCLASS</a></li>
					<li><a href="#" class="chef">CINE DE CHEF</a></li>
					<li><a href="#" class="primite">PRIMITE CINEA</a></li>
					<li><a href="#" class="kids">CINE KIDS</a></li>
					<li><a href="#" class="foret">CINE_FORET</a></li>
				</ul>
			</div>
			<div class="cjinfo">
				<p class="footer_logo">CGV 로고</p>
				
				<div class="policy">
					<ul>
						<li><a href="#">회사소개</a></li>
						<li><a href="#">IR</a></li>
						<li><a href="#">채용정보</a></li>
						<li><a href="#">광고/프로모션문의</a></li>
						<li><a href="#">제휴문의</a></li>
						<li><a href="#">출점문의</a></li>
						<li><a href="#">이용약관</a></li>
						<li><a href="#">편성기준</a></li>
						<li><a style="color:#e7612e;" href="#">개인정보처리방침</a></li>
						<li><a href="#">법적고지</a></li>
						<li><a href="#">이메일주소무단수집거부</a></li>
						<li><a href="#">상생경영</a></li>
						<li><a href="#">사이트맵</a></li>
					</ul>
				</div>
				<div class="share"></div>
			
				<div class="address">
					<address>(04377)서울특별시 용산구 한강대로 23길 55, 아이파크몰 6층(한강로동)</address>
					<p class="vl">
						<span>대표이사 : 최병환</span>
						<span>사업자등록번호 : 104-81-45690</span>
						<span>통신판매업신고번호 : 2017-서울용산-0662</span>
						<img src="${pageContext.request.contextPath}/resources/images/footer/btn_reg.png">
					</p>
					<p class="vl">
						<span>호스팅사업자 : CJ올리브네트웍스</span>
						<span>개인정보보호 책임자 : 정종민</span>
						<span>대표이메일 : cjcgvmaster@cj.net</span>
						<span>CGV고객센터 : 1544-1122</span>
					</p>
					<p class="copyright">
						© CJ CGV. All Rights Reserved
					</p>
				</div>
				<div class="familysite">
					<select>
						<option>계열사 바로가기</option>
						<option>CJ그룹</option>
						<option>엔터테이먼트&미디어</option>
						<option>식품&식품서비스</option>
						<option>생명공학</option>
						<option>신유통</option>
						<option>인프라</option>
					</select>
					<button type="button">GO</button>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<!-- 사이드바 ---------------------------------------------------------------------------------------------->
	<div class="sidebar">
		<div class="aside-content-top">
			<div class="aside-content-btm">
				<a></a>
				<a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/asidebar/btn_person_theater.gif"> </a>
				<a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/asidebar/btn_person_arthouse.gif"> </a>
				<a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/asidebar/btn_person_special.gif"> </a>
				<a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/asidebar/btn_person_phototicket.gif"> </a>
				<a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/asidebar/btn_person_ticket.gif"> </a>
				<a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/asidebar/btn_person_discount.gif"> </a>
			</div>
		</div>
		<div class="aside-btn-top">
			<a href="#" onclick="window.scrollTo(0,0);return false;"></a>
		</div>
	</div>
</div>

</body>
</html>