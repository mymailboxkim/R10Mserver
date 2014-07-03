//좌표등록
var oPoint1 = new nhn.api.map.LatLng(37.579613, 126.977062);//창덕궁
var oPoint2 = new nhn.api.map.LatLng(37.582705, 126.991992);//창덕궁
var oPoint3 = new nhn.api.map.LatLng(37.574570,126.994111);//종묘

var oPoint1 = new nhn.api.map.LatLng(37.579613, 126.977062);//지도중심점 좌표
nhn.api.map.setDefaultPoint('LatLng');
oMap = new nhn.api.map.Map('naverMap', {
    center : oPoint1,
    level : 10, // 줌 초기 값 10.
    enableWheelZoom : false,
    enableDragPan : true,
    enableDblClickZoom : false,
    mapMode : 0,
    activateTrafficMap : false,
    activateBicycleMap : false,
    activateRealtyMap : true,
    minMaxLevel : [ 1, 14 ],
    size : new nhn.api.map.Size(500, 300) //map size
});
	button1.onclick = function() {
		oMap.setCenter(oPoint1);
	};
	
	button2.onclick = function() {
		oMap.setCenter(oPoint2);
	};
	
	button3.onclick = function() {
		oMap.setCenter(oPoint3);
	};
 	//마커 등록
    var oSize = new nhn.api.map.Size(28, 37);
    var oOffset = new nhn.api.map.Size(14, 37);
    var oIcon = new nhn.api.map.Icon('http://static.naver.com/maps2/icons/pin_spot2.png', oSize, oOffset);
    
    //경복궁 마커
    var oMarker1 = new nhn.api.map.Marker(oIcon, { title : 'Gyeongbokgung' });  //마커 생성
    oMarker1.setPoint(oPoint1); //마커 표시할 좌표 선택
    oMap.addOverlay(oMarker1); //마커를 지도위에 표현
    
  	//경복궁 라벨
    var oLabel1 = new nhn.api.map.MarkerLabel(); // - 마커 라벨 선언.
    oMap.addOverlay(oLabel1); // - 마커 라벨 지도에 추가. 기본은 라벨이 보이지 않는 상태로 추가됨.
    oLabel1.setVisible(true, oMarker1); // 마커 라벨 보이기
    
    //창덕궁 마커
    var oMarker2 = new nhn.api.map.Marker(oIcon, { title : 'Changdeokgung' });  //마커 생성
    oMarker2.setPoint(oPoint2); //마커 표시할 좌표 선택
    oMap.addOverlay(oMarker2); //마커를 지도위에 표현
    
    //창덕궁 라벨
    var oLabel2 = new nhn.api.map.MarkerLabel(); // - 마커 라벨 선언.
    oMap.addOverlay(oLabel2); // - 마커 라벨 지도에 추가. 기본은 라벨이 보이지 않는 상태로 추가됨.
    oLabel2.setVisible(true, oMarker2); // 마커 라벨 보이기
    
    //종묘 마커
    var oMarker3 = new nhn.api.map.Marker(oIcon, { title : 'Jongmyo' });  //마커 생성
    oMarker3.setPoint(oPoint3); //마커 표시할 좌표 선택
    oMap.addOverlay(oMarker3); //마커를 지도위에 표현
    
    //종묘 라벨
    var oLabel3 = new nhn.api.map.MarkerLabel(); // - 마커 라벨 선언.
    oMap.addOverlay(oLabel3); // - 마커 라벨 지도에 추가. 기본은 라벨이 보이지 않는 상태로 추가됨.
    oLabel3.setVisible(true, oMarker3); // 마커 라벨 보이기