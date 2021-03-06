package com.ola.insta.rest.model;

public class CabAvailibilityResponse {

	private String cabId;
	private Double lat;
	private Double lon;
	private Integer bookingsToday;
	private Long eta;

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Long getEta() {
		return eta;
	}

	public void setEta(Long eta) {
		this.eta = eta;
	}

	public Integer getBookingsToday() {
		return bookingsToday;
	}

	public void setBookingsToday(Integer bookingsToday) {
		this.bookingsToday = bookingsToday;
	}

	public String getCabId() {
		return cabId;
	}

	public void setCabId(String cabId) {
		this.cabId = cabId;
	}
}
