package com.commons.beans.beans;

import java.util.Date;


public class PayloadProperties {

	private String idRequest;
	private String url;
	private String payloadRequest;
	private String payloadResponse;
	private Date timeCreated;
	private String ipAddress;
	private String username;
	
	
	
	public String getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(String idRequest) {
		this.idRequest = idRequest;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPayloadRequest() {
		return payloadRequest;
	}
	public void setPayloadRequest(String payloadRequest) {
		this.payloadRequest = payloadRequest;
	}
	public String getPayloadResponse() {
		return payloadResponse;
	}
	public void setPayloadResponse(String payloadResponse) {
		this.payloadResponse = payloadResponse;
	}
	public Date getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
