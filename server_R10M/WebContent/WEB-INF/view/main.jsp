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
  	
  	<!-- 이미지 슬라이드 메인 화면 -->
  	<link href="../../assets/css/js-image-slider_1.css" rel="stylesheet" type="text/css" />
    <script src="../../assets/js/js-image-slider_1.js" type="text/javascript"></script>
  	
  	<!-- 이미지 슬라이드 배너형식 이벤트 화면 -->
  	<link href="../../assets/css/gogung_content_2.css" rel="stylesheet">
	<script src="../../assets/js/jquery-1.11.1.js"></script>
	<script src="../../assets/js/slider.js"></script>
	
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
	     
	  <!-- 이미지 슬라이드 메인 부분 -->  
	    
		<div class="carousel-inner">  
			<div id="sliderFrame">
				<div id="slider">
	                <img src="../../assets/img/1.png" />
	                <!-- <img src="../assets/img/1.png" alt="1번 슬라이드입니다." /> -->
		            <img src="../../assets/img/2.png" />
		            <img src="../../assets/img/3.png" />
		            <img src="../../assets/img/4.png" />
		            <img src="../../assets/img/5.png" />
		            <img src="../../assets/img/6.png" />
		            <img src="../../assets/img/7.png" />
		            <img src="../../assets/img/8.png" />
		            <img src="../../assets/img/9.png" />
		            <img src="../../assets/img/10.png"/>
	           	</div>
			</div>
		</div>
	    
	  <!-- 이미지 슬라이드 메인 하단 배너형식 이벤트 부분 -->  
	  
	    <div id="contentImage" class="content">
	  		<div class="animation_canvas">
	
				 <div class="control_panel">
		            <div class="control_button"></div>
		            <div class="control_button"></div>
		            <div class="control_button"></div>
		          </div>
		
		         <div class="slider_panel">
		            <img id="image1" alt="" src="../../assets/img/11.png" />
		            <img id="image1" alt="" src="../../assets/img/12.png" />
		            <img id="image1" alt="" src="../../assets/img/13.png" />
		         </div>
	          </div>
	       
	   		<div id="banner" class="banner">
	   			<h5>Relation Site</h5>
		   		<a href="http://www.royalpalace.go.kr"><img alt="" src="../../assets/img/iteam1.png"></a>
		   		<a href="http://www.deoksugung.go.kr"><img alt="" src="../../assets/img/iteam2.png"></a>
		   		<a href="http://www.cha.go.kr"><img alt="" src="../../assets/img/iteam3.png"></a>
		   		<a href="http://jm.cha.go.kr"><img alt="" src="../../assets/img/iteam4.png"></a>
		   		<a href="http://www.cdg.go.kr"><img alt="" src="../../assets/img/iteam5.png"></a>
		   		<a href="http://www.chf.or.kr"><img alt="" src="../../assets/img/iteam6.png"></a>
	   		</div>
	   		
	   		<div id="store" class="store">
		   	<h3>Store</h3><a href="/gogung/store.do"><h5>more></h5></a>
		   	
	    	    <table>
		          <tr>
		            <td class="contxt" style="height:60px;"><a href="gogung_store.html"><img id="image2" alt="" src="../../assets/img/go_icon.png"/></a></td>
		          	<td  style="height:60px;"><a href="/gogung/store.do">&nbsp;&nbsp;Gyeongbokgung<br>&nbsp;&nbsp; Guide Application </a></td>
		          </tr>
		          <tr>
		            <td class="contxt"><a href="gogung_store.html"><img id="image2" alt="" src="../../assets/img/go_icon_2.png"/></a></td>
		          	<td><a href="/gogung/store.do">&nbsp;&nbsp;Changdeokgung<br>&nbsp;&nbsp; Guide Application </a></td>
		          </tr>
		   	    </table>        
	   		</div>
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