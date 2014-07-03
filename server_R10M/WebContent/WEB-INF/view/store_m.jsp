<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<meta charset="EUC-KR">
	
    <title>GO!Gung!</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- 스타일 -->
   
    <link href="../../assets/css/bootstrap-ko.css" rel="stylesheet">
    <link href="../../assets/css/bootstrap-responsive.css" rel="stylesheet">
    
  	<link href="../../assets/css/gogung_main.css" rel="stylesheet">
  	<link href="../../assets/css/gogung_store.css" rel="stylesheet">
  	<link href="../../assets/css/gogung_footer.css" rel="stylesheet">
  	

	<script src="../../assets/js/jquery-1.11.1.js"></script>
	
	<script src="http://openapi.map.naver.com/openapi/naverMap.naver?ver=2.0&key=d1e2a658e5102ec7ea5725ad04fb1fde"></script>
	 
	 
</head>
<body>
		<div class="container">
	
	      <div class="logoimg">
	        <image src="../../assets/img/go_icon_bg.png" alt="logoimg">
	        <p class="logo">10M.com</p>
	      </div>
	
	      <div class="navbar">
	          <div class="container">
	            <ul class="nav">
	              <li><a href="/gogoong/app/main.do">HOME</a></li>
	              <li><a href="/gogoong/app/aboutus.do">ABOUT</a></li>
	              <li><a href="/gogoong/app/store.do">STORE</a></li>
	              <li class="dropdown">
	                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">SERVICE</a>
	                  <ul class="dropdown-menu">
	                    <li><a href="/gogoong/app/faq.do">FAQ</a></li>
	                    <li><a href="/gogoong/app/contactus.do">CONTACT US(e-mail)</a></li>
	                    </ul>
	                </li>
	            </ul>
	          </div>
	      </div><!-- /.navbar -->
	     
	  <!-- 스토어 부분 -->  
	    <hr>
	    
		<div class="hero-unit">  
			
			<p>Gogung is a Cultural Heritage Tour guide system which provides with information and augmented reality guidance system.
it implements function which can describe Cultural Heritage data using the camera view and the almost same explanation told by the local guide.
			</p>
		</div>
		
		
		<div class="row">
			<div class="span4">
				<img id="img_app1" src="../../assets/img/go_icon.png" alt="">
				<h4>Gyeongbokgung APP</h4>
				<p>
					<a  class="btn" href="#">
					download
					<span class="en-font-family"></span>
					</a>
					<a id="button1" class="btn">
					location
					<span class="en-font-family"></span>
					</a>
				</p>
			</div>
			<div class="span4">
				<img id="img_app2" src="../../assets/img/go_icon_2.png" alt="">
				<h4>Changdeokgung APP</h4>
				<p>
					<a class="btn" href="#">
					download
					<span class="en-font-family"></span>
					</a>
					<a id="button2" class="btn">
					location
					<span class="en-font-family"></span>
					</a>
				</p>
			</div>
			<div class="span4">
				<img id="img_app3" src="../../assets/img/go_icon_3.png" alt="">
				<h4>Jongmyo APP</h4>
				<p>
					<a class="btn" href="#">
					download
					<span class="en-font-family"></span>
					</a>
					<a id="button3" class="btn">
					location
					<span class="en-font-family"></span>
					</a>
				</p>
			</div>
		</div>
	   
	   <div id="asd" style="width:550px; margin-left:inherit;">
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
	    <script src="../../assets/js/bootstrap-transition.js"></script>
	    <script src="../../assets/js/bootstrap-carousel.js"></script>
	  	<script src="../../assets/js/bootstrap-dropdown.js"></script>
	 	
	 	<script src="../../assets/js/store_map.js"></script>
		<script src="../../assets/js/store_map2.js"></script>
		 
	 <!--   ================================================== -->
	  <!-- 아래의 js는 현재 필요가 없음(2014.06.10) -->
	 	
	 	<!-- <script src="../assets/js/jquery.js"></script>다른 버전 제이쿼리 사용중-->
	 	<script src="../../assets/js/bootstrap-alert.js"></script>
	    <script src="../../assets/js/bootstrap-modal.js"></script>
	    <script src="../../assets/js/bootstrap-scrollspy.js"></script>
	    <script src="../../assets/js/bootstrap-tab.js"></script>
	    <script src="../../assets/js/bootstrap-tooltip.js"></script>
	    <script src="../../assets/js/bootstrap-popover.js"></script>
	    <script src="../../assets/js/bootstrap-button.js"></script>
	    <script src="../../assets/js/bootstrap-collapse.js"></script>
	    <script src="../../assets/js/bootstrap-typeahead.js"></script>

</body>
</html>