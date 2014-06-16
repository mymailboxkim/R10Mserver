package com.tenm.domain;

public class LocationInfo {
	
	private double lat;
	private double lng;
	private double altitude;
	private String locationName;
	private String locationDetail;

	//constructor
	public LocationInfo() {
	}
	public LocationInfo(double lat, double lng, double altitude,
			String locationName, String locationDetail) {
		this.lat = lat;
		this.lng = lng;
		this.altitude = altitude;
		this.locationName = locationName;
		this.locationDetail = locationDetail;
	}

	//getter & setter
	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationDetail() {
		return locationDetail;
	}

	public void setLocationDetail(String locationDetail) {
		this.locationDetail = locationDetail;
	}

	@Override
	public String toString() {
		return "LocationInfo [lat=" + lat + ", lng=" + lng + ", altitude="
				+ altitude + ", locationName=" + locationName
				+ ", locationDetail=" + locationDetail + "]";
	}

}
