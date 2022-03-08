<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>H E L P</title>
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
<div id = "middleMenu">
	<div class = "menuContainer">
		<section class = "menuContainer">
			<article class = "member">
			<p>
			<span class="menuTitle" id="meDtInfo" onClick="meDtInfo()">프로필</span>
			</p>
			<p>
			<span class="menuTitle" id="meInbodyMg" onClick="meInbodyMg()">인바디</span>
			</p>
			<p>
			<span class="menuTitle" id="psInBodyMg" onClick="psInBodyMg()">운동추천</span>
			</p>
			<p>
			<span class="menuTitle" id="meFoodMg" onClick="meFoodMg()">음식추천</span>
			</p>
</article>
</section>
</div>
</div>
	<div id="bottom">
		<div id="list">${list }</div>
	</div>

</body>
</html>