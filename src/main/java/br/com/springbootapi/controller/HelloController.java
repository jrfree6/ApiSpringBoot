package br.com.springbootapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody 
	public String Info() {
		return "Sejam Bem Vindo \n Metodos Possiveis: \n Get: /pessoa \n Post: /pessoa";
	}

}
