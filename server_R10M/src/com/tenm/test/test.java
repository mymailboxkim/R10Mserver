package com.tenm.test;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;
import com.tenm.service.TourDao;
import com.tenm.service.TourService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/commonservice.xml"})
public class test {
	
	@Autowired
	@Qualifier("tourServiceImpl")
	private TourService tourService;
	
	@Autowired
	@Qualifier("tourDaoImpl")
	private TourDao tourDao;
	
	@Test
	public void testGetBeaconInfoService() throws Exception{
		Beacon beacon = new Beacon();
		beacon.setUuid("8492e75f-4fd6-469d-b132-043-fe94921d8");
		beacon.setMajor(11305);
		beacon.setMinor(19481);
		System.out.println(tourService.getBeaconDataKr(beacon));
		System.out.println(tourService.getBeaconDataEng(beacon));
	}
	
	//@Test
	public void testGetBeaconInfoDao() throws Exception{
		Beacon beacon = new Beacon();
		beacon.setUuid("8492e75f-4fd6-469d-b132-043-fe94921d8");
		beacon.setMajor(11305);
		beacon.setMinor(19481);
		System.out.println(tourDao.getBeaconRegion(beacon));
	}
	
	/*
	@Value("#{dataProperties}") Map map;	//data.properties ������ ��簪�� Map���� ����

	@Test
	public void testGetLocationInfo() throws Exception{
		System.out.println(tourService.getLocationListJSON(""));
	}
	
	//@Test
	public void testGetMapper() throws Exception{
		System.out.println(tourDao.getLocationMapJSON(""));
	}
	
	//@Test
	public void testGetLocation() throws Exception{
		System.out.println(tourService.getLocationJSON("������"));
	}
	
	/*
	//@Test
	public void testGetLocal() throws Exception{
		System.out.println(tourService.getLocalInfo());
	}
	
	@Test
	public void testGetDataByLocal() throws Exception{
				
		//��ȭ�� Ŭ��
		int localNo = tourService.getLocalInfo().get(0).getLocalNo(); //ȭ�鿡�� ����Ŭ���� �� ������ localNo ����
		System.out.println("localNo : "+localNo);
		System.out.println("=================================");
		
		for (Data data : tourService.getDataByLocal(localNo)) {	//local�� �ش�Ǵ� ��� ������
			int dataNo = data.getDataNo();
			int dataType = data.getDataType();
			String dataPath = data.getDataPath();
			
			System.out.println("dataNo : " + dataNo);
			System.out.println("dataPath : " + dataPath);
			System.out.print("dataType : " + dataType );
			
			switch (dataType) {
			case 1:	//DataType : Text
				System.out.println(" Text");
				System.out.println(dataPath + " : " + map.get(dataPath));
				break;
			case 2:	//DataType : Image
				System.out.println(" Image");
				dataPath = "upfolder/image/"+dataPath;
				System.out.println(dataPath);
				break;
			case 3:	//DataType : Voice
				System.out.println(" Voice");
				dataPath = "upfolder/voice/"+dataPath;
				System.out.println(dataPath);
				break;
			case 4:	//DataType : VOD
				System.out.println(" VOD");
				dataPath = "upfolder/vod/"+dataPath;
				System.out.println(dataPath);
				break;
			default:
				break;
			}
		}
	}
	
	//@Test
	public void testGetBeacon() throws Exception{
		Beacon beacon = new Beacon();
		beacon.setUuid("8492e75f-4fd6-469d-b132-043-fe94921d8");
		beacon.setMajor(11305);
		beacon.setMinor(19481);
		System.out.println(tourService.findBeacon(beacon));
	}
	
	//@Test
	public void testGetDataByRegion() throws Exception{
		Beacon beacon = new Beacon();
		beacon.setUuid("8492e75f-4fd6-469d-b132-043-fe94921d8");
		beacon.setMajor(11305);
		beacon.setMinor(19481);
		System.out.println(tourService.getDataByBeacon(beacon));
	}
*/		
}
