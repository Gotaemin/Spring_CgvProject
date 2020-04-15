<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../resources/css/bbsList.css" rel="stylesheet" type="text/css">
<link href="../resources/css/bbsLayout.css" rel="stylesheet" type="text/css">
<link href="../resources/css/layout.css" rel="stylesheet" type="text/css">

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
						<a href="">고겍센터</a>
					</li>
					<li class="last">
						게시판
					</li>
				</ul>
			</div>
		</div>
		
		<div class="contents">
			<div>
				
				<div class="col_content">
					<!----------------------------------------------------------------------------------------------------- contents aside -->
					<div class="col_aside">
						<div class="snb">
							<ul>
								<li><a href="">고객센터 메인<i></i></a></li>
								<li><a href="">자주찾는 질문<i></i></a></li>
								<li class="on"><a href="/bbs/boardList">공지/뉴스<i></i></a></li>
								<li><a href="">이메일 문의<i></i></a></li>
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
					
					<!----------------------------------------------------------------------------------------------------- contents detail -->
					
					<div class="col_detail">
					
						<!----------------------------------------------------------------------------------------------------- contents detail customer_top-->
						<div class="customer_top">
							<h2 class="tit">공지/뉴스</h2>
							<p class="stit">CGV의 주요한 이슈 및 여러가지 소식들을 확인하실 수 있습니다.</p>
						</div>
						
						
						<!----------------------------------------------------------------------------------------------------- contents detail search_area-->
						<div class="search_area">
							<select style="width: 100px;">
								<option selected="selected">제목</option>
								<option>내용</option>
							</select>
							<input type="text" placeholder="검색어를 입력해 주세요" style="width: 185px;">
							<button type="button" class="round inblack"><span>검색하기</span></button>
						</div>
					
						<!----------------------------------------------------------------------------------------------------- contents detail tab-->
						<div class="wrap_tab">
							<ul class="tab_menu_round">
								<li>
									<a class="lo" href="">전체</a>
								</li>
							</ul>
							
						</div>
						
						<!----------------------------------------------------------------------------------------------------- contents detail search_result-->
						<div class="search_result">
							총<span class="num">${fn:length(bbsList)}</span>건이 검색되었습니다.
						</div>
						
						
						<!----------------------------------------------------------------------------------------------------- contents detail box_bbslist-->
						<div class="box_bbsList">
							<table class="tbl_list">
								<colgroup>
									<col style="width: 50px;">
									<col style="width: 80px;">
									<col style="width: 570px;">
									<col style="width: 75px;">
									<col style="width: 60px;">
								</colgroup>
								<thead>
									<tr>
										<th scope="col">번호</th>
										<th scope="col">구분</th>
										<th scope="col" class="tit">제목</th>
										<th scope="col">등록일</th>
										<th scope="col">조회수</th>
									</tr>
								</thead>
								<tbody id="list_body">
									<c:forEach var="list" items="${bbsList}" >
										<tr class="first">
											<td>${list.no }</td>
											<td>[극장]</td>
											<td class="txt">
												<a href="#">${list.title }</a>
											</td>
											<td>${list.hiredate }</td>
											<td class="num">${list.count}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							
						</div>
						
						<!----------------------------------------------------------------------------------------------------- contents detail paging-->
						<div class="paging">
							<ul>
								<li class="on"><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">6</a></li>
								<li><a href="#">7</a></li>
								<li><a href="#">8</a></li>
								<li><a href="#">9</a></li>
								<li><a href="#">10</a></li>
							</ul>
							<button type="button" class="btn_page next">다음</button>
							<button type="button" class="btn_page end">끝</button>
							<a href=""><button id="btn-submit" type="button" class="round inred">글쓰기</button></a>
							
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


<script type="text/javascript">
	$("#btn-submit").click(function() {
		var check = confirm("로그인해야 등록가능합니다.");
		
		if(check){
			alert("페이지이동한다");
			location.href='../member/login';
		}
	});

</script>



</body>
</html>