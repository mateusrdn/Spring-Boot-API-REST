package com.api.rest.springboot.controller.dto;

public class TokenDto {

	private String token;
	private String tipo;

	public TokenDto(String token, String tipo) {
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

}
