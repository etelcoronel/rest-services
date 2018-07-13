package com.dhl.rest.config.interceptor;

import java.util.Date;

public class Server {
	private Date timestamp;
	private String message;
	private String details;
	private String stateServer;
	private int status;	

	public Server(Date timestamp, String message, String details, String statusServer, int status) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.stateServer = statusServer;
		this.status = status;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getStateServer() {
		return stateServer;
	}

	public void setStateServer(String stateServer) {
		this.stateServer = stateServer;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
