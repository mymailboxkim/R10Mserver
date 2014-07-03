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
	@Value("#{locationDetailKoProperties}") Map<String, String> locationDetailKoProperties;
	@Value("#{locationDetailEnProperties}") Map<String, String> locationDetailEnProperties;
	@Value("#{locationDetailJaProperties}") Map<String, String> locationDetailJaProperties;
	
	@Value("#{locationNameEnProperties}") Map<String, String> locationNameEnProperties;
	@Value("#{locationNameJaProperties}") Map<String, String> locationNameJaProperties;
	
	@Value("#{beaconDetailKoProperties}") Map<String, String> beaconDetailKoProperties;
	@Value("#{beaconDetailEnProperties}") Map<String, String> beaconDetailEnProperties;
	@Value("#{beaconDetailJaProperties}") Map<String, String> beaconDetailJaProperties;
	
	/**스트리밍 프로퍼티 세팅*/
	@Value("#{locationStreamingUrlKoProperties}") Map<String, String> locationStreamingUrlKoProperties;
	@Value("#{locationStreamingUrlEnProperties}") Map<String, String> locationStreamingUrlEnProperties;
	@Value("#{locationStreamingUrlJaProperties}") Map<String, String> locationStreamingUrlJaProperties;
	
	@Value("#{beaconStreamingUrlKoProperties}") Map<String, String> beaconStreamingUrlKoProperties;
	@Value("#{beaconStreamingUrlEnProperties}") Map<String, String> beaconStreamingUrlEnProperties;
	@Value("#{beaconStreamingUrlJaProperties}") Map<String, String> beaconStreamingUrlJaProperties;

	//constructor
	public TourServiceImpl() {
		System.out.println("========== TourServiceImpl Constructor ==========");
	}

	//method
	/**한글 로케이션 데이터 리스트*/
	public List<LocationInfo> getLocationDataKoList(String areaName) {
		//System.out.println(areaName);
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationDetail(locationDetailKoProperties(locationList.get(i)));
			//System.out.println(locationList.get(i).toString());
			
		}
		return locationList;
	}
	
	/**영문 로케이션 데이터 리스트*/
	public List<LocationInfo> getLocationDataEnList(String areaName) {
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationName(locationNameEnProperties(locationList.get(i)));
			locationList.get(i).setLocationDetail(locationDetailEnProperties(locationList.get(i)));
		}
		return locationList;
	}
	
	/**일본어 로케이션 데이터 리스트*/
	public List<LocationInfo> getLocationDataJaList(String areaName) {
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationName(locationNameJaProperties(locationList.get(i)));
			locationList.get(i).setLocationDetail(locationDetailJaProperties(locationList.get(i)));
		}
		return locationList;
	}
	
	/**한글 로케이션 데이터 맵*/
	public Map<String, LocationInfo> getLocationDataKoMap(String areaName) {
		System.out.println("========== JSON map service ==========");
		Map<String, LocationInfo> serverLocationMap = tourDao.getLocationDataMap(areaName);
		Map<String, LocationInfo> locationMap = new HashMap<String, LocationInfo>();
		for (String key : serverLocationMap.keySet()) {
			LocationInfo locationInfo = serverLocationMap.get(key);
			locationInfo.setLocationDetail(locationDetailKoProperties(locationInfo));
			locationMap.put(locationInfo.getLocationName(), locationInfo);
		}
		return locationMap;
	}
	
	/**한글 비콘 지역정보*/
	public Beacon getBeaconDataKo(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionDetail(beaconDetailKoProperties(beaconInfo));
		return beaconInfo;
	}
	
	/**영문 비콘 지역정보*/
	public Beacon getBeaconDataEn(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionName(beaconNameEnProperties(beaconInfo));
		beaconInfo.setRegionDetail(beaconDetailEnProperties(beaconInfo));
		return beaconInfo;
	}
	
	/**일본어 비콘 지역정보*/
	public Beacon getBeaconDataJa(Beacon beacon) {
		Beacon beaconInfo = tourDao.getBeaconRegion(beacon);
		beaconInfo.setRegionName(beaconNameJaProperties(beaconInfo));
		beaconInfo.setRegionDetail(beaconDetailJaProperties(beaconInfo));
		return beaconInfo;
	}

	/**한글 로케이션 스트리밍 서버 url*/
	public String getLocationStremingUrlKo(String locationName){
		return getLocationStreamingUrlKoProperties(locationName);
	}
	
	/**영문 로케이션 스트리밍 서버 url*/
	public String getLocationStremingUrlEn(String locationName){
		return getLocationStreamingUrlEnProperties(locationName);
	}
	
	/**일본어 로케이션 스트리밍 서버 url*/
	public String getLocationStremingUrlJa(String locationName){
		return getLocationStreamingUrlJaProperties(locationName);
	}
	
	/**비콘 스트리밍 서버 url*/
	public String getBeaconStremingUrlKo(String locationName){
		return getBeaconStreamingUrlKoProperties(locationName);
	}
	
	/**비콘 스트리밍 서버 url*/
	public String getBeaconStremingUrlEn(String locationName){
		return getBeaconStreamingUrlEnProperties(locationName);
	}
	
	/**비콘 스트리밍 서버 url*/
	public String getBeaconStremingUrlJa(String locationName){
		return getBeaconStreamingUrlJaProperties(locationName);
	}
	
	
	
	//private method
	//location properties method
	/**한글 로케이션 데이터에 디테일 프로퍼티 주입*/
	private String locationDetailKoProperties(LocationInfo locationInfo){
		return (String)locationDetailKoProperties.get(locationInfo.getLocationName());
	}	
	/**영문 로케이션 데이터에 디테일 프로퍼티 주입*/
	private String locationDetailEnProperties(LocationInfo locationInfo){
		return (String)locationDetailEnProperties.get(locationInfo.getLocationName());
	}	
	/**영문 로케이션 데이터에 네임 프로퍼티 주입*/
	private String locationNameEnProperties(LocationInfo locationInfo){
		return (String)locationNameEnProperties.get(locationInfo.getLocationName());
	}	
	/**일본어 로케이션 데이터에 디테일 프로퍼티 주입*/
	private String locationDetailJaProperties(LocationInfo locationInfo){
		return (String)locationDetailJaProperties.get(locationInfo.getLocationName());
	}	
	/**일본어 로케이션 데이터에 네임 프로퍼티 주입*/
	private String locationNameJaProperties(LocationInfo locationInfo){
		return (String)locationNameJaProperties.get(locationInfo.getLocationName());
	}
	
	//beacon properties method
	/**한글 비콘 데이터에 디테일 프로퍼티 주입*/
	private String beaconDetailKoProperties(Beacon beacon){
		return (String)beaconDetailKoProperties.get(beacon.getRegionName());
	}
	/**영문 비콘 데이터에 디테일 프로퍼티 주입*/
	private String beaconDetailEnProperties(Beacon beacon){
		return (String)beaconDetailEnProperties.get(beacon.getRegionName());
	}
	/**영문 비콘 데이터에 네임 프로퍼티 주입*/
	private String beaconNameEnProperties(Beacon beacon){
		return (String)locationNameEnProperties.get(beacon.getRegionName());
	}
	
	/**일본어 비콘 데이터에 디테일 프로퍼티 주입*/
	private String beaconDetailJaProperties(Beacon beacon){
		return (String)beaconDetailJaProperties.get(beacon.getRegionName());
	}
	/**일본어 비콘 데이터에 네임 프로퍼티 주입*/
	private String beaconNameJaProperties(Beacon beacon){
		return (String)locationNameJaProperties.get(beacon.getRegionName());
	}
	
	//streaming properties method
	/**location streaming url*/
	private String getLocationStreamingUrlKoProperties(String locationName){
		return (String)locationStreamingUrlKoProperties.get(locationName);
	}
	private String getLocationStreamingUrlEnProperties(String locationName){
		return (String)locationStreamingUrlEnProperties.get(locationName);
	}
	private String getLocationStreamingUrlJaProperties(String locationName){
		return (String)locationStreamingUrlJaProperties.get(locationName);
	}
	/**beacon streaming url*/
	private String getBeaconStreamingUrlKoProperties(String locationName){
		return (String)beaconStreamingUrlKoProperties.get(locationName);
	}
	private String getBeaconStreamingUrlEnProperties(String locationName){
		return (String)beaconStreamingUrlEnProperties.get(locationName);
	}
	private String getBeaconStreamingUrlJaProperties(String locationName){
		return (String)beaconStreamingUrlJaProperties.get(locationName);
	}
	
	
}
