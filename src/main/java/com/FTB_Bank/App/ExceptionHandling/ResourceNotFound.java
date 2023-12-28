package com.FTB_Bank.App.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value  = HttpStatus.INTERNAL_SERVER_ERROR)
public class ResourceNotFound extends RuntimeException {

	private String fieldName;
	private String resourceName;
	private long fieldValue;
	
	public ResourceNotFound(String fieldName, String resourceName, long fieldValue) {
		super(String.format("%s not fount with id: 'id'", fieldName, resourceName, fieldValue));
		this.fieldName = fieldName;
		this.resourceName = resourceName;
		this.fieldValue = fieldValue;
		
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getResourceName() {
		return resourceName;
	}

	public long getFieldValue() {
		return fieldValue;
	}
}
