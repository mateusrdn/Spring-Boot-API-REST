package com.api.rest.springboot.config.security;


import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.api.rest.springboot.model.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	@Value("${jwt.expiration}")
	private String expiration;
	
	@Value("${jwt.secret}")
	private String secret;

	public String gerarToken(Authentication authentication) {
		
		Usuario logado = (Usuario) authentication.getPrincipal();
		Date hoje = new Date();
		Date dataExpiracao = new Date(hoje.getTime() + Long.parseLong(expiration));
		
		return Jwts.builder().setIssuer("String API").setSubject(logado.getId().toString())
				.setIssuedAt(hoje).setExpiration(hoje).signWith(SignatureAlgorithm.HS256, secret).compact();
	}}
