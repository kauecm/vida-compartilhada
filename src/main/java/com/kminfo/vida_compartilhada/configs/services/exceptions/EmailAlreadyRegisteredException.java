package com.kminfo.vida_compartilhada.configs.services.exceptions;

public class EmailAlreadyRegisteredException extends RuntimeException {

	public EmailAlreadyRegisteredException() {
		super("Email já cadastrado");
	}
}