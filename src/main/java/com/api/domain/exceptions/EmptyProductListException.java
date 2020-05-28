package com.api.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmptyProductListException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7727371629794996791L;

	public EmptyProductListException() {
		super("No se han encontrado productos");
	}
	
}
