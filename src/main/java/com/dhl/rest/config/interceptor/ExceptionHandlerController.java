package com.dhl.rest.config.interceptor;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseMessage<Object> requestHandlingNoHandlerFound(Exception ex, WebRequest request) {		
		return  new ResponseMessage<Object>(new Date(), ex.getMessage(), request.getDescription(false),HttpStatus.NOT_FOUND.toString(), 2);
	}

}
