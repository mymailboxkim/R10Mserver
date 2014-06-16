package com.tenm.service;

import java.util.List;
import java.util.Map;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;

public interface TourService {
	
	public List getLocationDataKrList(String areaName);
	
	public List getLocationDataEngList(String areaName);

	public Map getLocationDataKrMap(String areaName);
	
	public String getStremingUrl(String locationName);
	
	public Beacon getBeaconDataKr(Beacon beacon);
	
	public Beacon getBeaconDataEng(Beacon beacon);

}
