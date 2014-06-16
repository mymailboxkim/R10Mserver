package com.tenm.domain;

public class Beacon {
	
	private String uuid;
	private int major;
	private int minor;
	private String regionName;
	private String regionDetail;
	
	//constructor
	public Beacon(){
	}
	public Beacon(String uuid, int major, int minor) {
		this.uuid = uuid;
		this.major = major;
		this.minor = minor;
	}

	//getter & setter
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public int getMajor() {
		return major;
	}
	public void setMajor(int major) {
		this.major = major;
	}
	public int getMinor() {
		return minor;
	}
	public void setMinor(int minor) {
		this.minor = minor;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getRegionDetail() {
		return regionDetail;
	}
	public void setRegionDetail(String regionDetail) {
		this.regionDetail = regionDetail;
	}
	@Override
	public String toString() {
		return "Beacon [uuid=" + uuid + ", major=" + major + ", minor=" + minor
				+ ", regionName=" + regionName + ", regionDetail="
				+ regionDetail + "]";
	}
	
	
	
}
