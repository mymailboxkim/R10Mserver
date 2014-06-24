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

	/**데이타 프로퍼티 세팅*/
	@Value("#{locationDetailKrProperties}") Map<String, String> locationDetailKrProperties;
	@Value("#{locationDetailEngProperties}") Map<String, String> locationDetailEngProperties;
	@Value("#{locationDetailJpProperties}") Map<String, String> locationDetailJpProperties;
	@Value("#{beaconDetailKrProperties}") Map<String, String> beaconDetailKrProperties;
	@Value("#{beaconDetailEngProperties}") Map<String, String> beaconDetailEngProperties;
	@Value("#{beaconDetailJpProperties}") Map<String, String> beaconDetailJpProperties;
	@Value("#{locationNameEngProperties}") Map<String, String> locationNameEngProperties;
	@Value("#{locationNameJpProperties}") Map<String, String> locationNameJpProperties;
	@Value("#{streamingUrlProperties}") Map<String, String> streamingUrlProperties;

	//constructor
	public TourServiceImpl() {
		System.out.println("========== TourServiceImpl Constructor ==========");
	}

	//method
	/**한글 로케이션 데이터 리스트*/
	public List getLocationDataKrList(String areaName) {
		System.out.println(areaName);
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationDetail(locationDetailKrProperties(locationList.get(i)));
			//System.out.println(locationList.get(i).toString());
			
		}
		return locationList;
	}
	
	/**영문 로케이션 데이터 리스트*/
	public List getLocationDataEngList(String areaName) {
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationName(locationNameEngProperties(locationList.get(i)));
			locationList.get(i).setLocationDetail(locationDetailEngProperties(locationList.get(i)));
		}
		return locationList;
	}
	
	/**일본어 로케이션 데이터 리스트*/
	public List getLocationDataJpList(String areaName) {
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationName(locationNameJpProperties(locationList.get(i)));
			locationList.get(i).setLocationDetail(locationDetailJpProperties(locationList.get(i)));
		}
		return locationList;
	}
	
	/**한글 로케이션 데이터 맵*/
	public Map getLocationDataKrMap(String areaName) {
		System.out.println("========== JSON map service ==========");
		Map<String, LocationInfo> serverLocationMap = tourDao.getLocationDataMap(areaName);
		Map<String, LocationInfo> locationMap = new HashMap<String, LocationInfo>();
		for (String key : serverLocationMap.keySet()) {
			LocationInfo locationInfo = serverLocationMap.get(key);
			locationInfo.setLocationDetail(locationDetailKrProperties(locationInfo));
			locationMap.put(locationInfo.getLocationName(), locationInfo);
		}
		return locationMap;
	}
	
	/**한글 비콘 지역정보*/
	public Beacon getBeaconDataKr(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionDetail(beaconDetailKrProperties(beaconInfo));
		return beaconInfo;
	}
	
	/**영문 비콘 지역정보*/
	public Beacon getBeaconDataEng(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionName(beaconNameEngProperties(beaconInfo));
		beaconInfo.setRegionDetail(beaconDetailEngProperties(beaconInfo));
		return beaconInfo;
	}
	
	/**일본어 비콘 지역정보*/
	public Beacon getBeaconDataJp(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionName(beaconNameJpProperties(beaconInfo));
		beaconInfo.setRegionDetail(beaconDetailJpProperties(beaconInfo));
		return beaconInfo;
	}

	/**스트리밍 서버 url*/
	public String getStremingUrl(String locationName){
		return getStreamingUrlProperties(locationName);
	}
	
	
	
	//private method
	/**한글 로케이션 데이터에 디테일 프로퍼티 주입*/
	private String locationDetailKrProperties(LocationInfo locationInfo){
		return (String)locationDetailKrProperties.get(locationInfo.getLocationName());
	}
	
	/**영문 로케이션 데이터에 디테일 프로퍼티 주입*/
	private String locationDetailEngProperties(LocationInfo locationInfo){
		return (String)locationDetailEngProperties.get(locationInfo.getLocationName());
	}
	
	/**영문 로케이션 데이터에 네임 프로퍼티 주입*/
	private String locationNameEngProperties(LocationInfo locationInfo){
		return (String)locationNameEngProperties.get(locationInfo.getLocationName());
	}
	
	/**일본어 로케이션 데이터에 디테일 프로퍼티 주입*/
	private String locationDetailJpProperties(LocationInfo locationInfo){
		return (String)locationDetailJpProperties.get(locationInfo.getLocationName());
	}
	
	/**일본어 로케이션 데이터에 네임 프로퍼티 주입*/
	private String locationNameJpProperties(LocationInfo locationInfo){
		return (String)locationNameJpProperties.get(locationInfo.getLocationName());
	}
	
	/**한글 비콘 데이터에 디테일 프로퍼티 주입*/
	private String beaconDetailKrProperties(Beacon beacon){
		return (String)beaconDetailKrProperties.get(beacon.getRegionName());
	}
	
	/**영문 비콘 데이터에 디테일 프로퍼티 주입*/
	private String beaconDetailEngProperties(Beacon beacon){
		return (String)beaconDetailEngProperties.get(beacon.getRegionName());
	}
	
	/**영문 비콘 데이터에 네임 프로퍼티 주입*/
	private String beaconNameEngProperties(Beacon beacon){
		return (String)locationNameEngProperties.get(beacon.getRegionName());
	}
	
	/**일본어 비콘 데이터에 디테일 프로퍼티 주입*/
	private String beaconDetailJpProperties(Beacon beacon){
		return (String)beaconDetailJpProperties.get(beacon.getRegionName());
	}
	
	/**일본어 비콘 데이터에 네임 프로퍼티 주입*/
	private String beaconNameJpProperties(Beacon beacon){
		return (String)locationNameJpProperties.get(beacon.getRegionName());
	}
	
	/**streaming url*/
	private String getStreamingUrlProperties(String locationName){
		return (String)streamingUrlProperties.get(locationName);
	}
	
	
}
