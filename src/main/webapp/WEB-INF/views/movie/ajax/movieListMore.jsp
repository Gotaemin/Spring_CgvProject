<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	

<ol style="height: 420px;">
	<c:forEach var="list" items="${list}" varStatus="i">
		<li>
			<!-- 윗 부분 -->
			<div class="box-image">
				<a href="">
					<span class="thumb-image">
						<img alt="이미지" src="../resources/images/movie/movieList/filmCover/${list.imageName}">
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
				<span class="text-info"> <strong>${list.openDate}<span>개봉</span></strong>
				</span> <span class="like"> <%-- 									
					<a href="./movieReservation?mNum=${list.mNum}" class="link-reservation">예매</a> --%>
					<a href="./movieReservation" class="link-reservation">예매</a>
				</span>
			</div>
		</li>
		
		<c:if test="${i.index % 3 == 0 and i.index ne 0}">
			</ol><ol style="height: 420px;">
		</c:if>

	</c:forEach>
</ol>