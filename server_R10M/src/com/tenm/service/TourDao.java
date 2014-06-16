package com.tenm.service;

import java.util.List;
import java.util.Map;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;

public interface TourDao {
	
	public List<LocationInfo> getLocationDataList(String areaName);
	
	public Map<String, LocationInfo> getLocationDataMap(String areaName);
	
	public LocationInfo getBeaconRegion(Beacon beacon);
	
}
