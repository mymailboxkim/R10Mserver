 
var oPoint = new nhn.api.map.LatLng(37.578734, 126.985299);//�����߽��� ��ǥ
    nhn.api.map.setDefaultPoint('LatLng');
    oMap = new nhn.api.map.Map('naverMap', {
        center : oPoint,
        level : 10, // �� �ʱ� �� 10.
        enableWheelZoom : true,
        enableDragPan : true,
        enableDblClickZoom : false,
        mapMode : 0,
        activateTrafficMap : false,
        activateBicycleMap : false,
        activateRealtyMap : true,
        minMaxLevel : [ 1, 14 ],
        size : new nhn.api.map.Size(500, 300) //map size
    });
    //��ǥ���
    var oPoint1 = new nhn.api.map.LatLng(37.579613,126.977062);//�溹��
    var oPoint2 = new nhn.api.map.LatLng(37.582705, 126.991992);//â����
    var oPoint3 = new nhn.api.map.LatLng(37.574570,126.994111);//����
 	//��Ŀ ���
    var oSize = new nhn.api.map.Size(28, 37);
    var oOffset = new nhn.api.map.Size(14, 37);
    var oIcon = new nhn.api.map.Icon('http://static.naver.com/maps2/icons/pin_spot2.png', oSize, oOffset);
 
    //�溹�� ��Ŀ
    var oMarker1 = new nhn.api.map.Marker(oIcon, { title : '�溹��' });  //��Ŀ ����
    oMarker1.setPoint(oPoint1); //��Ŀ ǥ���� ��ǥ ����
    oMap.addOverlay(oMarker1); //��Ŀ�� �������� ǥ��
    
  	//�溹�� ��
    var oLabel1 = new nhn.api.map.MarkerLabel(); // - ��Ŀ �� ����.
    oMap.addOverlay(oLabel1); // - ��Ŀ �� ������ �߰�. �⺻�� ���� ������ �ʴ� ���·� �߰���.
    oLabel1.setVisible(true, oMarker1); // ��Ŀ �� ���̱�
    
    
    //â���� ��Ŀ
    var oMarker2 = new nhn.api.map.Marker(oIcon, { title : 'â����' });  //��Ŀ ����
    oMarker2.setPoint(oPoint2); //��Ŀ ǥ���� ��ǥ ����
    oMap.addOverlay(oMarker2); //��Ŀ�� �������� ǥ��
    
    //â���� ��
    var oLabel2 = new nhn.api.map.MarkerLabel(); // - ��Ŀ �� ����.
    oMap.addOverlay(oLabel2); // - ��Ŀ �� ������ �߰�. �⺻�� ���� ������ �ʴ� ���·� �߰���.
    oLabel2.setVisible(true, oMarker2); // ��Ŀ �� ���̱�
    
    
    //���� ��Ŀ
    var oMarker3 = new nhn.api.map.Marker(oIcon, { title : '����' });  //��Ŀ ����
    oMarker3.setPoint(oPoint3); //��Ŀ ǥ���� ��ǥ ����
    oMap.addOverlay(oMarker3); //��Ŀ�� �������� ǥ��
    
    //���� ��
    var oLabel3 = new nhn.api.map.MarkerLabel(); // - ��Ŀ �� ����.
    oMap.addOverlay(oLabel3); // - ��Ŀ �� ������ �߰�. �⺻�� ���� ������ �ʴ� ���·� �߰���.
    oLabel3.setVisible(true, oMarker3); // ��Ŀ �� ���̱�