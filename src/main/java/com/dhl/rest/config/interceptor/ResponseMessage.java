package com.dhl.rest.config.interceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResponseMessage<T> {
	private Server responseServer;
	private List<T> result;

	public ResponseMessage(Date timestamp, String message, String details, String statusServer, int estatus) {
		this.responseServer = new Server(timestamp, message, details, statusServer, estatus);
		this.result = new ArrayList<T>();
	}
	public ResponseMessage(Date timestamp, String message, String details, String statusServer, int estatus, List<T> lista) {
		this.responseServer = new Server(timestamp, message, details, statusServer, estatus);
		this.result = lista;
	}

	public Server getResponseServer() {
		return responseServer;
	}

	public void setResponseServer(Server responseServer) {
		this.responseServer = responseServer;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

}
