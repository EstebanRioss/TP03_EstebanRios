package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {

	@GetMapping("/index")
	public String GetIndex(){
		return "index";
	}
	
}
