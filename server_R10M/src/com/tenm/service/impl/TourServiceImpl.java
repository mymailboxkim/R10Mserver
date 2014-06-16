package com.tenm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;
import com.tenm.service.TourDao;
import com.tenm.service.TourService;

@Service
public class TourServiceImpl implements TourService {
	
	@Autowired
	@Qualifier("tourDaoImpl")
	private TourDao tourDao;

	/**���� ����Ÿ ������Ƽ ����*/
	@Value("#{locationDetailKrProperties}") Map<String, String> locationDetailKrProperties;
	@Value("#{locationDetailEngProperties}") Map<String, String> locationDetailEngProperties;
	@Value("#{locationNameEngProperties}") Map<String, String> locationNameEngProperties;
	@Value("#{streamingUrlProperties}") Map<String, String> streamingUrlProperties;

	//constructor
	public TourServiceImpl() {
		System.out.println("========== TourServiceImpl Constructor ==========");
	}

	//method
	/**�ѱ� �����̼� ������ ����Ʈ*/
	public List getLocationDataKrList(String areaName) {	//��üLocationInfo�� List�� ����
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationDetail(locationDetailKrProperties(locationList.get(i)));	
		}
		return locationList;
	}
	
	/**���� �����̼� ������ ����Ʈ*/
	public List getLocationDataEngList(String areaName) {	//��üLocationInfo�� List�� ����
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationName(locationNameEngProperties(locationList.get(i)));
			locationList.get(i).setLocationDetail(locationDetailEngProperties(locationList.get(i)));
		}
		return locationList;
	}
	
	/**�ѱ� �����̼� ������ ��*/
	public Map getLocationDataKrMap(String areaName) {	
		Map<String, LocationInfo> serverLocationMap = tourDao.getLocationDataMap(areaName);
		Map<String, LocationInfo> locationMap = new HashMap();
		for (String key : serverLocationMap.keySet()) {
			LocationInfo locationInfo = serverLocationMap.get(key);
			locationInfo.setLocationDetail(locationDetailKrProperties(locationInfo));
			locationMap.put(locationInfo.getLocationName(), locationInfo);
		}
		return locationMap;
	}

	/**��Ʈ���� ���� url*/
	public String getStremingUrl(String locationName){
		return getStreamingUrlProperties(locationName);
	}
	
	/**���� ��������*/
	public LocationInfo getBeaconRegion(Beacon beacon) {
		if(beacon.getUuid().equals("8492E75F-4FD6-469D-B132-043FE94921D8")
				&& beacon.getMajor() == 104
				&& beacon.getMinor() == 51){
			return new LocationInfo(37.497942, 127.027621, 0, "������",
					"��������ö 2ȣ���� �źд缱�� ȯ�¿����� 2ȣ�� ���뿪�� ���￪ ���̿� �ְ�,"
					+ " �źд缱�� ���������̴�. 1982�� 12�� 23�� ����������, "
					+ "2011�� 10�� 28�� �źд缱�� Ȯ�� ����Ǿ���. "
					+ "�������� �߽ɺο� ��ġ�ϰ� �־� ���������� ���Ǿ���. "
					+ "�츮������ ��ö�� �� ���� �պ�� �� �� �ϳ���, "
					+ "�� �ֺ��� �����, �����߾ӵ�����(��������)�� Ư��û(����繫��) ���� �ִ�. "
					+ "2ȣ���� �����Ʈ�� �Ҽ�, �źд缱�� �׿�Ʈ�����ֽ�ȸ�� �Ҽ��̸�, "
					+ "2ȣ���� ����Ư���� ������ ������� ���� 396����(���ﵿ 804����), "
					+ "�źд缱�� ����Ư���� ������ ������� ���� 390����(���ﵿ 825����)�� �ִ�.");
		}else{
			return null;
		}
	}
	
	
	
	//private method
	/**�ѱ� �����̼� �����Ϳ� ������ ������Ƽ ����*/
	private String locationDetailKrProperties(LocationInfo locationInfo){
		return (String)locationDetailKrProperties.get(locationInfo.getLocationName());
	}
	
	/**���� �����̼� �����Ϳ� ������ ������Ƽ ����*/
	private String locationDetailEngProperties(LocationInfo locationInfo){
		return (String)locationDetailEngProperties.get(locationInfo.getLocationName());
	}
	
	/**���� �����̼� �����Ϳ� ���� ������Ƽ ����*/
	private String locationNameEngProperties(LocationInfo locationInfo){
		return (String)locationNameEngProperties.get(locationInfo.getLocationName());
	}
	
	/**��Ʈ���� url*/
	private String getStreamingUrlProperties(String locationName){
		return (String)streamingUrlProperties.get(locationName);
	}
	
	
}
