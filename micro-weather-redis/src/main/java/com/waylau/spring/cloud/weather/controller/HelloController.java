package com.waylau.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello Controller.
 * 
* @since 1.0.0 2018年09月13日
 * @author jason Biao
 */
@RestController
public class HelloController {
	
	//@RequestMapping("/hello")
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
