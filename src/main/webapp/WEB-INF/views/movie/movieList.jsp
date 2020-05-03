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
					<select id="select" name="kind">
						<option title="1" value="rate" selected="selected">예매율순</option>
						<option title="2" value="date">최신순</option>
						<option title="3" value="title">제목순</option>
					</select>
					<button id="btn-sort" type="button" class="round gray">
						<span>GO</span>
					</button>
				</div>
				
				
				
<!-- 			리스트 출력부분 -->
				<div class="sect-movie-chart">
					<ol>
					<c:forEach var="list" items="${list}" varStatus="i">
						<li>
							<!-- 윗 부분 -->
							<div class="box-image">
								<strong class="rank">No.${i.index+1}</strong> 
								<a href=""> 
									<span class="thumb-image"> 
										<img alt="이미지"	src="../resources/images/movie/movieList/filmCover/${list.imageName}">
										<span class="icon-grade grade-12">청소년 관람불가</span>
									</span>
								</a> 
								<span class="screentype"></span>
							</div> <!-- 아래 부분 -->
							<div class="box-contents">
								<a href=""><strong class="title">${list.title}</strong> </a>
								<div class="score">
									<strong class="percent">예매율<span>${list.rate}%</span></strong>
									<div class="egg-gage small">
										<span class="egg great"></span> <span class="percent">75%</span>
									</div>
								</div>
								<span class="text-info"> 
									<strong>${list.openDate}<span>개봉</span></strong>
								</span> 
								<span class="like"> 
<%-- 									<a href="./movieReservation?mNum=${list.mNum}" class="link-reservation">예매</a> --%>
									<a href="./movieReservation" class="link-reservation">예매</a>
								</span>
							</div>
						</li>
								
						<c:if test="${i.index == 2}">
							</ol><ol>
						</c:if>
					</c:forEach>
					</ol>
					
					<div class="sect-movie-chart" id="list-more"></div>
					
					
					<div class="chart-ad">
						<div class="box-com">
							<a href=""><img alt="adImage" src="../resources/images/movie/movieList/200313_160x300.jpg"></a>
						</div>
						<div class="chart-ad-desc">
							<dl>
								<dt>
									<img alt="ad1" src="../resources/images/movie/movieList/ico_ad1.png">
									<span>CGV 기프트 카드</span>
								</dt>
								<dd>
									<span>센스있는 선물의 정석</span>
								</dd>
							</dl>
						</div>
					</div>
				</div>
			<div class="btn-more" id="btn-more">더보기
				<i class="link-more"></i>
			</div>
				
			</div>
			
		</div>
	</div>
	
	
	<!-- 푸터 -------------------------------------------------------------------------------------->
	<c:import url="../template/footer.jsp"></c:import>
	
	<!-- 사이드바 ---------------------------------------------------------------------------------------------->
	<c:import url="../template/sidebar.jsp"></c:import>
</div>


<script type="text/javascript">

	$("#btn-more").click(function() {
		var kind = $("#select").val();
		
		$.get("./movieListMore?startRow=8&kind="+kind,function(result){

			console.log("result"+result);
			$("#list-more").html(result);
			
			$("#btn-more").css("visibility","hidden");
		});
		
	});


	$("#btn-sort").click(function(){
		var kind = $("#select").val();
		
		location.href = "./movieList?kind="+kind;
	});

	
	
	
	$(document).ready(function() {
		//url로 들어오는 파라미터값 읽어들이기
		function getParam(sname) {

		    var params = location.search.substr(location.search.indexOf("?") + 1);
		    var sval = "";
		    params = params.split("&");
		    for (var i = 0; i < params.length; i++) {
		        temp = params[i].split("=");
		        if ([temp[0]] == sname) { sval = temp[1]; }
		    }
		    return sval;
		}
		
		//읽어들인 파라미터값으로 selected값 변경
		$("select option[value='"+getParam("kind") +"']").attr("selected", true);
	});
</script>






</body>
</html>
















