package com.tenm.domain;

public class Beacon {
	
	private String regionName;
	private String uuid;
	private int major;
	private int minor;
	
	//constructor
	public Beacon(){
	}
	public Beacon(String uuid, int major, int minor) {
		this.uuid = uuid;
		this.major = major;
		this.minor = minor;
	}

	//getter & setter
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
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
	@Override
	public String toString() {
		return "Beacon [regionName=" + regionName + ", uuid=" + uuid
				+ ", major=" + major + ", minor=" + minor + "]";
	}
	
}
