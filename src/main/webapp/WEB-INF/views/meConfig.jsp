<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body onLoad = "infoLine()">
<div id = "topMenu">
	<div class = "menuContainer">
	<section class = "menuContainer">
	<article class="topmenu">
	<span class="topMenu" id="meConfig" onClick="meConfig()">환경설정</span>
	<span class="topMenu" id="getLessonMg" onClick="getLessonMg()">레슨</span>
	<span class="topMenu" id="logOut" onClick="logOut()">로그아웃</span>
	</article>
	</section>
	</div>
</div>
<div>
<div class = "profile">
<span class = "email">${meEmail }</span><br>
<span class = "meGender">${meGender }</span><br>
<span class = "meBirth">${meBirth }</span><br>
<span class = "meName">${meName }</span><br>
<span class = "meNumber">${meNumber }</span>
</div>
<div>
<input class = "modMeMg" onClick = "modMeMg(mod)" type = "button" value = "수정"></input>
<input class = "modMeMg" onClick = "modMeMg(save)" type = "button" value = "확인"></input>
</div>
<form name = "delMe">
	<div id="bottom" onClick = "openModal()">회원 탈퇴</div>
	<!-- 모달 제어-->
	<div class="container" id="container">
		<div class="mdialog">
			<div class="mcontent">
				<!-- 모달헤더 -->
				<div class="mheader" id = "mheader">
					<h4 class="mtitle">회원탈퇴</h4>
				</div>
				<!-- 모달 푸터 -->
				<div class="mfooter">
					<button type="button" class="mbtn" value = "취소" onclick="closeModal()">취소</button>
					<input type="button" class="mbtn" name = "modalmod" value = "확인"/>
				</div>
			</div>
		</div>
	</div>
	</form>
</div>


</body>
</html>