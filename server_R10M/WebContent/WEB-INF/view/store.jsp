<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<meta charset="EUC-KR">
	
    <title>고궁 웹 ver.1.7</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- 스타일 -->
   
    <link href="../assets/css/bootstrap-ko.css" rel="stylesheet">
    <link href="../assets/css/bootstrap-responsive.css" rel="stylesheet">
    
  	<link href="../assets/css/gogung_main.css" rel="stylesheet">
  	<link href="../assets/css/gogung_store.css" rel="stylesheet">
  	<link href="../assets/css/gogung_footer.css" rel="stylesheet">
  	

	<script src="../assets/js/jquery-1.11.1.js"></script>
	
	<script src="http://openapi.map.naver.com/openapi/naverMap.naver?ver=2.0&key=3e41a7b4267bdfdc1da0aca7b735369b"></script>
	 
	 
</head>
<body>
		<div class="container">
	
	      <div class="logoimg">
	        <image src="../assets/img/go_icon_bg.png" alt="logoimg">
	        <p class="logo">10M.com</p>
	      </div>
	
	      <div class="navbar">
	          <div class="container">
	            <ul class="nav">
	            <li><a href="/main.do">HOME</a></li>
	              <li><a href="/aboutus.do">ABOUT</a></li>
	              <li><a href="/store.do">STORE</a></li>
	              <li class="dropdown">
	                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">SERVICE</a>
	                  <ul class="dropdown-menu">
	                    <li><a href="/faq.do">FAQ</a></li>
	                    <li><a href="/contactus.do">CONTACT US(e-mail)</a></li>
	                    </ul>
	                </li>
	            </ul>
	          </div>
	      </div><!-- /.navbar -->
	     
	  <!-- 스토어 부분 -->  
	    <hr>
	    
		<div class="hero-unit">  
			
			<p>[고궁]은 문화유산 관광안내로 문화재 정보를 현장에서 바로 안내 받을 수 있는 증각현실 문화유산 무인안내시스템입니다. 스마트폰의 카메라를 통해 들어오는 실제영상을 통해 gps를 통해 마치 관광명소에서 현지가이드가 설명하는것처럼 문화유산 해설 기능을 구현한 앱입니다.
			</p>
		</div>
		
		<div class="row">
			<div class="span4">
				<img id="img_app1" src="../assets/img/go_icon.png" alt="">
				<h4>경복궁APP</h4>
				<p>
					<a class="btn" href="#">
					다운로드
					<span class="en-font-family"></span>
					</a>
				</p>
			</div>
			<div class="span4">
				<img id="img_app2" src="../assets/img/go_icon_2.png" alt="">
				<h4>창덕궁APP</h4>
				<p>
					<a class="btn" href="#">
					다운로드
					</a>
				</p>
			</div>
			<div class="span4">
				<img id="img_app3" src="../assets/img/go_icon_3.png" alt="">
				<h4>종묘APP</h4>
				<p>
					<a class="btn" href="#">
					다운로드
					<span class="en-font-family"></span>
					</a>
				</p>
			</div>
		</div>
	   
	   <div id="asd" style="width:600px; margin-left:inherit;">
	   	<div id = "naverMap" 
	   	style="border:1px solid #000; 
	   	width:700px; 
	   	height:400px; 
	   	margin:20px; 
	   	display:block;"></div>
	</div>
	
	
	      <div class="footer" >
	       	<p align="left" style="margin-bottom: 0px; padding-top: 5px; padding-left: 10px;">&copy; 2014 / cooperation.10M</p> 
	      </div>
	
	 </div> <!-- /container -->
	
	    <!-- 자바스크립트
	    ================================================== -->
	    <!-- 페이지를 빨리 읽어들이도록 문서 마지막에 배치 -->
	    <script src="../assets/js/bootstrap-transition.js"></script>
	    <script src="../assets/js/bootstrap-carousel.js"></script>
	  	<script src="../assets/js/bootstrap-dropdown.js"></script>
	 	
	 	<script src="../assets/js/store_map.js"></script>
		<script src="../assets/js/store_map2.js"></script>
		 
	 <!--   ================================================== -->
	  <!-- 아래의 js는 현재 필요가 없음(2014.06.10) -->
	 	
	 	<!-- <script src="../assets/js/jquery.js"></script>다른 버전 제이쿼리 사용중-->
	 	<script src="../assets/js/bootstrap-alert.js"></script>
	    <script src="../assets/js/bootstrap-modal.js"></script>
	    <script src="../assets/js/bootstrap-scrollspy.js"></script>
	    <script src="../assets/js/bootstrap-tab.js"></script>
	    <script src="../assets/js/bootstrap-tooltip.js"></script>
	    <script src="../assets/js/bootstrap-popover.js"></script>
	    <script src="../assets/js/bootstrap-button.js"></script>
	    <script src="../assets/js/bootstrap-collapse.js"></script>
	    <script src="../assets/js/bootstrap-typeahead.js"></script>

</body>
</html>