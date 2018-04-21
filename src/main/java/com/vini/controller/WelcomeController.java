package com.vini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value="/api/welcome", method=RequestMethod.GET)
	public @ResponseBody String welcome() {
		return "Welcome to Spring & Angular";
	}

}
