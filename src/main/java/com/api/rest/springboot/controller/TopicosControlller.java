package com.api.rest.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.springboot.model.Curso;
import com.api.rest.springboot.model.Topico;

@RestController
public class TopicosControlller {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> list(){
		Topico topico = new Topico("Dúvida", "Dúvida com Spring",new Curso("Spring", "Programação"));
		
		return Arrays.asList(topico, topico, topico);
	}
	
}
