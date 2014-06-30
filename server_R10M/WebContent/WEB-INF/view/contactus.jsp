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
   
    <link href="../../assets/css/bootstrap-ko.css" rel="stylesheet">
    <link href="../../assets/css/bootstrap-responsive.css" rel="stylesheet">
    
  	<link href="../../assets/css/gogung_main.css" rel="stylesheet">
  	<link href="../../assets/css/gogung_content.css" rel="stylesheet">
  	<link href="../../assets/css/gogung_footer.css" rel="stylesheet">
  	
  	
	
	<!-- 문의하기 (Contact Us) 화면  -->
	<link href="../../assets/css/gogung_service.css" rel="stylesheet">
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
              <li><a href="/gogoong/main.do">HOME</a></li>
	              <li><a href="/gogoong/aboutus.do">ABOUT</a></li>
	              <li><a href="/gogoong/store.do">STORE</a></li>
	              <li class="dropdown">
	                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">SERVICE</a>
	                  <ul class="dropdown-menu">
	                    <li><a href="/gogoong/faq.do">FAQ</a></li>
	                    <li><a href="/gogoong/contactus.do">CONTACT US(e-mail)</a></li>
	                    </ul>
	            </li>
            </ul>
          </div>
      </div><!-- /.navbar -->
     
    <!-- CONTACT US 시작 부분 -->
 	<hr>
	<div id="contactus" class="service">
	
		<div id="contact_title" class="service_title">
			<img alt="" src="../../assets/img/title.jpg">
			<h2>Contact</h2><h2 style="color: white; left: 62%"> Us</h2>
		</div>
		
 		<div id="contact_text" class="contact_left">
 			<div class="contact_text">
		 		<p class="font_8">BitAcademy 301</p>
				<p class="font_8">1327-15 </p>
				<p class="font_8">Seocho-dong, Seocho-gu</p>
				<p class="font_8">Seoul, Korea</p>
				<p class="font_8">10M.com</p>
				<p class="font_8">Tel: 02-3486-9600&nbsp;</p>
				<p class="font_8">Fax: 02-6007-1245</p>
			</div>
			<img alt="" src="../../assets/img/contact_us.jpg">
		</div>
				
 		<div id="contact_form" class="contact_form">
			<input type="text" name="Name" class="required" placeholder="Name" >
			<input type="text" name="Email" class="required" placeholder="Email">
			<input type="text" name="Subject" class="" placeholder="Subject">
			<textarea name="Message" class="" placeholder="Message"></textarea>
			<button>Send</button><span skinpart="notifications"></span>
 		</div>
 		
	</div>
 
  	<!-- CONTACT US 시작 부분 -->
 
   	
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