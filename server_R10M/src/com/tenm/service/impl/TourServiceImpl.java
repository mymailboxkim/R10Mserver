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
	@Value("#{beaconDetailKrProperties}") Map<String, String> beaconDetailKrProperties;
	@Value("#{beaconDetailEngProperties}") Map<String, String> beaconDetailEngProperties;
	@Value("#{NameEngProperties}") Map<String, String> NameEngProperties;
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
	
	/**�ѱ� ���� ������*/
	public Beacon getBeaconDataKr(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionDetail(beaconDetailKrProperties(beaconInfo));
		return beaconInfo;
	}
	
	/**���� ���� ������*/
	public Beacon getBeaconDataEng(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionName(beaconNameEngProperties(beaconInfo));
		beaconInfo.setRegionDetail(beaconDetailEngProperties(beaconInfo));
		return beaconInfo;
	}

	/**��Ʈ���� ���� url*/
	public String getStremingUrl(String locationName){
		return getStreamingUrlProperties(locationName);
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
		return (String)NameEngProperties.get(locationInfo.getLocationName());
	}
	
	/**�ѱ� ���� �����Ϳ� ������ ������Ƽ ����*/
	private String beaconDetailKrProperties(Beacon beacon){
		return (String)beaconDetailKrProperties.get(beacon.getRegionName());
	}
	
	/**���� ���� �����Ϳ� ������ ������Ƽ ����*/
	private String beaconDetailEngProperties(Beacon beacon){
		return (String)beaconDetailEngProperties.get(beacon.getRegionName());
	}
	
	/**���� ���� �����Ϳ� ���� ������Ƽ ����*/
	private String beaconNameEngProperties(Beacon beacon){
		return (String)NameEngProperties.get(beacon.getRegionName());
	}
	
	
	/**��Ʈ���� url*/
	private String getStreamingUrlProperties(String locationName){
		return (String)streamingUrlProperties.get(locationName);
	}
	
	
}
