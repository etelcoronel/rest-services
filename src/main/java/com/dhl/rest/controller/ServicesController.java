package com.dhl.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.dhl.rest.config.interceptor.ResponseMessage;

public class ServicesController <T> {
	
	public ResponseMessage<T> getResponse (List<T> lista) {
		ResponseMessage<T> r = new ResponseMessage<T> ( new Date(), "its ok", "its ok",HttpStatus.OK.toString(), 1, lista);		
		return r;
	}

}
