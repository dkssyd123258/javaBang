<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center>
	<table class="table">
	<tr><%@include file="/WEB-INF/views/roomSerachForm.jsp" %>
	<tr>
	<td><h1>방타입 : </h1>
	<td>
	<!-- --------------------------------------- -->
	<c:if test="${roomList.sr_roomsize==1}">
	<h1>원룸</h1>
	</c:if>
	
		<tr>
			<th bgcolor="#3300FF"><font color="white">확인매물 {DB날짜}</font>
			<th bgcolor="#33FFFF"colspan="8" align="left"><font color="white">방주인과 공인중개사가 거래정보확인</font>
		<tr>
			<%-- <c:if test="{db건물종류}"> --%>
			 <!-- 원룸및투룸쓰리룸--> 
			<td width="10%">
			¤해당층/건물층 
			<td width="10%">
			{위DATA}
			<td width="10%">
			¤전용/공급면적
			<td width="10%">
			{위DATA}
			<td width="10%">
			¤난방종류
			<td width="10%">
			${roomList.hc_type}
			<td width="10%">
			¤빌트인
			<td width="10%">
			{위DATA}
			<%-- </c:if> --%>
		<tr>
			<%-- <c:if test="{db건물종류}"> --%>
			<!-- 원룸및투룸쓰리룸 -->
			<td width="10%">
			¤엘리베이터
			<td width="10%">
			${roomList.elv_available}
			<td width="10%">
			¤반려동물
			<td width="10%">
			${roomList.pet_available}
			<td width="10%">
			¤베란다/발코니
			<td width="10%">
			{위DATA}
			<td width="10%">
			¤전세자금대출
			<td width="10%">
			{위DATA}
			<%-- </c:if> --%>
		<tr>
			<%-- <c:if test="{db건물종류}"> --%>
			<td width="10%">
			<!-- 원룸및투룸쓰리룸 -->
			¤입주가능일
			<td width="10%">
			{위DATA}
			<%-- </c:if> --%>
			<!-- --------------------------------------- -->
	</table>
	<div style="height:20"></div>
	<table>
		<tr>
			<td rowspan="2"><img src='resources/img/a.jpg' width='600' border='1'height='410'>
			<td ><img src='resources/img/a.jpg' width='300' border='1'height='200'>
			<td><img src='resources/img/a.jpg' width='300' border='1'height='200'>
		<tr>
			
			<td><img src='resources/img/a.jpg' width='300' border='1'height='200'>
			<td><img src='resources/img/a.jpg' width='300' border='1'height='200'>
	</table>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
	<div>정보</div>
							
	<div id="map" style="width:500;height:600;z-index:1;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=070c6cc88e915ecf5709587531f200a4&libraries=services"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=070c6cc88e915ecf5709587531f200a4"></script>
	
	<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = {
        center: new kakao.maps.LatLng(37.478690, 126.87869), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };  

// 지도를 생성합니다    
var map = new kakao.maps.Map(mapContainer, mapOption); 

// 주소-좌표 변환 객체를 생성합니다
var geocoder = new kakao.maps.services.Geocoder();

// 주소로 좌표를 검색합니다
geocoder.addressSearch('${roomList.sr_mainaddr}', function(result, status) {

    // 정상적으로 검색이 완료됐으면 
     if (status == kakao.maps.services.Status.OK) {

        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

        // 결과값으로 받은 위치를 마커로 표시합니다
        var marker = new kakao.maps.Marker({
            map: map,
            position: coords
        });

   

        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        map.setCenter(coords);
    } 
});    
</script>
<div>${roomList.sr_mainaddr}</div>
</center>
</body>
</html>