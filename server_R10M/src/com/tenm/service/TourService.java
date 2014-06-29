package com.tenm.service;

import java.util.List;
import java.util.Map;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;

public interface TourService {
	
	public List<LocationInfo> getLocationDataList(String areaName, String locale);
	
	public List<LocationInfo> getLocationDataKrList(String areaName);
	
	public List<LocationInfo> getLocationDataEngList(String areaName);
	
	public List<LocationInfo> getLocationDataJpList(String areaName);

	public Map<String, LocationInfo> getLocationDataKrMap(String areaName);
	
	public Beacon getBeaconData(Beacon beacon, String locale);
	
	public Beacon getBeaconDataKr(Beacon beacon);
	
	public Beacon getBeaconDataEng(Beacon beacon);
	
	public Beacon getBeaconDataJp(Beacon beacon);
	
	public String getLocationStremingUrl(String locationName, String locale);
	
	public String getLocationStremingUrlKr(String locationName);
	
	public String getLocationStremingUrlEng(String locationName);
	
	public String getLocationStremingUrlJp(String locationName);
	
	public String getBeaconStremingUrl(String locationName, String locale);
	
	public String getBeaconStremingUrlKr(String locationName);
	
	public String getBeaconStremingUrlEng(String locationName);
	
	public String getBeaconStremingUrlJp(String locationName);
	

}
