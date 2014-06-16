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

	/**각종 데이타 프로퍼티 세팅*/
	@Value("#{locationDetailKrProperties}") Map<String, String> locationDetailKrProperties;
	@Value("#{locationDetailEngProperties}") Map<String, String> locationDetailEngProperties;
	@Value("#{locationNameEngProperties}") Map<String, String> locationNameEngProperties;
	@Value("#{streamingUrlProperties}") Map<String, String> streamingUrlProperties;

	//constructor
	public TourServiceImpl() {
		System.out.println("========== TourServiceImpl Constructor ==========");
	}

	//method
	/**한글 로케이션 데이터 리스트*/
	public List getLocationDataKrList(String areaName) {	//전체LocationInfo를 List로 리턴
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationDetail(locationDetailKrProperties(locationList.get(i)));	
		}
		return locationList;
	}
	
	/**영문 로케이션 데이터 리스트*/
	public List getLocationDataEngList(String areaName) {	//전체LocationInfo를 List로 리턴
		List<LocationInfo> locationList = tourDao.getLocationDataList(areaName);
		for (int i = 0; i < locationList.size(); i++) {
			locationList.get(i).setLocationName(locationNameEngProperties(locationList.get(i)));
			locationList.get(i).setLocationDetail(locationDetailEngProperties(locationList.get(i)));
		}
		return locationList;
	}
	
	/**한글 로케이션 데이터 맵*/
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

	/**스트리밍 서버 url*/
	public String getStremingUrl(String locationName){
		return getStreamingUrlProperties(locationName);
	}
	
	/**비콘 지역정보*/
	public LocationInfo getBeaconRegion(Beacon beacon) {
		if(beacon.getUuid().equals("8492E75F-4FD6-469D-B132-043FE94921D8")
				&& beacon.getMajor() == 104
				&& beacon.getMinor() == 51){
			return new LocationInfo(37.497942, 127.027621, 0, "강남역",
					"서울지하철 2호선과 신분당선의 환승역으로 2호선 교대역과 역삼역 사이에 있고,"
					+ " 신분당선의 시종착역이다. 1982년 12월 23일 개업했으며, "
					+ "2011년 10월 28일 신분당선이 확장 개통되었다. "
					+ "강남구의 중심부에 위치하고 있어 강남역으로 명명되었다. "
					+ "우리나라의 전철역 중 가장 붐비는 역 중 하나며, "
					+ "역 주변에 국기원, 국립중앙도서관(학위논문관)및 특허청(서울사무소) 등이 있다. "
					+ "2호선은 서울메트로 소속, 신분당선은 네오트랜스주식회사 소속이며, "
					+ "2호선은 서울특별시 강남구 강남대로 지하 396번지(역삼동 804번지), "
					+ "신분당선은 서울특별시 강남구 강남대로 지하 390번지(역삼동 825번지)에 있다.");
		}else{
			return null;
		}
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
	
	/**스트리밍 url*/
	private String getStreamingUrlProperties(String locationName){
		return (String)streamingUrlProperties.get(locationName);
	}
	
	
}
