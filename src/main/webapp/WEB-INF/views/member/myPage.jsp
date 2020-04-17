<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../resources/css/bbsLayout.css" rel="stylesheet" type="text/css">
<link href="../resources/css/layout.css" rel="stylesheet" type="text/css">

<link href="../resources/css/myPage.css" rel="stylesheet" type="text/css">

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
						<a href="">MY CGV</a>
					</li>
					<li class="last">
						MY CGV HOME
					</li>
				</ul>
			</div>
		</div>
		
		<div class="contents">
			<div>
				<div class="col_content">
					<!----------------- contents aside -->
					<div class="col_aside">
						<div class="snb">
							<ul>
								<li class="on"><a href="">MY CGV HOME<i></i></a></li>
								<li><a href="">나의 예매내역<i></i></a></li>
								<li><a href="">할인쿠폰 관리<i></i></a></li>
								<li><a href="">영화관람권 관리<i></i></a></li>
								<li><a href="">분실문 문의<i></i></a></li>
								<li><a href="">단체/대관 문의<i></i></a></li>
								<li><a href="">대학로 옥탑 예약<i></i></a></li>
							</ul>
						
						</div>
						<div class="ad_area">
							<div class="ad_panner_1">
								<a href="">
									<img alt="" src="../resources/images/bbsList/200313_160x300.jpg">
								</a>
							</div>
							<div class="ad_panner_2">
								<a href="">
									<img alt="" src="../resources/images/bbsList/0325_160x35.png">
								</a>
							</div>
						</div>
					</div>
					
					<!------contents detail -->
					<div class="col_detail">
						<div class="sect-common"> 
							<div class="mycgv-info-wrap">
								
							</div>
						</div>
						
					</div>
				
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