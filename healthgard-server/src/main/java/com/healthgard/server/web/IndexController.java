package com.healthgard.server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	/**
	 * Index Page 
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "login";
	}
	
	/**
	 * Trainer Login Page
	 * @return
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	/**
	 * Trainer Infomation New Join Page
	 * @return
	 */
	@GetMapping("/join")
	public String join() {
		return "join";
	}

}
