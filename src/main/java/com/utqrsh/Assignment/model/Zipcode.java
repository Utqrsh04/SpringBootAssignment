package com.utqrsh.Assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//simple JPA Entity
@Entity
@Table(name = "zipcodes")
public class Zipcode {

	@Id
	@Column(name = "zip")
	private long zip;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "latitude")
	private int latitude;
	
	@Column(name = "longitude")
	private int longitude;
	
	@Column(name = "timezone")
	private int timezone;
	
	@Column(name = "dst")
	private int dst;
	
	
	
	public Zipcode() {
		super();
	}
	
	public Zipcode(long zip, String city, String state, int latitude, int longitude, int timezone, int dst) {
		super();
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
		this.timezone = timezone;
		this.dst = dst;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getTimezone() {
		return timezone;
	}
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	public int getDst() {
		return dst;
	}
	public void setDst(int dst) {
		this.dst = dst;
	}
	
	
	
}
