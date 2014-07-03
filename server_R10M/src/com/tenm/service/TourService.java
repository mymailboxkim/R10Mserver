package com.tenm.service;

import java.util.List;
import java.util.Map;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;

public interface TourService {
	
	public List<LocationInfo> getLocationDataKoList(String areaName);
	
	public List<LocationInfo> getLocationDataEnList(String areaName);
	
	public List<LocationInfo> getLocationDataJaList(String areaName);

	public Map<String, LocationInfo> getLocationDataKoMap(String areaName);
	
	public Beacon getBeaconDataKo(Beacon beacon);
	
	public Beacon getBeaconDataEn(Beacon beacon);
	
	public Beacon getBeaconDataJa(Beacon beacon);
	
	public String getLocationStremingUrlKo(String locationName);
	
	public String getLocationStremingUrlEn(String locationName);
	
	public String getLocationStremingUrlJa(String locationName);
	
	public String getBeaconStremingUrlKo(String locationName);
	
	public String getBeaconStremingUrlEn(String locationName);
	
	public String getBeaconStremingUrlJa(String locationName);
	

}
