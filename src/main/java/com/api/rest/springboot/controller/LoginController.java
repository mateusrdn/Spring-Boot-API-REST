package com.api.rest.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.springboot.model.Usuario;
import com.api.rest.springboot.repository.UsuarioRepository;

@RestController
@RequestMapping("/user")
public class LoginController {

	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UsuarioRepository repository;
	
	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {
		usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
		return repository.save(usuario);
	}
}
