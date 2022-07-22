package com.api.rest.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

	@RequestMapping(value = "/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	
	
}
