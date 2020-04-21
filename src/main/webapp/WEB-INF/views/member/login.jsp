<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/layout.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" type="text/css">

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
						<a href="./login">회원 서비스</a>
					</li>
					<li class="last">
						로그인
					</li>
				</ul>
			</div>
		</div>
		
		<div class="contents">
			<div class="wrap_login">
				<ul class="tab_menu_round">
					<li>
						<a class="lo" href="">로그인</a>
					</li>
					<li>
						<a href="#">비회원 예매확인</a>
					</li>
				</ul>
				<div class="box_login">
					<form action="./login" method="post">
						<fieldset>
							<p>아이디 비밀번호를 입력하신 후, 로그인 버튼을 클릭해 주세요.</p>
							<div class="login_input">
								<input type="text" name="id" value="${cookie.cookieId.value}">
								<input type="password" name="pwd">
							</div>
							<button type="submit"><span>로그인</span></button>
							<div class="save_id">
								<c:if test="${cookie.cookieId.value eq ''}">
									<input type="checkbox" name="remember" value="remember" >
								</c:if>
								<c:if test="${cookie.cookieId.value ne ''}">
									<input type="checkbox" name="remember" value="remember" checked="checked" >
								</c:if>
								
								<label>아이디 저장</label>
							</div>
							<div class="login_option">
								<a href="#">아이디 찾기</a>
								<a href="#">비밀번호 찾기</a>
							</div>
						</fieldset>
					</form>
				</div>
				
				<div class="login_guide">
					<div class="box_guide">
						<strong>CJ ONE 회원이 아니신가요?</strong>
						<span>회원가입하시고 다양한 혜택을 누리세요!</span>
						<strong>
							<a href="./join" class="round red">
								<span>CJ ONE 회원가입하기</span>
							</a>
						</strong>
						<em>
							<a href="" class="round black">
								<span>CJ ONE 멤버쉽이란?</span>
							</a>
						</em>
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